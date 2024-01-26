package com.subscribe.rss.application.port.`in`

import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.response.RssCreateResponse
import com.subscribe.rss.application.port.out.response.RssLinkInfo

interface RssUseCase {
    fun save(rssCreate: RssCreateRequest): RssCreateResponse
    fun getFeeds(): List<RssLinkInfo>
}
