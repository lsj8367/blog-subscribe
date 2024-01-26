package com.subscribe.rss.fake

import com.subscribe.rss.application.domain.model.Rss
import com.subscribe.rss.application.port.out.RssRepository

class FakeRssRepository : RssRepository {

    val rssList: MutableList<Rss> = listOf<Rss>().toMutableList()
    var generatedId: Long = 0

    override fun save(rss: Rss): Rss {
        if (rss.id == 0L) {
            generatedId += 1
            val savedRss = Rss(generatedId, rss.uri, rss.activated)
            rssList.add(savedRss)
            return savedRss
        }

        rssList.removeIf{ x -> x.id!! == rss.id }
        rssList.add(rss)
        return rss
    }

    override fun findActivatedRssList(): List<Rss> {
        return rssList.filter { rss -> rss.activated }
            .toList()
    }
}
