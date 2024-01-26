package com.subscribe.batch.application.port.out

import com.subscribe.blog.application.domain.model.Blog

interface BlogCrawler {
    fun doCrawling(): List<Blog>
}
