package test;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import POJO.AddPlacePOJOREQUEST;
import POJO.AddPlacePOJO_RESPONSE;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddPlace {
	AddPlacePOJO_RESPONSE addplace;
	
	
	@Test(enabled=false)
	public void AddPlace() {
		RestAssured.baseURI="https://rahulshettyacademy.com/maps/api/place/add/json";
	 addplace=	given().queryParam("key", "qaclick123").body(PayloadData.getPayloadData()).when().post("/maps/api/place/add/json").then().extract().as(AddPlacePOJO_RESPONSE.class);
	System.out.println(addplace);
	}
	
	@Test
	public void AppPlaceSerialization() throws IOException {
		RestAssured.baseURI="https://rahulshettyacademy.com/maps/api/place/add/json";
	 addplace=	given().queryParam("key", "qaclick123").body(new AddPlacePOJOREQUEST()).when().post("/maps/api/place/add/json").then().log().all().extract().response().as(AddPlacePOJO_RESPONSE.class);
		System.out.println(addplace);
		//Files.readAllBytes(Paths.get(""));
	}
	
}
