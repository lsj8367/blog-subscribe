package com.subscribe.rss.application.domain.model

import com.rometools.rome.io.XmlReader
import java.net.URL

data class RssLinkInfo(
    val id: Long,
    val uri: URL
) {
    fun xmlReader(): XmlReader {
        return XmlReader(this.uri.openStream())
    }
}
