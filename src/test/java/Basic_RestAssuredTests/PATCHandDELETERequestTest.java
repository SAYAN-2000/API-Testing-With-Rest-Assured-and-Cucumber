package Basic_RestAssuredTests;

import org.testng.annotations.Test;

import DynamicPayloads.Payload1;
import Utilities.FrameWorkConstants;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

public class PATCHandDELETERequestTest {

	@SuppressWarnings("rawtypes")
	HashMap map = new HashMap();
	@SuppressWarnings("unchecked")
	public void PatchData() {
		map.put("name", "Sayan");
		map.put("job", "SE");
		
	}
	@Test
	public void PatchRequestCheck() {
		RestAssured.baseURI= FrameWorkConstants.PATCH_URI();
		given().header("Content-Type", "application/json").body(map)
		.when().patch("/api/users/"+Payload1.getpayload("2")).then()
		.assertThat().statusCode(200).and().body("name", equalTo(map.get("name"))).and()
		.body("job", equalTo(map.get("job")))
		.log().all();
	}
	
	@Test
	public void DeleteRequestCheck() {
		RestAssured.baseURI=FrameWorkConstants.DELETE_URI();
		given().header("Content-Type", "application/json").body(map)
		.when().delete("/api/users/"+Payload1.getpayload("2")).then()
		.assertThat().statusCode(204)
		.log().all();
	}
	
	
	
	
	
	
}
