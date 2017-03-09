package com.knitelius.hellorest.rest;


import org.junit.BeforeClass;
import org.junit.Test;


public class HelloRestControllerTest {

	private static String url;
	
	@BeforeClass
	public static void beforeClass() {
		url = System.getProperty("url") != null ? System.getProperty("url") : "http://localhost:9080/hellorest";
		System.out.println(String.format("url: %s", url)); 
	}
	
	@Test
	public void test() {
		//TODO
	}

}
