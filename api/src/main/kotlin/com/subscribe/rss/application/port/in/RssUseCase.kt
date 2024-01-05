package com.subscribe.rss.application.port.`in`

import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.response.RssCreateResponse

interface RssUseCase {
    fun save(rssCreate: RssCreateRequest): RssCreateResponse
}
