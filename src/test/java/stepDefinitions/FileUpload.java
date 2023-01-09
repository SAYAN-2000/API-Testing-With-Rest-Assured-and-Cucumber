package stepDefinitions;

import org.testng.Assert;

import DynamicPayloads.Payload1;
import Utilities.FrameWorkConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.io.File;

public class FileUpload {
	@Given("Make Call to the API {string} and hit the end-point")
	public void make_call_to_the_api(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Assert.assertEquals(string, FrameWorkConstants.SWAGGER_URI());
	}

	@When("Hit the endpoint for File Upload")
	public void hit_the_endpoint_for_file_upload() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
//		RestAssured.baseURI=FrameWorkConstants.SWAGGER_URI();
//		given().header("Content-Type", "multipart/form-data")
//		.formParam("additionalMetadata", "Image")
//		.multiPart("file",new File("C:\\Users\\hp\\Desktop\\Resume\\download.avif"), "image/avif").when().post(Payload1.Swaggerpayload("2"));
	}

	@Then("Verify if the Statuscode is {string}")
	public void verify_if_the_statuscode_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI=FrameWorkConstants.SWAGGER_URI();
		given().header("Content-Type", "multipart/form-data")
		.formParam("additionalMetadata", "Image")
		.multiPart("file",new File("C:\\Users\\hp\\Desktop\\Resume\\download.avif"), "image/avif")
		.when().post(Payload1.Swaggerpayload("2")) 
		.then().assertThat().statusCode(200);
	}

}
