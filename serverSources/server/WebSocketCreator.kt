package kheops.server

import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest
import org.eclipse.jetty.websocket.servlet.ServletUpgradeResponse
import org.eclipse.jetty.websocket.servlet.WebSocketCreator

class WebSocketCreator : WebSocketCreator {
    override fun createWebSocket(req: ServletUpgradeRequest?, resp: ServletUpgradeResponse?): Any {
        return WebSocketHandler()
    }
}