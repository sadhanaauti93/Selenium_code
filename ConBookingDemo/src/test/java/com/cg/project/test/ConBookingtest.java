package com.cg.project.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions (features = {"Features"} , 
glue ="com.cg.project.stepdefs",
dryRun=false,
monochrome=true,
strict=true,
plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//plugin = "html:Reports/ConBookingReports.html")
//plugin = "json:Reports/ConBookingReports.json")
//plugin = "junit:Reports/ConBoookingReports.junit")
public class ConBookingtest {
}
