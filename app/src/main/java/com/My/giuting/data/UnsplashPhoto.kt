package com.My.giuting.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id: String,
    val description: String,
    val user: Unsplashuser,
    val urls: Urls
):Parcelable {
}