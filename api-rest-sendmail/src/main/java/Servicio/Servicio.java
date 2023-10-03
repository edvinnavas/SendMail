package Servicio;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("servicio")
public class Servicio {

    @GET
    @Path("get-it")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
    @Path("send-mail")
    @Produces(MediaType.TEXT_PLAIN)
    public String send_mail() {
        return "Envío de correo!!!";
    }
    
}
