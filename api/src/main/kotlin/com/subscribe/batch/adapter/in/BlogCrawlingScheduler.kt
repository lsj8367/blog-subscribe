package com.subscribe.batch.adapter.`in`

import com.subscribe.batch.application.port.out.BlogCrawler
import com.subscribe.blog.application.port.out.BlogRepository
import com.subscribe.rss.application.port.`in`.RssUseCase
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class BlogCrawlingScheduler(
    private val rssUseCase: RssUseCase,
    private val blogCrawler: BlogCrawler,
    private val blogRepository: BlogRepository
) {

    @Scheduled(cron = "30 * * * * *")
    fun crawlingBlogs() {
        val blogList = blogCrawler.doCrawling(rssUseCase.getFeeds())
        println(blogList)



//        blogRepository.save()
    }
}
