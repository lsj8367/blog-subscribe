package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog
import com.subscribe.common.core.BaseEntity
import jakarta.persistence.Entity

@Entity
class BlogEntity(
    var title: String,
    var description: String,
    var uri: String
) : BaseEntity() {

    constructor(id: Long?, title: String, description: String, uri: String): this(title, description, uri) {
        this.id = id
        this.title = title
        this.description = description
        this.uri = uri
    }

    fun toDomain(): Blog {
        return Blog(this.id, this.title, this.description, this.uri)
    }

    companion object {
        fun toEntity(blog: Blog): BlogEntity {
            return BlogEntity(blog.id, blog.title, blog.description, blog.uri)
        }
    }
}
