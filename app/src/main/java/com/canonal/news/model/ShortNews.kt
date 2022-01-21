package com.canonal.news.model

import android.graphics.drawable.Drawable

data class ShortNews(
    val title: String,
    val image: Drawable?
) : News(title, image)