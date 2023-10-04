package com.My.giuting.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.My.giuting.api.OmdpApi
import androidx.paging.liveData
import com.My.giuting.api.MoreInfoResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OmdpRepository @Inject constructor(
    private val omdpApi: OmdpApi
) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 2,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                UnsplashPagingSource(
                    omdpApi,
                    query
                )
            }
        ).liveData

    suspend fun getMoreInfoResults(imdb:String):MoreInfoResponse {
       return omdpApi.moreInfo(imdbId = imdb)
    }


}