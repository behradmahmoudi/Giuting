package com.My.giuting.ui.gallary

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.My.giuting.data.Omdp
import com.My.giuting.databinding.ItemUnsplashBinding

class UnsplashPhotoAdapter:PagingDataAdapter<Omdp, PhotoViewHolder>(PHOTO_COMPARATOR) {
    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val currentItem = getItem(position)
        currentItem?.let { holder.bind(it) }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemUnsplashBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PhotoViewHolder(binding)
    }

    companion object {
        private val PHOTO_COMPARATOR = object : DiffUtil.ItemCallback<Omdp>(){
            override fun areItemsTheSame(oldItem: Omdp, newItem: Omdp): Boolean =
                oldItem.Title == newItem.Title

            override fun areContentsTheSame(
                oldItem: Omdp,
                newItem: Omdp
            ): Boolean =
                oldItem == newItem

        }
    }

}