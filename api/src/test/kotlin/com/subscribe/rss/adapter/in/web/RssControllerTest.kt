package com.subscribe.rss.adapter.`in`.web

import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.response.RssCreateResponse
import com.subscribe.rss.fake.TestContainer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class RssControllerTest {

    @Test
    fun `Rss_피드_데이터_생성`() {
        //given
        val rssService = TestContainer().rssService
        val rssController = RssController(rssService)
        val rssCreateRequest = RssCreateRequest("https://github.com/lsj8367")

        //when
        val response = rssController.create(rssCreateRequest)

        //then
        assertThat(response.statusCode).isEqualTo(HttpStatus.CREATED)
        assertThat(response.headers.get("Location")).isEqualTo(listOf("http://localhost:8080"))
        assertThat(response.body).isEqualTo(RssCreateResponse(1L, "https://github.com/lsj8367", true))
    }
}
