package org.acme.resteasy;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.NovalModel;
import org.acme.resteasy.model.NovalResModel;
/* Servicio nova */
@Path("/DevOps")
public class NovaWs {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "prueba23";
    }
	
	/* Servicio recibir parametros */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public NovalResModel add(NovalModel nova) {
		NovalResModel respuesta = new NovalResModel();
		respuesta.setMessage("Hello ".concat(nova.getTo().concat(" your message will be send")));
		return respuesta;
    }
}
