package zon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bereken")
public class Bereken {

	ZonnepaneelImpl zon = new ZonnepaneelImpl();

	@GET
	@Path("/kWh/{zonkracht}/{zonhoek}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response berekenkWh(@PathParam("zonkracht") double zonkracht, @PathParam("zonhoek") double zonhoek) {
		if (zonhoek >= 360 || zonkracht < 0 || zonhoek < 0) {
			return Response.status(404)
					.entity("Error, zonhoek mag niet groter zijn dan 360 en zonhoek/zonkracht mag niet een kleinere waarde hebben dan 0")
					.build();
		}
		double kWh = zon.getkWh(zonkracht, zonhoek);

		return Response.status(200).entity(kWh).build();
	}

	@GET
	@Path("/zonkracht/{kWh}/{zonhoek}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response berekenZonkracht(@PathParam("kWh") double kWh, @PathParam("zonhoek") double zonhoek) {
		if (zonhoek >= 360 || zonhoek < 0 || kWh < 0) {
			return Response.status(404)
					.entity("Error, zonhoek mag niet groter zijn dan 360 en zonhoek/kWh mag niet een kleinere waarde hebben dan 0")
					.build();
		}

		double zonkracht = zon.getZonkracht(kWh, zonhoek);

		return Response.status(200).entity(zonkracht).build();
	}

	@GET
	@Path("/zonhoek/{kWh}/{zonkracht}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response berekenZonhoek(@PathParam("kWh") double kWh, @PathParam("zonkracht") double zonkracht) {
		if (kWh < 0 || zonkracht < 0) {
			return Response.status(404).entity("Zonkracht/kWh mag niet een kleinere waarde hebben dan 0").build();
		}
		double zonhoek = zon.getZonhoek(kWh, zonkracht);

		return Response.status(200).entity(zonhoek).build();
	}

}
