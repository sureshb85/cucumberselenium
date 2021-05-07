package com.training.cucumber.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/features/YoutubeScenarioOutline.feature" }, glue = {
				"com.training.cucumber.stepdef" }, tags = "@outline", monochrome = true, dryRun = false, plugin = {
						"pretty", "html:target/site/cucumber-report", "json:target/cucumber.json" })
public class TestYoutubeScenarioOutlineRunner {

}
