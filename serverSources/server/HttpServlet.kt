package kheops.server

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class HttpServlet : HttpServlet() {
    private fun serveFile(req: HttpServletRequest?, resp: HttpServletResponse?) =
            serveFile("/static/${req!!.requestURI!!}", resp)

    private fun serveFile(path: String, resp: HttpServletResponse?) =
            resp!!.outputStream!!.print(
                    javaClass.getResourceAsStream(path)
                            .reader().use { it.readText() })

    private fun redirect(resp: HttpServletResponse?) =
            resp!!.sendRedirect("/")

    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        try {
            req!!.requestURI.let { path ->
                when (path) {
                    null -> redirect(resp)
                    "/" -> serveFile("/static/index.html", resp)
                    else -> {
                        resp?.contentType = "text/plain"
                        serveFile(req, resp)
                    }
                }
            }
        } catch (e: NullPointerException) {
            redirect(resp)
        }
    }
}