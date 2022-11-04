package crudOperation;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import junit.framework.Assert;


public class DelectWithOutbdd {

	public static void main(String[] args) {
	 RequestSender req = RestAssured.when();
	 Response res = req.delete("https://reqres.in/api/unknown/3");
	 
	 
//	 String contentType = res.getContentType();
//	 System.out.println(contentType);
	 
	 int code = res.getStatusCode();
		Assert.assertEquals(204, code);
		System.out.println(code);
		
//		String completebody = res.prettyPrint();
//		System.out.println(completebody);
		
		ValidatableResponse validate = res.then();
		validate.log().all();
	 
	 
	 
		

	}

}
