package authentication;

import static io.restassured.RestAssured.*;

public class DigestAuth {

	public static void main(String[] args) {
		baseURI="https://github.com";
		given().auth().digest("Gopalakrishna307", "krishna@9502978263")
		.when().get("/login")
		.then().log().all();
	}

}
