package com.example.plugins

import com.example.Asset
import io.ktor.application.*
import io.ktor.html.*
import io.ktor.response.*
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

        /*route(".well-known") {
            get("assetlinks.json") {
                call.respond(
                    listOf(
                        Asset(
                            relation = listOf("delegate_permission/common.handle_all_urls"),
                            target = com.example.Target(
                                namespace = "android_app",
                                packageName = "com.example.twasample",
                                sha256CertFingerprints = listOf(
                                    "05:15:1C:51:5F:A9:80:AA:66:E7:C9:A0:35:A7:95:7D:F8:13:81:C5:E9:4D:6F:66:96:E4:FA:B4:1A:FE:30:3A"
                                )
                            )
                        )
                    )
                )
            }
        }*/
    }
}