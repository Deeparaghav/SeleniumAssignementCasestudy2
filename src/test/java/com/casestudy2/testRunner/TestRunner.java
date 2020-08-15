package com.casestudy2.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/main/resources/com/casestudy2/feature" }, 
	glue = {"com.casestudy2.steps"}, 
	plugin = { "pretty", "html:tagret/cucumber-html-report",
				"json:tagret/cucumber-json-report" },
		monochrome = true,
		tags= {}
)

public class TestRunner extends AbstractTestNGCucumberTests {
	// this class will not have any code
}