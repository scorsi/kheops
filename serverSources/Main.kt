package kheops

import kheops.server.Server

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        Server().start(8080)
    }
}
