package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello()
	{
		String resorse="<?xml version='1.0'?>" + "<hello>Hi Rakshith</hello>" ;
		return resorse;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON()
	{
		String resorse=null;
		return resorse;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML()
	{
		String resorse="<h1>hi hi hit heyyyyy</h1>" ;
		return resorse;
	}
}
