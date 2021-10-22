package com.example.plugins

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import kotlinx.html.*
import kotlinx.html.stream.appendHTML

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondTextWriter {
                appendHTML().html {
                    body {
                        div {
                            +"Hello world!"
                        }
                    }
                }
            }
        }
    }
}