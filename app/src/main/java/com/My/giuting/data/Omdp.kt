package com.My.giuting.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Omdp(
    val Title: String,
    val imdbID: String,
    val Poster: String
):Parcelable {
}