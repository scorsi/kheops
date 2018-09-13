package kheops.server

import org.eclipse.jetty.http.pathmap.ServletPathSpec
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.ServerConnector
import org.eclipse.jetty.server.handler.HandlerList
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.eclipse.jetty.util.thread.QueuedThreadPool
import org.eclipse.jetty.websocket.server.WebSocketUpgradeFilter

class Server {
    fun start(port: Int) {
        Server(QueuedThreadPool(100, 10, 120)).apply {
            addConnector(ServerConnector(this).apply {
                this.port = port
            })
            handler = HandlerList().apply {
                handlers = arrayOf(
                        ServletContextHandler(ServletContextHandler.SESSIONS).apply {
                            contextPath = "/"
                            addServlet(ServletHolder("http", HttpServlet::class.java), "/")
                        }.also { context ->
                            WebSocketUpgradeFilter
                                    .configureContext(context)
                                    .addMapping(ServletPathSpec("/"), WebSocketCreator())
                        }
                )
            }

            try {
                start()
                dump(System.err)
                join()
            } catch (e: Throwable) {
                e.printStackTrace()
            }
        }
    }
}