package com.subscribe.blog.adapter.out.persistence

import com.subscribe.blog.application.domain.model.Blog
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BlogMapperKtTest {

    @Test
    fun `엔티티 변환 시 정상 파싱 동작`() {
        //given
        val blog = Blog(1L, "title", "description", "https://lsj8367.tistory.com/", listOf())

        //when
        val blogEntity = blog.toEntity()

        //then
        assertThat(blogEntity.id).isEqualTo(1L)
        assertThat(blogEntity.title).isEqualTo("title")
        assertThat(blogEntity.description).isEqualTo("description")
        assertThat(blogEntity.uri).isEqualTo("https://lsj8367.tistory.com/")
    }
}
