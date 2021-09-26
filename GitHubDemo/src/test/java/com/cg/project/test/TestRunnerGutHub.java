package com.cg.project.test;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "features" , glue = "com.cg.project.stepdefs")
public class TestRunerGitHub {
}


