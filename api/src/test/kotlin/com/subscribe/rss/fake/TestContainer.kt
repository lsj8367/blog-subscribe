package com.subscribe.rss.fake

import com.subscribe.rss.application.domain.service.RssService
import com.subscribe.rss.application.port.`in`.RssUseCase
import com.subscribe.rss.application.port.out.RssRepository

class TestContainer {
    val rssRepository: RssRepository = FakeRssRepository()
    val rssService: RssUseCase = RssService(this.rssRepository)
}
