package stepDefinition;

import org.junit.runner.RunWith;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;

public class fiestdefinition {

	
	@Given("I navigate {int}")
	public void i_navigate(int asd) {
		System.err.println("base uri");
		System.out.println(asd);
	
	}
	@Given("^I navigate for ? (.*)$")
	public void i_navigate_for_test_case_id(String testcase) {
	    // Write code here that turns the phrase above into concrete actions
	    System.err.println(testcase);
	}
}
