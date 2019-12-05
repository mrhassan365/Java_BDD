package com.exxon_mobil.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.topic_page_news_releases_pagefactory;
import com.exxon_mobil.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class topic_page_news_releases_steps extends TestBase {

	topic_page_news_releases_pagefactory news_releases;
	JavascriptExecutor js;

	@Given("^the user navigates to the News Releases topic page$")
	public void the_user_navigates_to_the_News_Releases_topic_page() throws Throwable {

		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/News/Newsroom/News-releases");

	}

	@Then("^the News Releases topic page should load$")
	public void the_News_Releases_topic_page_should_load() throws Throwable {
		news_releases = new topic_page_news_releases_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "boosted search results did not load properly");
		String title = driver.getTitle();
		System.out.println(title);

	}

	@Then("^user clicks on Load more button to see more News Releases articles")
	public void user_clicks_on_Load_more_button() throws Throwable {
		news_releases = new topic_page_news_releases_pagefactory();
		int before_click = news_releases.news_releases_articles.size();
		news_releases.load_more_button.click();
		int after_click = news_releases.news_releases_articles.size();
		if (after_click > before_click) {
			Assert.assertTrue(true, "News Releases page: upon clicking on Load More button more articles didn't load");
		}

	}

}
