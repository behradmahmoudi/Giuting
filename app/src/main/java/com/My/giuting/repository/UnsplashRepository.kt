package com.My.giuting.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.My.giuting.api.UnsplashApi
import androidx.paging.liveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UnsplashRepository @Inject constructor(
    private val unsplashApi: UnsplashApi
) {

    fun getSearchResults(query: String) =
        Pager(
            config = PagingConfig(
                pageSize = 10,
                maxSize = 40,
                enablePlaceholders = false
            ),
            pagingSourceFactory = {
                UnsplashPagingSource(
                    unsplashApi,
                    query
                )
            }
        ).liveData
}