package kheops.server

import org.eclipse.jetty.websocket.api.Session
import org.eclipse.jetty.websocket.api.WebSocketAdapter
import java.io.IOException

class WebSocketHandler : WebSocketAdapter() {
    override fun onWebSocketConnect(session: Session?) {
        super.onWebSocketConnect(session)

        when (session) {
            null -> {
            }
            else -> {
                println("Connect: ${session.remoteAddress.address}")
                try {
                    session.remote.sendString("Hello Webbrowser")
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        }
    }

    override fun onWebSocketClose(statusCode: Int, reason: String?) {
        super.onWebSocketClose(statusCode, reason)

        println("Close: statusCode=$statusCode, reason=$reason")
    }

    override fun onWebSocketError(cause: Throwable?) {
        println("Error: ${cause?.message}")
    }

    override fun onWebSocketText(message: String?) {
        println("Message: $message")
    }

    override fun onWebSocketBinary(payload: ByteArray?, offset: Int, len: Int) {
    }
}