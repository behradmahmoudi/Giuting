package com.My.giuting.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.My.giuting.api.OmdpApi
import com.My.giuting.data.Omdp
import retrofit2.HttpException
import java.io.IOException

private const val OMDP_STARTING_PAGE_INDX = 1

class UnsplashPagingSource(private val omdpApi: OmdpApi,
                           private val query: String): PagingSource<Int, Omdp>() {
    override fun getRefreshKey(state: PagingState<Int, Omdp>): Int? {
        return state.anchorPosition?.let {
                anchorPos ->
            val anchorPage = state.closestPageToPosition(anchorPos)
            anchorPage?.prevKey?.plus(1)?: anchorPage?.nextKey?.minus(1) }


    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Omdp> {
        val position = params.key ?: OMDP_STARTING_PAGE_INDX

        return try {
            val resoponse = omdpApi.searchPhoto(query, position)
            val photos = resoponse.Search

            LoadResult.Page(
                data = photos,
                prevKey = if(position == OMDP_STARTING_PAGE_INDX) null else position - 1,
                nextKey = if(photos.isEmpty()) null else position + 1
            )
        }catch (exception: IOException){
            LoadResult.Error(exception)
        }catch (ex: HttpException){
            LoadResult.Error(ex)
        }

    }

}
