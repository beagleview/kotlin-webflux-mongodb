package com.demo.api.toodemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToodemoApplication

fun main(args: Array<String>) {
    runApplication<ToodemoApplication>(*args)
}
