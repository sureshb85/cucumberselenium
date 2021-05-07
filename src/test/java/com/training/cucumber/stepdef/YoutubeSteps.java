package com.training.cucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YoutubeSteps {

	@Given("^User opens chrome brower and launches the url$")
	public void user_opens_chrome_brower_and_launches_the_url() {
		System.out.println("browser: ");
	}

	@When("^User enters the search keyword RRR$")
	public void user_enters_the_search_keyword() {
		System.out.println("Search keyword: ");
	}

	@When("^User clicks on search button$")
	public void user_clicks_on_search_button() {
		System.out.println("Clicking search button");
	}

	@Then("^User should see the search keyword RRR in the title$")
	public void user_should_see_the_search_keyword_in_the_title() {
		System.out.println("Title: ");
	}

	@Given("User opens {string} brower and launches the url")
	public void user_opens_brower_and_launches_the_url(String string) {
		System.out.println("browser: " + string);
	}

	@When("User enters the search keyword {string}")
	public void user_enters_the_search_keyword(String string) {
		System.out.println("search keyword: " + string);
	}

	@Then("User should see the search keyword {string} in the title")
	public void user_should_see_the_search_keyword_in_the_title(String string) {
		System.out.println("title: " + string);
	}
}
