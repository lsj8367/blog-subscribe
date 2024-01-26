package com.subscribe.rss.application.domain.service

import com.subscribe.rss.application.domain.model.Rss
import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.response.RssCreateResponse
import com.subscribe.rss.application.port.out.response.RssLinkInfo
import com.subscribe.rss.fake.FakeRssRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.net.URI

class RssServiceTest {

    @Test
    fun `Rss_피드_저장`() {
        //given
        val rssService = RssService(FakeRssRepository())

        //when
        val savedRss = rssService.save(RssCreateRequest("https://github.com/lsj8367"))

        //then
        assertThat(savedRss).isEqualTo(RssCreateResponse(1L, "https://github.com/lsj8367", true))
    }

    @Test
    fun `RSS_목록_반환`() {
        //given
        val rssRepository = FakeRssRepository()
        val rssService = RssService(rssRepository)
        rssRepository.save(Rss(1L, "https://lsj8367.tistory.com", true))

        //when
        val feeds = rssService.getFeeds()

        //then
        assertThat(feeds).isEqualTo(listOf(RssLinkInfo(1, URI.create("https://lsj8367.tistory.com").toURL())))
    }
}
