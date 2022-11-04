package httpBinDynamicCodes;

import static org.testng.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutDelaywithOutbdd {

	public static void main(String[] args) {
		RequestSpecification req = RestAssured.given();
		Response res = req.put("https://httpbin.org/delay/4");
		String contentType = res.getContentType();
		assertEquals("application/json", contentType);
		System.out.println(contentType);
		int code = res.getStatusCode();
		assertEquals(200, code);
		System.out.println(code);
		ValidatableResponse validate = res.then();
		validate.log().all();

	}

}
