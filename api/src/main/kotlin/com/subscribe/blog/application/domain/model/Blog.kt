package com.subscribe.blog.application.domain.model

data class Blog(
    val id: Long = 0,
    val title: String,
    val description: String,
    val uri: String,
    val rssId: Long
)
