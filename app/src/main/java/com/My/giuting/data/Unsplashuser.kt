package com.My.giuting.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Unsplashuser(
    val name: String,
    val instagram_username: String

):Parcelable {

}
