package com.subscribe.rss.application.port.out.response

data class RssCreateResponse(
    val id: Long,
    val uri: String,
    val activated: Boolean
)
