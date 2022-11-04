package authentication;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BarearTokenTest {

	public static void main(String[] args) {
		baseURI="https://api.github.com";
		JSONObject obj=new JSONObject();
		obj.put("name", "project");
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
	}

}
