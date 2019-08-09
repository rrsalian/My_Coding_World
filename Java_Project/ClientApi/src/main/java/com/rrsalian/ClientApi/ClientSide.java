package com.rrsalian.ClientApi;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;


public class ClientSide {
	

	private static Client client;
	private static String url = "http://api.hackerearth.com/code/compile/";
	private static String output = null;
		
	public static void main(String[] args) {

	    try {
	        client =ClientBuilder.newClient();

	        
	       
	        
	        WebTarget webTarget = client.target(url).queryParam("client_secret", "8fecef61deff143e4a660e36a433d8c23878f561")
	        		.queryParam("async", 0).queryParam("source", "print('hey')").queryParam("lang", "PYTHON")
	        		.queryParam("time_limit", 5).queryParam("memory_limit", 262144);
	        
	        //JSONObject obj=new JSONObject();


	        Response response = webTarget.request().post(null);

	        // display response
	        String output = response.readEntity(String.class);
	        System.out.println("Output from Server .... ");
	        System.out.println(output + "\n");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}

}
