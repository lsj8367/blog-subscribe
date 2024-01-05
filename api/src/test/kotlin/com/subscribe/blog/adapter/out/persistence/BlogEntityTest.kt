package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BlogEntityTest {

    @Test
    fun `엔티티를_만든다`() {
        //when
        val entity = BlogEntity.toEntity(Blog(1L, "제목", "내용", "https://lsj8367.tistory.com"))

        //then
        assertThat(entity.id).isEqualTo(1L)
        assertThat(entity.title).isEqualTo("제목")
        assertThat(entity.description).isEqualTo("내용")
        assertThat(entity.uri).isEqualTo("https://lsj8367.tistory.com")
    }

    @Test
    fun `엔티티_를_도메인_으로_변환한다`() {
        //given
        val blogEntity = BlogEntity(1L, "title", "description", "https://lsj8367.tistory.com")

        //when
        val blog = blogEntity.toDomain()

        //then
        assertThat(blog).isEqualTo(Blog(1L, "title", "description", "https://lsj8367.tistory.com"))
    }
}
