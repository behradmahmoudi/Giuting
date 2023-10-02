package com.My.giuting.ui.gallary

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.My.giuting.R
import com.My.giuting.databinding.FragmentGalleryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GalleryFragment : Fragment(R.layout.fragment_gallery) {
    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<GalleryViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGalleryBinding.bind(view)
        val adapter = UnsplashPhotoAdapter()
        binding.apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.adapter = adapter
        }
        viewModel.photos.observe(viewLifecycleOwner){
            adapter.submitData(viewLifecycleOwner.lifecycle,it)
        }

    }
}