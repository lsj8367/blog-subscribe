package com.subscribe.rss.adapter.out.persistence

import com.subscribe.rss.application.domain.model.Rss
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RssEntityTest {
    @Test
    fun 도메인_객체를_엔티티로_변환한다() {
        //given
        val rss = Rss(1L, "https://github.com/lsj8367", true)

        //when
        val rssEntity = RssEntity.toEntity(rss)

        //then
        assertThat(rssEntity.id).isEqualTo(1L)
        assertThat(rssEntity.uri).isEqualTo("https://github.com/lsj8367")
        assertThat(rssEntity.activated).isEqualTo(true)
    }

    @Test
    fun 엔티티_객체를_도메인으로_변환한다() {
        //given
        val rssEntity = RssEntity(1L, "https://github.com/lsj8367", true)

        //when
        val rss = rssEntity.toDomain()

        //then
        assertThat(rss).isEqualTo(Rss(1L, "https://github.com/lsj8367", true))
    }
}
