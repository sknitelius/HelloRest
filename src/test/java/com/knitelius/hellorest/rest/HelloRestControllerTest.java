package com.knitelius.hellorest.rest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.knitelius.hellorest.rest.client.HelloRestControllerClient;

public class HelloRestControllerTest {

	private static String url;

	@BeforeClass
	public static void beforeClass() {
		url = System.getProperty("url") != null ? System.getProperty("url") : "http://localhost:9080/hellorest";
		System.out.println(String.format("url: %s", url));
	}

	@Test
	public void test() {
		HelloRestControllerClient client = new HelloRestControllerClient(url);
		String returnValue = client.invokeMessages();
		assertEquals("Hello Rest!", returnValue);
	}
	
//	@Test
//	public void testQueryParamn() {
//		HelloRestControllerClient client = new HelloRestControllerClient(url);
//		String message = client.invokeMessage("InterConnect");
//		assertEquals("Hello InterConnect!", message);
//	}

}
