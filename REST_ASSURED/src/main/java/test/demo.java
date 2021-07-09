package test;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class demo {
@Test
public void s() {
	RestAssured.baseURI="https://rahulshettyacademy.com";
	System.out.println(given().queryParam("key", "qaclick123").header("Content-type","application/json")
	.body(PayloadData.getPayloadData()).when().post("maps/api/place/add/json").then().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString());
	

	
;}


}
