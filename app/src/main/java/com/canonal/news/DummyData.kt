package com.canonal.news

import android.content.Context
import androidx.core.content.ContextCompat
import com.canonal.news.model.LargeNews
import com.canonal.news.model.News
import com.canonal.news.model.ShortNews

object DummyData {
    fun getDummyData(context: Context): List<News> {
        val newsList = arrayListOf<News>()

        val largeNews1 = LargeNews(
            "Large News Title 1",
            ContextCompat.getDrawable(context, R.drawable.android_large_news_icon),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )
        val shortNews1 = ShortNews(
            "Short News Title 1",
            ContextCompat.getDrawable(context, R.drawable.android_short_news_icon),
            "23.01.2022"
        )
        val shortNews2 = ShortNews(
            "Short News Title 2",
            ContextCompat.getDrawable(context, R.drawable.android_short_news_icon),
            "22.01.2022"
        )
        val largeNews2 = LargeNews(
            "Large News Title 2",
            ContextCompat.getDrawable(context, R.drawable.android_large_news_icon),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )
        val shortNews3 = ShortNews(
            "Short News Title 3",
            ContextCompat.getDrawable(context, R.drawable.android_short_news_icon),
            "21.01.2022"
        )
        val shortNews4 = ShortNews(
            "Short News Title 4",
            ContextCompat.getDrawable(context, R.drawable.android_short_news_icon),
            "20.01.2022"
        )
        val largeNews3 = LargeNews(
            "Large News Title 3",
            ContextCompat.getDrawable(context, R.drawable.android_large_news_icon),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                    "Ut bibendum enim sit amet commodo ornare. Morbi sit amet urna felis."
        )

        newsList.add(largeNews1)
        newsList.add(shortNews1)
        newsList.add(shortNews2)
        newsList.add(largeNews2)
        newsList.add(shortNews3)
        newsList.add(shortNews4)
        newsList.add(largeNews3)
        return newsList

    }
}