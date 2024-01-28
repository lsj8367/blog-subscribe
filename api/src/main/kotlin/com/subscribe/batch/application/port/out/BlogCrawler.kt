package com.subscribe.batch.application.port.out

import com.subscribe.blog.application.domain.model.Blog
import com.subscribe.rss.application.domain.model.RssLinkInfo

interface BlogCrawler {
    fun doCrawling(feeds: List<RssLinkInfo>): List<Blog>
}
