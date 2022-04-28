package winterHello.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
@Produces(MediaType.TEXT_PLAIN)
public class HelloResource {
    @GET
    @Path("/hello/{id}")
    public String getGreeting(@PathParam("id")String id){

        return "Hello world " + id;
    }
}
