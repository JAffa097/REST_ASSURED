package test;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AddPlace {

	
	
	@Test
	public void AddPlace() {
		RestAssured.baseURI="https://rahulshettyacademy.com/maps/api/place/add/json";
	AddPlacePOJO addplace=	given().queryParam("key", "qaclick123").body(PayloadData.getPayloadData()).when().post("/maps/api/place/add/json").as(AddPlacePOJO.class);
	System.out.println(addplace);
	}
}
