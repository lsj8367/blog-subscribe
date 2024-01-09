package com.subscribe.rss.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface RssJpaRepository: JpaRepository<RssEntity, Long> {
    fun findAllByActivated(activated: Boolean): List<RssEntity>
}
