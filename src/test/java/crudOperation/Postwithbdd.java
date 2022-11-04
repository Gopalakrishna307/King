package crudOperation;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Postwithbdd {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "Gopal");
		obj.put("job", "HR");
		
		given()
		.contentType(ContentType.JSON)
		.body(obj)
		.when()
		.post("https://reqres.in/api/users")
		
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
		

	}

}
