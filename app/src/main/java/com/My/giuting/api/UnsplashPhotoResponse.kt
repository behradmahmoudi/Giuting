package com.My.giuting.api

import com.My.giuting.data.UnsplashPhoto

data class UnsplashPhotoResponse(
    val results: List<UnsplashPhoto>
) {
}