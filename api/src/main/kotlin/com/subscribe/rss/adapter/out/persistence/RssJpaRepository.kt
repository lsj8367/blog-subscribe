package com.subscribe.rss.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface RssJpaRepository: JpaRepository<RssEntity, Long> {
}
