package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import poojoClass.ProjectLibrary;

public class PostRequestTest {

	public static void main(String[] args) {
//		JSONObject obj=new JSONObject();
//		obj.put( "name","morpheus");
//		obj.put("job", "leader");
		ProjectLibrary pl=new ProjectLibrary();
		//given()
		RequestSpecification req = RestAssured.given();
		req.body(pl);
		req.contentType(ContentType.JSON);
		Response res = req.post("https://reqres.in/api/users");
		
		
		String contentType = res.getContentType();
		Assert.assertEquals("application/json; charset=utf-8", contentType);
		System.out.println(contentType);
		
		
		int code = res.getStatusCode();
		Assert.assertEquals(201, code);
		System.out.println(code);
		
		String completebody = res.prettyPrint();
		System.out.println(completebody);
		
		ValidatableResponse validate = res.then();
		validate.log().all();
		

	}

}
