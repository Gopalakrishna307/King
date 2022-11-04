package httpBinDynamicCodes;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class PutDelay {

	public static void main(String[] args) {
		baseURI="https://httpbin.org";
		given().contentType(ContentType.HTML)
		.when().put("/delay/4")
		.then().assertThat().statusCode(200)
		.log().all();

	}

}
