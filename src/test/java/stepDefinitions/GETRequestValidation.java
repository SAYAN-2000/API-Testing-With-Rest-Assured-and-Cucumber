package stepDefinitions;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured.*;
import java.util.*;

import org.junit.Assert;

import Utilities.FrameWorkConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;


public class GETRequestValidation {
	
	@Given("Give call to the API as {string}")
	public void give_call_to_the_api_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI=string;
		Assert.assertEquals(string, FrameWorkConstants.GET_URI());
	}

	@Then("Validate the Response if its {int}")
	public void validate_the_response_if_its(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI=FrameWorkConstants.GET_URI();
		given().log().all().when().get().then().assertThat().statusCode(int1);
	}
	@Given("Request a call to the API {string}")
	public void request_a_call_to_the_api(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		RestAssured.baseURI=string;
		Assert.assertEquals(string, FrameWorkConstants.GET_URI());
	}

	@Then("Validate the ChartName if its {string}")
	public void validate_the_chart_name_if_its(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		RestAssured.baseURI=FrameWorkConstants.GET_URI();
		 given().when().get().then()
				.assertThat().body("chartName",equalTo(string))
				.header("Content-Type", "application/javascript").log().all();
	}


}
