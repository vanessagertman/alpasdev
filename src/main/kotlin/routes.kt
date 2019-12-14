package dev.alpas.alpasdev

import dev.alpas.alpasdev.controllers.DocsController
import dev.alpas.alpasdev.controllers.HomeController
import dev.alpas.alpasdev.controllers.WelcomeController
import dev.alpas.auth.authRoutes
import dev.alpas.routing.Router

fun Router.addRoutes() = apply {
    webRoutes()
    this.authRoutes()
}

private fun Router.webRoutes() {
    get("/", HomeController::class).name("welcome")
    get("/docs/<page>", DocsController::class, "show").name("docs.show")
    get("/docs", DocsController::class, "index").name("docs.index")
}
