package authentication;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class BearTokenwithoutbdd {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "gopalakeishna321");
		
		RequestSpecification req = RestAssured.given();
		req.auth().oauth2("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");
		req.body(obj);
		req.contentType(ContentType.JSON);
		req.when();
		Response res = req.post("https://api.github.com/user/repos");
		ValidatableResponse validate = res.then();
		validate.log().all();
		

	}

}
