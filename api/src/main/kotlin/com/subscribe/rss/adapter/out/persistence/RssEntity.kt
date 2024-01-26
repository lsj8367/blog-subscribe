package com.subscribe.rss.adapter.out.persistence

import com.subscribe.common.core.BaseEntity
import com.subscribe.rss.application.domain.model.Rss
import jakarta.persistence.Entity

@Entity(name = "rss")
class RssEntity(
    var uri: String,
    var activated: Boolean
): BaseEntity() {

    constructor(id: Long, uri: String, activated: Boolean) : this(uri, activated) {
        this.id = id
        this.uri = uri
        this.activated = activated
    }

    fun toDomain(): Rss {
        return Rss(id, uri, activated)
    }

    companion object {
        fun toEntity(rss: Rss): RssEntity {
            return RssEntity(rss.id, rss.uri, rss.activated)
        }
    }
}
