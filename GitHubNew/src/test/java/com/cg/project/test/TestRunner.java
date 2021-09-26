package com.cg.project.test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)	
@CucumberOptions (features = {"Features"} , glue = { "com.cg.project.stepdefs"},
					plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
					//plugin = "html:Reports/GitHubReports.html")
					//plugin = "json:Reports/GitHubReports.json")
					//plugin = "junit:Reports/GitHubReports.junit")
public class TestRunner {
}

