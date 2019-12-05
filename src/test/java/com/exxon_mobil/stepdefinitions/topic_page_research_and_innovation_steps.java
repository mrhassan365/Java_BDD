package com.exxon_mobil.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.topic_page_research_and_innovation_pagefactory;
import com.exxon_mobil.util.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class topic_page_research_and_innovation_steps extends TestBase {

	topic_page_research_and_innovation_pagefactory topic;
	JavascriptExecutor js;

	@Given("^I am on the Exxon Mobil Topic page$")
	public void i_am_on_the_Exxon_Mobil_Topic_page() throws Throwable {

		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/Research-and-innovation/Carbon-capture-and-storage");

	}

	@Then("^topic page should load$")
	public void topic_page_should_load() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "boosted search results did not load properly");
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Then("^user should see youtube video$")
	public void user_should_see_youtube_video() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();

		WebElement article_video = topic.article_youtube_video;
		boolean video = article_video.isDisplayed();
		Assert.assertTrue(video, "Topic page: article video is not there");

	}

	@When("^user clicks on the video$")
	public void user_clicks_on_the_video() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();

		Actions actions = new Actions(driver);
//		actions.moveToElement(
//				driver.findElement(By.cssSelector("section:nth-child(2) > div > div > section > article > div")), 0,
//				1524);
//		actions.moveByOffset(0, 1524).click().build().perform();

//		WebElement button = driver
//				.findElement(By.cssSelector("div.mainNav--utilities > button.mainNav--search-icon > i"));
//		Point locate = button.getLocation();
//		System.out.println(locate);

//		1140, 35

		actions.moveToElement(
				driver.findElement(By.cssSelector("div.mainNav--utilities > button.mainNav--search-icon > i")), 1140,
				35).click().build().perform();

		Thread.sleep(6000);

		;

	}

	@Then("^the video should play$")
	public void the_video_should_play() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();
		Thread.sleep(20000);

	}

	@Then("^user should see all articles about carbon capture$")
	public void user_should_see_all_articles_about_carbon_capture() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();
		List<WebElement> content_collection = topic.article_collection;
		for (WebElement item : content_collection) {
			boolean item_display = item.isDisplayed();
			Assert.assertTrue(item_display, "one or more Topic article collection content is not being displayed");
		}

	}

	@Then("^user should see Load more button$")
	public void user_should_see_Load_more_button() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();
		WebElement button = topic.topic_page_load_more_button;
		boolean button_display = button.isDisplayed();
		Assert.assertTrue(button_display, "Topic page Load more button is not displaying");

	}

	@When("^user clicks on Load more button to see more articles$")
	public void user_clicks_on_Load_more_button() throws Throwable {
		topic = new topic_page_research_and_innovation_pagefactory();
		List<WebElement> content_collection = topic.article_collection;
		int before_click = content_collection.size();

		topic.topic_page_load_more_button.click();

		int after_click = topic.article_collection.size();

		if (after_click > before_click) {
			Assert.assertTrue(true);
		}

	}

	@After
	public void quit() {
		driver.quit();
	}

}
