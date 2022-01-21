package com.canonal.news.adapter

import androidx.recyclerview.widget.RecyclerView
import com.canonal.news.databinding.ItemShortNewsBinding
import com.canonal.news.model.ShortNews

class ShortNewsViewHolder(
    private val binding: ItemShortNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(shortNews: ShortNews) {
        binding.shortNews = shortNews
    }
}