package com.subscribe.blog.application.port.out

import com.subscribe.blog.application.domain.model.Blog

interface BlogRepository {
    fun save(blog: Blog): Blog
}
