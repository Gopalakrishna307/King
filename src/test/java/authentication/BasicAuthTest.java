package authentication;

import static io.restassured.RestAssured.*;
public class BasicAuthTest {

	public static void main(String[] args) {
		baseURI="https://github.com";
		
	given().auth().basic("Gopalakrishna307","Krishna@9502978263")
	.when().get("/login")
	.then().log().all();
	
	}

}
