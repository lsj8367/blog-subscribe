package com.subscribe.blog.adapter.out.persistence

import org.springframework.data.jpa.repository.JpaRepository

interface BlogJpaRepository: JpaRepository<BlogEntity, Long> {
}
