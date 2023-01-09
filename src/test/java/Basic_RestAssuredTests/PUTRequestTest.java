package Basic_RestAssuredTests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PUTRequestTest {
	
	public int id=1;
	HashMap map = new HashMap();
	
	//Method to Put Data into a Hashmap to put in the Body
	@BeforeTest
	public void putData()
	{
		
		map.put("id", "1");
		map.put("title", "Iphone 12");
		RestAssured.baseURI="https://dummyjson.com";
		RestAssured.basePath="/products/"+id;
	}

	//Test to Validate Status Code as well as the body whether its updated or not
	@Test
	public void PUTrequestCheck() {
		given().contentType("application/json")
		.body(map).when().put().then().statusCode(200).assertThat().body("title", equalTo("Iphone 12")).log().all();
		
	}
}
