package com.example.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", 
		glue = "com.example.stepdefinitions", 
				  tags = "@test",
	    plugin = { "pretty", "html:target/cucumber-reports/cucumber.html",
				             "json:target/cucumber-reports/cucumber.json" })
public class TestRunner {

}
