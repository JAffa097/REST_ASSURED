package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import POJO.JIRAAddIssuePOJORequest;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.filter.cookie.CookieFilter;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Jira {
	String name;
	String value;
	CookieFilter session = new CookieFilter();
//@BeforeClass
@Test(enabled=false)
public void getupSessionID() {
	RestAssured.baseURI="http://localhost:8080/";
String res=	given().header("content-type", "application/json").body("{ \"username\": \"jpgpgma666\", \"password\": \"JAffa@097\" }").filter(session)
.when().post("rest/auth/1/session").then().extract().response().asString();


JsonPath response=new JsonPath(res);
name=response.getString("session.name");
value=response.getString("session.value");
System.err.println(value);
System.err.println(session.toString());
	
}
@Test(dependsOnMethods = {"getupSessionID"}, enabled=false)
public void createBug() {
	RestAssured.baseURI="http://localhost:8080/rest/api/2/issue/";
	given().header("Content-Type","application/json").body(new JIRAAddIssuePOJORequest()).filter(session).when().post().then().assertThat().statusCode(201).log().body();
	
}
@Test()
public void Library() {
	RestAssured.baseURI="http://216.10.245.166";
given().config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames())).relaxedHTTPSValidation().body("{\r\n"
		+ "\"name\":\"krifdshnareddy\",\r\n"
		+ "\"isbn\":\"bcdxd\",\r\n"
		+ "\"aisle\":\"2df270\",\r\n"
		+ "\"author\":\"krfdishna\"\r\n"
		+ "}").when().post("/Library/Addbook.php").then().log().all();
  
}

}
