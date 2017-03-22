package com.knitelius.hellorest.rest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.knitelius.hellorest.rest.client.HelloControllerClient;

public class HelloControllerTest {

	private static String url;

	@BeforeClass
	public static void beforeClass() {
		url = System.getProperty("url") != null ? System.getProperty("url") : "http://localhost:9080/hellorest";
		System.out.println(String.format("url: %s", url));
	}

	@Test
	public void test() {
		HelloControllerClient client = new HelloControllerClient(url);
		String returnValue = client.invokeMessage("InterConnect");
		assertEquals("Hello InterConnect!", returnValue);
	}

}
