package com.My.giuting.api

import retrofit2.http.Query

interface OmdpApi {

    companion object{

        const val BASE_URL = "http://www.omdbapi.com/"

    }
    suspend fun searchPhoto(
        @Query("s") searchQuery: String,
        @Query("page") page: Int,
        @Query("apikey") apiKey: String = "7fe3d388"
    ): OmdpResponse
}