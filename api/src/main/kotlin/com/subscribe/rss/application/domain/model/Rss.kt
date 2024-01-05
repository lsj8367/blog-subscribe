package com.subscribe.rss.application.domain.model

data class Rss(
    val id: Long = 0,
    val uri: String,
    val activated: Boolean
) {
    constructor(uri: String, activated: Boolean) : this(0, uri, activated)
}
