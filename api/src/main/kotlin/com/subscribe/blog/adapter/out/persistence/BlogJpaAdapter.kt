package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog
import com.subscribe.blog.application.port.out.BlogRepository
import org.springframework.stereotype.Repository

@Repository
class BlogJpaAdapter(
    private val blogJpaRepository: BlogJpaRepository
) : BlogRepository {
    override fun save(blog: Blog): Blog {
        return blogJpaRepository.save(BlogEntity.toEntity(blog))
            .toDomain()
    }
}
