package com.example.plugins

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.routing.*
import kotlinx.html.body
import kotlinx.html.div

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondHtml {
                body {
                    div {
                        +"Hello world!"
                    }
                }
            }
        }
    }
}