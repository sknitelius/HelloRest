package com.knitelius.hellorest.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.lang.String;

public class HelloControllerClient {

	final String resourceUrl;
	
	public HelloControllerClient(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	
	public String invokeMessage(){
		Client client = ClientBuilder.newBuilder().build();
		WebTarget target = client.target(resourceUrl + "/hello");
		Invocation.Builder builder = target.request();
		Response response = builder.get();
		return response.readEntity(String.class);
	}

}
