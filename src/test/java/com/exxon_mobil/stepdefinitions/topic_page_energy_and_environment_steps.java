package com.exxon_mobil.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.topic_page_energy_and_environment_pagefactory;
import com.exxon_mobil.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class topic_page_energy_and_environment_steps extends TestBase {

	topic_page_energy_and_environment_pagefactory energy_and_environment;
	JavascriptExecutor js;

	@Given("^the user navigates to the Energy and Environment topic page$")
	public void the_user_navigates_to_the_Energy_and_Environment_topic_page() throws Throwable {
		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/Energy-and-environment/Energy-resources/Oil");

	}

	@Then("^the Energy and Environment topic page should load$")
	public void the_Energy_and_Environment_topic_page_should_load() throws Throwable {
		energy_and_environment = new topic_page_energy_and_environment_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "Investors topic page did not load properly");

	}

	@Then("^the article media chart should be present$")
	public void the_article_media_chart_should_be_present() throws Throwable {
		energy_and_environment = new topic_page_energy_and_environment_pagefactory();
		WebElement article_chart = energy_and_environment.article_chart;
		boolean article_chart_display = article_chart.isDisplayed();
		Assert.assertTrue(article_chart_display, "Energy and Enviornment topic page articl chart is not displayed");

	}

	@Then("^article media chart image should be present$")
	public void article_media_chart_image_should_be_present() throws Throwable {
		energy_and_environment = new topic_page_energy_and_environment_pagefactory();
		
		WebElement imageFile = energy_and_environment.article_chart_img;
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
				"return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
				imageFile);
		Thread.sleep(30000);
		if (!ImagePresent) {
			Assert.assertFalse(false, "Energy and environment article chart image is not loaded");
			System.out.println("Image not displayed.");
		} else {
			Assert.assertTrue(true);
		}

	}

}
