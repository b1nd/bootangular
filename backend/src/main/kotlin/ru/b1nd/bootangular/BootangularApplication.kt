package ru.b1nd.bootangular

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootangularApplication

fun main(args: Array<String>) {
    runApplication<BootangularApplication>(*args)
}
