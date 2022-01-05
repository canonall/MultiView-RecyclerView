package com.canonal.news.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.canonal.news.databinding.ItemLargeNewsBinding
import com.canonal.news.model.LargeNews

class NewsAdapter(
    private val largeNewsList: List<LargeNews>
) : RecyclerView.Adapter<LargeNewsViewHolder>() {

    private lateinit var binding: ItemLargeNewsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LargeNewsViewHolder {
        binding = ItemLargeNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LargeNewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LargeNewsViewHolder, position: Int) {
        val largeNews = largeNewsList[position]
        holder.bind(largeNews)
    }

    override fun getItemCount(): Int = largeNewsList.size

}

