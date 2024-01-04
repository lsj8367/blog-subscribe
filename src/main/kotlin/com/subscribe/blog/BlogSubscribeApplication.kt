package com.subscribe.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogSubscribeApplication

fun main(args: Array<String>) {
    runApplication<BlogSubscribeApplication>(*args)
}
