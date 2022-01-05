package com.canonal.news.adapter

import androidx.recyclerview.widget.RecyclerView
import com.canonal.news.databinding.ItemLargeNewsBinding
import com.canonal.news.model.LargeNews

class LargeNewsViewHolder(
    private val binding: ItemLargeNewsBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(largeNews: LargeNews) {
        binding.largeNews = largeNews
    }
}