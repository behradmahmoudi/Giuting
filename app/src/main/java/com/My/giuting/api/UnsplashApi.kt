package com.My.giuting.api

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    companion object{

        const val BASE_URL = "https://api.unsplash.com/"
        const val CLIENT_ID = "V9HADwSTwJWSArXLrbIRgEn8WWrwuxbnpiOS7aExPz4"

    }





    @Headers("Accept-Version: v1","Authorization: Client-ID $CLIENT_ID")
    @GET("/search/photos")
    suspend fun searchPhoto(
        @Query("query") searchQuery: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): UnsplashPhotoResponse
}