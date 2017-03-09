package com.knitelius.hellorest.rest;


import org.junit.BeforeClass;
import org.junit.Test;


public class HelloRestControllerTest {

	private static String url;
	
	@BeforeClass
	public static void beforeClass() {
		url = System.getProperty("url") != null ? System.getProperty("url") : "http://localhost:9080/hellorest";
	}
	
	@Test
	public void test() {
		//TODO
	}

}
