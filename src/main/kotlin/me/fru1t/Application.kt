package me.fru1t

import io.ktor.server.application.Application
import me.fru1t.plugins.configureRouting
import me.fru1t.plugins.configureSecurity
import me.fru1t.plugins.configureSerialization

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureSecurity()
    configureRouting()
}
