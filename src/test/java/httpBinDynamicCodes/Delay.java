package httpBinDynamicCodes;

import static io.restassured.RestAssured.*;

public class Delay {

	public static void main(String[] args) {
		baseURI="https://httpbin.org";
		when().get("/delay/3")
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}

}
