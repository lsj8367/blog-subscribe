package com.subscribe.batch.adapter.out.rome

import com.rometools.rome.feed.synd.SyndFeed
import com.rometools.rome.io.SyndFeedInput
import com.rometools.rome.io.XmlReader
import com.subscribe.batch.application.port.out.BlogCrawler
import com.subscribe.blog.application.domain.model.Blog
import com.subscribe.rss.application.port.`in`.RssUseCase
import com.subscribe.rss.application.port.out.response.RssLinkInfo
import org.jsoup.Jsoup
import org.jsoup.safety.Safelist
import org.springframework.stereotype.Repository
import org.springframework.util.CollectionUtils

@Repository
class BlogRomeAdapter(
    private val rssUseCase: RssUseCase,
    private val syndFeedInput: SyndFeedInput
): BlogCrawler {

    override fun doCrawling(feeds: List<RssLinkInfo>): List<Blog> {
        if (CollectionUtils.isEmpty(feeds)) {
            return emptyList()
        }
        val blogList = mutableListOf<Blog>()

        for (feed in feeds) {
            //TODO thread pool을 사용하여 여러개를 동시에 배치 돌리도록 변경
            val xmlReader = XmlReader(feed.uri.openStream())

            val crawledDatas: SyndFeed = syndFeedInput.build(xmlReader)

            //TODO feed마다 중복된 데이터를 식별해야 한다.
            blogList.addAll(crawledDatas.entries
                .sortedByDescending { entry -> entry.publishedDate }
                .take(5)
                .map { entry -> Blog(0, entry.title, Jsoup.clean(entry.description.value, Safelist.none()), entry.link, feed.id) }
                .toList()
            )
        }

        return blogList
    }
}
