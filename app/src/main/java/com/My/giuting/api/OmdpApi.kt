package com.My.giuting.api

import retrofit2.http.GET
import retrofit2.http.Query

interface OmdpApi {

    companion object{

        const val BASE_URL = "http://www.omdbapi.com/"

    }
    @GET(".")
    suspend fun searchPhoto(
        @Query("s") searchQuery: String,
        @Query("page") page: Int,
        @Query("apikey") apikey: String = "7fe3d388"
    ): OmdpResponse

    @GET(".")
    suspend fun moreInfo(
        @Query("i") imdbId: String,
        @Query("apikey") apikey: String = "7fe3d388"
    ): MoreInfoResponse
}