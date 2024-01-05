package com.subscribe.rss.adapter.`in`.web

import com.subscribe.rss.application.port.`in`.RssUseCase
import com.subscribe.rss.application.port.`in`.request.RssCreateRequest
import com.subscribe.rss.application.port.out.response.RssCreateResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/v1/rss")
class RssController(
    private val rssUseCase: RssUseCase
) {
    @PostMapping
    fun create(@RequestBody rssCreateRequest: RssCreateRequest): ResponseEntity<RssCreateResponse> {
        return ResponseEntity.created(URI.create("http://localhost:8080"))
            .body(rssUseCase.save(rssCreateRequest));
    }
}
