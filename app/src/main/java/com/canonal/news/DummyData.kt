package com.canonal.news

import android.content.Context
import androidx.core.content.ContextCompat
import com.canonal.news.model.LargeNews

object DummyData {
    fun getDummyData(context: Context): List<LargeNews>{
        val largeNews = arrayListOf<LargeNews>()

        val largeNews1 = LargeNews(
            "Large News Title 1",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews2 = LargeNews(
            "Large News Title 2",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews3 = LargeNews(
            "Large News Title 3",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews4 = LargeNews(
            "Large News Title 4",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews5= LargeNews(
            "Large News Title 5",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews6 = LargeNews(
            "Large News Title 6",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )
        val largeNews7 = LargeNews(
            "Large News Title 7",
            ContextCompat.getDrawable(context,R.drawable.android_icon)
        )

        largeNews.add(largeNews1)
        largeNews.add(largeNews2)
        largeNews.add(largeNews3)
        largeNews.add(largeNews4)
        largeNews.add(largeNews5)
        largeNews.add(largeNews6)
        largeNews.add(largeNews7)

        return largeNews

    }
}