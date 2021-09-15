package quarkus

import javax.ws.rs.GET
import javax.ws.rs.Path


@Path("/")
class   MyApp {

    @GET
    fun hello() = "Hello"

}
