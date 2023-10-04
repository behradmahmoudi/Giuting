package com.My.giuting.ui.moreInfo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import androidx.lifecycle.viewModelScope
import com.My.giuting.api.MoreInfoResponse
import com.My.giuting.repository.OmdpRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoreInfoViewModel @Inject constructor(
    private val repository: OmdpRepository):ViewModel() {
    private val _currentMovie = MutableLiveData<MoreInfoResponse>()
    val currentMovie: LiveData<MoreInfoResponse>
        get() = _currentMovie




    fun getMovieDetail(imdbTitle: String) {

        viewModelScope.launch {
            _currentMovie.value = repository.getMoreInfoResults(imdbTitle)

        }
    }




}