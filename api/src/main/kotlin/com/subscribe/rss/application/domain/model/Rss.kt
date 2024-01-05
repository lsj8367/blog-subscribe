package com.subscribe.rss.application.domain.model

data class Rss(
    val id: Long? = null,
    val uri: String,
    val activated: Boolean
) {

}
