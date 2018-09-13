package kheops.server

import org.eclipse.jetty.websocket.servlet.WebSocketServlet
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory

class WebSocketServlet : WebSocketServlet() {
    override fun configure(factory: WebSocketServletFactory?) {
        factory!!.register(WebSocketHandler::class.java)
    }
}