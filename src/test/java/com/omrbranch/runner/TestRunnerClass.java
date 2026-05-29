package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, snippets = SnippetType.CAMELCASE, stepNotifications = true, publish = true, monochrome = true, plugin = {
	    "pretty", "json:target\\output.json" }, name = {
"Login with valid credentials" }, glue = "com.omrbranch.stepdefinition",features = "src\\test\\resources\\")
public class TestRunnerClass {
	@AfterClass
	  public static void afterClass() {
	    Reporting.generateJvmReport("C:\\Users\\HP\\eclipse-workspace\\CucumberClass\\target\\output.json");
	}

}
