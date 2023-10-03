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
    private var _binding: FragmentMoreInfoBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<MoreInfoViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMoreInfoBinding.bind(view)
    }
}