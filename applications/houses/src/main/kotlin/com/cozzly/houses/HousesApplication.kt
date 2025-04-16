package com.cozzly.houses

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HousesApplication

fun main(args: Array<String>) {
	runApplication<HousesApplication>(*args)
}
