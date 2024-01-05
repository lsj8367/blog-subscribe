package com.subscribe.blog.adapter.out.persistence

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

}
