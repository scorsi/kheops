package kheops.server

import org.eclipse.jetty.websocket.api.WebSocketPolicy
import org.eclipse.jetty.websocket.api.extensions.ExtensionFactory
import org.eclipse.jetty.websocket.servlet.WebSocketCreator
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class WebSocketServletFactory : WebSocketServletFactory {
    override fun setCreator(creator: WebSocketCreator?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun acceptWebSocket(request: HttpServletRequest?, response: HttpServletResponse?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun acceptWebSocket(creator: WebSocketCreator?, request: HttpServletRequest?, response: HttpServletResponse?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isUpgradeRequest(request: HttpServletRequest?, response: HttpServletResponse?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPolicy(): WebSocketPolicy {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCreator(): WebSocketCreator {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun register(websocketPojo: Class<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getExtensionFactory(): ExtensionFactory {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}