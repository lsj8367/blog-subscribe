package com.subscribe.blog.application.domain.model

data class Blog(
    val id: Long? = null,
    val title: String,
    val description: String,
    val uri: String
)
