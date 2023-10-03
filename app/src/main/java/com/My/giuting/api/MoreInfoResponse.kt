package com.My.giuting.api

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MoreInfoResponse(
    val Title: String,
    val Year: String,
    val Runtime: String,
    val Genre: String,
    val Director: String,
    val Actors: String,
    val Plot: String,
):Parcelable {

}
