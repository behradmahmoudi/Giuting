package com.My.giuting.ui.gallary

import androidx.recyclerview.widget.RecyclerView
import com.My.giuting.data.UnsplashPhoto
import com.My.giuting.databinding.ItemUnsplashBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class PhotoViewHolder(private val binding: ItemUnsplashBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(photo: UnsplashPhoto){
        binding.apply {
            titleAnimal.text = photo.user.name

            Glide.with(itemView).load(photo.urls.regular).transition(DrawableTransitionOptions.withCrossFade()).into(animalImageView)
        }

    }

}
