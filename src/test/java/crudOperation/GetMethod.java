package crudOperation;

import static io.restassured.RestAssured.*;

public class GetMethod {

	public static void main(String[] args) {
		baseURI="https://reqres.in";
		when()
		.get("/api/users/4")
		.then()
		.assertThat().statusCode(200)
		.log().all();

	}

}
