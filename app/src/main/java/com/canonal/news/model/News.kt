package com.canonal.news.model

import android.graphics.drawable.Drawable

abstract class News {
    abstract val title: String
    abstract val image: Drawable?
}
