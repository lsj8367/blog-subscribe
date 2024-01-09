package com.subscribe.rss.application.domain.service

import com.subscribe.rss.application.domain.model.Rss
import com.subscribe.rss.application.port.`in`.RssUseCase
import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.RssRepository
import com.subscribe.rss.application.port.out.response.RssCreateResponse
import org.springframework.stereotype.Service
import java.net.URI
import java.net.URL

@Service
class RssService(
    private val rssRepository: RssRepository
): RssUseCase {
    override fun save(rssCreate: RssCreateRequest): RssCreateResponse {
        val save = rssRepository.save(Rss(rssCreate.url, true))
        return RssCreateResponse(save.id, save.uri, save.activated)
    }

    override fun getFeeds(): List<URL> {
        val rssList = rssRepository.findActivatedRssList()
        return rssList.map { rss -> URI.create(rss.uri).toURL() }
            .toList()
    }

}
