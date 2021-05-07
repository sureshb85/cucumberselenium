package com.training.cucumber.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/features/" }, glue = {
				"com.training.cucumber.stepdef" }, tags = "@regression and not @smoke", monochrome = true, dryRun = false, plugin = {
						"pretty", "html:target/site/cucumber-report", "json:target/cucumber.json" })
public class TestYoutubeRunner {

}
