package com.subscribe.rss.adapter.out.persistence

import com.subscribe.rss.application.domain.model.Rss
import com.subscribe.rss.application.port.out.RssRepository
import org.springframework.stereotype.Repository

@Repository
class RssJpaAdapter(
    private val rssJpaRepository: RssJpaRepository
) : RssRepository {
    override fun save(rss: Rss): Rss {
        return rssJpaRepository.save(RssEntity.toEntity(rss)).toDomain()
    }
}
