package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.apache.log4j.Logger;

import business.service.ClassroomService;

@Path("/classrooms")
public class ClassroomPaths {
	
	@Inject
	private ClassroomService service;

	@Path("/getAllRooms")
	@GET
	@Produces({ "application/json" })
	public String getAllMovies() {
		return service.getAllClassrooms();
	}
	
	@Path("/addRoom")
	@POST
	@Produces({ "application/json" })
	public String makeClassroom(String room) {
		return service.makeClassroom(room);
	}

	@Path("/deleteRoom/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClassroom(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}

	public void setService(ClassroomService service) {
		this.service = service;
	}

}
