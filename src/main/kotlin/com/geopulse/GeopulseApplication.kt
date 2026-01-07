package com.geopulse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GeopulseApplication

fun main(args: Array<String>) {
	runApplication<GeopulseApplication>(*args)
}
