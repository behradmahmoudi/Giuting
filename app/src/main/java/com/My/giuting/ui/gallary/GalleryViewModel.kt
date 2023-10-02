package com.My.giuting.ui.gallary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.My.giuting.repository.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
): ViewModel(){

    private val currentQuery = MutableLiveData(DEFAULT_QUERY)
    companion object{
        private const val DEFAULT_QUERY = "cats"
    }

    val photos = currentQuery.switchMap { repository.getSearchResults(it) }
}