package crudOperation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetRequestTest {
	public static void main(String[] args) {
		RequestSender req = RestAssured.when();
		//req.contentType(ContentType.JSON);
		Response res = req.get("https://reqres.in/api/unknown");
		
		
//		String contentType = res.getContentType();
//		//Assert.assertEquals("application/json", contentType);
//		System.out.println(contentType);
		
		int code = res.getStatusCode();
		Assert.assertEquals(200, code);
		System.out.println(code);
		
//		String completebody = res.prettyPrint();
//		System.out.println(completebody);
		
		ValidatableResponse validate = res.then();
		validate.log().all();
	}

}
