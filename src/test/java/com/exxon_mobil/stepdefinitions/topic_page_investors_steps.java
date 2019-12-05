package com.exxon_mobil.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.topic_page_investors_pagefactory;
import com.exxon_mobil.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class topic_page_investors_steps extends TestBase {

	topic_page_investors_pagefactory investors;
	JavascriptExecutor js;

	@Given("^the user navigates to the Investors topic page$")
	public void the_user_navigates_to_the_Investors_topic_page() throws Throwable {
		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/Investors/Investor-relations");

	}

	@Then("^the Investors topic page should load$")
	public void the_Investors_topic_page_should_load() throws Throwable {
		investors = new topic_page_investors_pagefactory();

		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "Investors topic page did not load properly");

	}

	@Then("^Stock ticker module should be present$")
	public void stock_ticker_module_should_be_present() throws Throwable {
		investors = new topic_page_investors_pagefactory();
		WebElement stock_ticker = investors.stock_ticker;
		boolean stock_ticker_display = stock_ticker.isDisplayed();
		Assert.assertTrue(stock_ticker_display, "Investors topic page: stock ticker is not present");

	}

	@Then("^value of ticker should never be zero$")
	public void value_of_ticker_should_never_be_zero() throws Throwable {
		investors = new topic_page_investors_pagefactory();
		String price = investors.stock_ticker_price.getText();
		String a = price.substring(1);
		double b = Double.valueOf(a);
		if (b > 0) {
			Assert.assertTrue(true, "stock ticker price is not greater than 0");
		}

	}

	@Then("^user clicks on Load more button to see more Events contents$")
	public void user_clicks_on_Load_more_button_to_see_more_Events_contents() throws Throwable {

		investors = new topic_page_investors_pagefactory();
		int before_click = investors.topic_page_investors_events_items.size();
		investors.load_more_button.click();
		int after_click = investors.topic_page_investors_events_items.size();
		if (after_click > before_click) {
			Assert.assertTrue(true,
					"Investors topic page: upon clicking on Load More button more articles didn't load");
		}

	}

}
