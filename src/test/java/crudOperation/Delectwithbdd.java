package crudOperation;

import static io.restassured.RestAssured.*;

public class Delectwithbdd {

	public static void main(String[] args) {
		baseURI="https://reqres.in";
		when()
		.delete("/api/users/4")
		.then()
		.assertThat().statusCode(204)
		.log().all();
	}

}
