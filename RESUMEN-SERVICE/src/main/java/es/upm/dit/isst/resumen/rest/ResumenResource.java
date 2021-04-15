package es.upm.dit.isst.resumen.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//En el enunciado se decia que se importase
//import org.glassfish.jersey.client.ClientConfig;
//import org.glassfish.jersey.jsonp.JsonProcessingFeature;

import es.upm.dit.isst.resumen.dao.ResumenDAOImplementation;
import es.upm.dit.isst.resumen.model.Resumen;


@Path("/resumenes")
public class ResumenResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Resumen> readAll () {
	        return ResumenDAOImplementation.getInstance().readAll();

	}

	@GET
	@Path("author/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Resumen> readAll (@PathParam("id") String id) {
	        return ResumenDAOImplementation.getInstance().readAll(id);

	}	

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Resumen Rnew) throws URISyntaxException {
	    Resumen r = ResumenDAOImplementation.getInstance().create(Rnew);
	    if (r != null) {
	            URI uri = new URI("/RESUMEN-SERVICE/rest/resumenes/" + r.getId());
	            return Response.created(uri).build();
	    }
	    return Response.status(Response.Status.NOT_FOUND).build();
	}

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response read(@PathParam("id") String id) {
        Resumen R = ResumenDAOImplementation.getInstance().read(id);
        if (R == null)
          return Response.status(Response.Status.NOT_FOUND).build();
        return Response.ok(R, MediaType.APPLICATION_JSON).build();
    } 
 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response update(@PathParam("id") String id, Resumen R) {
            System.out.println("Update request for" + id + " " + R.toString());
        Resumen told = ResumenDAOImplementation.getInstance().read(id);
        if ((told == null) || (!(told.getId()==(R.getId())))) //== porque es int
          return Response.notModified().build();
        ResumenDAOImplementation.getInstance().update(R);
        return Response.ok().build();                
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") String  id) {
        Resumen rold = ResumenDAOImplementation.getInstance().read(id);
        if (rold == null)
            return Response.notModified().build();
        ResumenDAOImplementation.getInstance().delete(rold);
        return Response.ok().build();
    }
}
