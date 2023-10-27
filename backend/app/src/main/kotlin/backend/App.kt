/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package backend

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun server() = embeddedServer(factory = Netty, port = 8080) {
    routing {
        get {
            call.respondText("Hello, world!")
        }
    }
}

fun main() {
    server().start(wait = true)
}
