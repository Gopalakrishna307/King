package reqres;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;



public class TcApiTesting {
	@Test(priority = 1)
	public static void getLIst() {
		when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority = 2)
	public static void getSingle() {
		when()
		.get("https://reqres.in/api/users/2")
		.then().statusCode(200)
		.log().all();
	}
	@Test(priority = 3)
	public static void post() {
		HashMap hm=new HashMap();
		hm.put("name", "morpheush");
		hm.put("job","leader");
				
		given()
		.body(hm)
		.contentType(ContentType.JSON)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}
	@Test(priority = 4)
	public static void put() {
		HashMap hm=new HashMap();
		hm.put("name", "morpheus");
		hm.put("job","zion resident");
				
		given()
		.body(hm)
		.contentType(ContentType.XML)
		.when()
		.put("https://reqres.in/api/users/550")
		.then()
		.statusCode(200)
		.log().all();
		System.err.println("hi gopal");
		
	}

}
