package Basic_RestAssuredTests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilities.FrameWorkConstants;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class POSTRequestTest {
	
	@SuppressWarnings("rawtypes")
	public static HashMap map = new HashMap();
	
	@SuppressWarnings("unchecked")
	@BeforeClass
	public void postdata()
	{
		map.put("name", "XyZ");
		map.put("job", "Teacher");
		
	}

	@Test
	public void POSTRequestCheck()
	{
		RestAssured.baseURI =FrameWorkConstants.POST_URI(); 
		given()
		.contentType("application/json")
		.body(map)
		.when().post().then()
		.statusCode(201)
		.and().body("name", equalTo(map.get("name")))
		.and().body("job", equalTo(map.get("job"))).log().all();
	    
	}
	
}
