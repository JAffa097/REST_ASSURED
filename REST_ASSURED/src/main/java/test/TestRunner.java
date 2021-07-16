package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature",
				glue = {"stepDefinition"},
		plugin= {"pretty", "html:target/cucumber-Report","json:target/report.json"},
		
		tags="@asdf"
		
		)
public class TestRunner {

}
