package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog

fun Blog.toEntity(): BlogEntity {
    return BlogEntity(this.id, this.title, this.description, this.uri)
}

fun BlogEntity.toDomain(): Blog {
    return Blog(this.id, this.title, this.description, this.uri)
}
