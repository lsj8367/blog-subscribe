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



    fun convert(): Blog {
        return Blog(id!!, title, description, uri, listOf())
    }


}
