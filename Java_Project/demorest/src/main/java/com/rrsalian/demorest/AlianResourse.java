package com.rrsalian.demorest;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("alian")
public class AlianResourse {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alian> getAlian() {
		
		System.out.println("loaded...");
		Alian a1=new Alian();
		a1.setName("Rakshith");
		a1.setPoint(100);
		
		Alian a2=new Alian();
		a2.setName("RRS");
		a2.setPoint(90);
		
		List<Alian> al=Arrays.asList(a1,a2);
		
		return al;
		
	}

}
