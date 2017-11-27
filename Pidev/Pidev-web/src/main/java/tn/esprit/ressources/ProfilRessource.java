package tn.esprit.ressources;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
/*import javax.faces.bean.RequestScoped;*/
import javax.faces.bean.ViewScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Persistence.Profil;
import Service.ProfilServiceLocal;

@Path("Profils")
@RequestScoped
public class ProfilRessource {

	@EJB
	ProfilServiceLocal pl;

	@GET
	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProfils() {
		return Response.ok().entity(pl.findAll()).build();
	}   
	

	@POST
	
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addProfil(Profil p){
	
		
			pl.add(p);
			return Response.status(Status.CREATED).entity("Profil added").build();
		
    }
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public void deleteEvent(@PathParam("id") int id) {
		Profil p = pl.getPofilByID(id);
		pl.remove(p);
	}
}
