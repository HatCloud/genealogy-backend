package me.hatcloud.genealogy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GenealogyApplication

fun main(args: Array<String>) {
    runApplication<GenealogyApplication>(*args)
}

