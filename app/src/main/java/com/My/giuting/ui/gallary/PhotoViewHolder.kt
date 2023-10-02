package com.My.giuting.ui.gallary

import androidx.recyclerview.widget.RecyclerView
import com.My.giuting.data.Omdp
import com.My.giuting.databinding.ItemUnsplashBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class PhotoViewHolder(private val binding: ItemUnsplashBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(photo: Omdp){
        binding.apply {
            titleAnimal.text = photo.Title

            Glide.with(itemView).load(photo.Poster).transition(DrawableTransitionOptions.withCrossFade()).into(animalImageView)
        }

    }

}
