package com.My.giuting.ui.moreInfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.My.giuting.R
import com.My.giuting.databinding.FragmentGalleryBinding
import com.My.giuting.databinding.FragmentMoreInfoBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MoreInfoFragment : Fragment(R.layout.fragment_more_info) {
    private val arg: MoreInfoFragmentArgs by navArgs()
    private var _binding: FragmentMoreInfoBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<MoreInfoViewModel>()
    val id = arg.imdbId
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMoreInfoBinding.bind(view)

        viewModel.getMovieDetail(arg.imdbId)
        viewModel.currentMovie.observe(viewLifecycleOwner){
            binding.apply {
                MovieTitle.text = it.Title
                Year.text = it.Year
                Runtime.text = it.Runtime
                Genre.text = it.Genre
                Director.text = it.Director
                Actors.text = it.Actors
                Plot.text = it.Plot

            }
        }

    }
}