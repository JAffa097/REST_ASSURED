package test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import POJO.AddPlacePOJOREQUEST;
import POJO.AddPlacePOJO_RESPONSE;
import POJO.DeletePlacePOJOREQUEST;
import POJO.DeletePlacePOJO_RESPONSE;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class DeletePlace {

	
	@Test
	public void deletePlace() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		DeletePlacePOJO_RESPONSE resp=	given().queryParam("key", "qaclick123").body(new DeletePlacePOJOREQUEST("39e40f288c614005bee0387bbf8e8861")).when().post("/maps/api/place/delete/json").as(DeletePlacePOJO_RESPONSE.class);
		Assert.assertEquals(resp.status, "OK");
	}
}
