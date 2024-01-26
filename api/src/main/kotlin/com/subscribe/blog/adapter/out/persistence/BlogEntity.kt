package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog
import com.subscribe.common.core.BaseEntity
import jakarta.persistence.Entity

@Entity(name = "blog")
class BlogEntity(
    var title: String,
    var description: String,
    var uri: String,
    var rssId: Long
) : BaseEntity() {

    constructor(id: Long, title: String, description: String, uri: String, rssId: Long): this(title, description, uri, rssId) {
        this.id = id
        this.title = title
        this.description = description
        this.uri = uri
        this.rssId = rssId
    }

    fun toDomain(): Blog {
        return Blog(this.id, this.title, this.description, this.uri, this.rssId)
    }

    companion object {
        fun toEntity(blog: Blog): BlogEntity {
            return BlogEntity(blog.id, blog.title, blog.description, blog.uri, blog.rssId)
        }
    }
}
