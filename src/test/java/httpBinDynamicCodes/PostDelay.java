package httpBinDynamicCodes;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PostDelay {

	public static void main(String[] args) {
		baseURI="https://httpbin.org";
		
		
		
		given()
		.contentType(ContentType.JSON)
		
		
		.when().post("/delay/6")
		.then().assertThat().statusCode(200)
		.log().all();

	}

}
