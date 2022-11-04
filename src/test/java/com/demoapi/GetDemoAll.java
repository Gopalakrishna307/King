package com.demoapi;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.information.BaseClass;
import com.base.information.ConstantLibrary;
import com.base.information.EndPoints;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetDemoAll extends BaseClass {
	@Test(priority = 1)
	public void getAll() {
		RestAssured.baseURI=ConstantLibrary.baseURL;
		RequestSpecification req = RestAssured.given();
		Response res = req.get(EndPoints.getAll);
		
		String contentType = res.contentType();
		System.out.println(contentType);
		Assert.assertEquals("application/json", contentType);
		
		int code = res.statusCode();
		System.out.println(code);
		Assert.assertEquals(code, 200);
		
		String line = res.statusLine();
		System.out.println("*****************");
		System.out.println(line);
		ValidatableResponse validate = res.then();
		validate.log().all();
	
	}
	
	@Test(priority = 2)
	public void getSingle() {
		System.out.println("2nd Test");
		
	}
	@Test(priority = 3,enabled = false)
	public void getSingle1() {
		System.out.println("4nd Test");
		
	}
	@Test(priority = 4,invocationCount = 1)
	public void getSingle2() {
		System.out.println("3nd Test");
		
	}
}
