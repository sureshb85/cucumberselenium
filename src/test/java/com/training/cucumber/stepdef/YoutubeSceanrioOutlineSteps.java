package com.training.cucumber.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YoutubeSceanrioOutlineSteps {
	WebDriver driver = null;
	BrowserFactory browserFactory = null;

	@Before
	public void setUp() {
		browserFactory = new BrowserFactory();

	}

	@When("^enter the search keyword (.*)$")
	public void enters_the_search_keyword_bahubali(String search_text) {
		System.out.println("search keyword: " + search_text);
		driver.findElement(By.id("search")).sendKeys(search_text);
	}

	@Then("^should see the search keyword (.*) in the title$")
	public void should_see_the_search_keyword_bahubali_in_the_title(String title) {
		System.out.println("title: " + title);
		String actualTitle = driver.getTitle();
		System.out.println("Actual: " + actualTitle + "expected: " + title);

	}

	@Given("^open (.*) brower and launch the url$")
	public void opens_firefox_brower_and_launches_the_url(String browser) {
		System.out.println("browser: " + browser);
		driver = browserFactory.createDriver(browser);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");

	}

	@When("^click on search button$")
	public void user_clicks_on_search_button() {
		System.out.println("Clicking search button");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	}

	@After
	public void closeDriver() {
		driver.quit();
	}
}
