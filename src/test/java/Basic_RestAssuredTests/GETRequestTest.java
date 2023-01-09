package Basic_RestAssuredTests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import Utilities.FrameWorkConstants;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class GETRequestTest {

	//Checking Status Code is 200 or not
	@Test
	public void practice_GET_Request()
	{
		RestAssured.baseURI=FrameWorkConstants.GET_URI();
		given().log().all().when().get().then()
		.assertThat().log().all().statusCode(200).extract().response().asString();
		//System.out.println(response);
	}
	//Checking if Chartname is Bitcoin or not
	@Test
	public void CheckforChartName()
	{
		RestAssured.baseURI=FrameWorkConstants.GET_URI();
		 given().when().get().then()
				.assertThat().body("chartName",equalTo("Bitcoin"))
				.header("Content-Type", "application/javascript");

	}
	
}
