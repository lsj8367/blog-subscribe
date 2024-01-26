package com.subscribe.rss.application.port.out.response

import java.net.URL

data class RssLinkInfo(
    val id: Long,
    val uri: URL
)
