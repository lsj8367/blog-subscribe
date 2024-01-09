package com.subscribe.rss.application.port.out

import com.subscribe.rss.application.domain.model.Rss

interface RssRepository {

    fun save(rss: Rss): Rss

    fun findActivatedRssList(): List<Rss>
}
