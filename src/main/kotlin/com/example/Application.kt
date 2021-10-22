package com.example

import com.example.plugins.configureRouting
import io.ktor.application.install
import io.ktor.application.Application
import io.ktor.server.cio.EngineMain
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    install(ContentNegotiation) {
        gson {
            setPrettyPrinting()
            serializeNulls()
        }
    }

    configureRouting()
}