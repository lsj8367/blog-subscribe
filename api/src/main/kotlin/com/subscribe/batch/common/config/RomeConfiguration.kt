package com.subscribe.batch.common.config

import com.rometools.rome.io.SyndFeedInput
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RomeConfiguration {

    @Bean
    fun syndFeedInput(): SyndFeedInput {
        return SyndFeedInput()
    }
}
