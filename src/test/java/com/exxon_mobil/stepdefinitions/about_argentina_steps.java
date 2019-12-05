package com.exxon_mobil.stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.about_argentina_pagefactory;
import com.exxon_mobil.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class about_argentina_steps extends TestBase {

	about_argentina_pagefactory argentina;
	JavascriptExecutor js;

	@Given("^the user navigates to the About Argentina page$")
	public void the_user_navigates_to_the_About_Argentina_page() throws Throwable {
		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/Locations/Argentina/About-Argentina-operations");

	}

	@Then("^the About Argentina page should load$")
	public void the_About_Argentina_page_should_load() throws Throwable {
		argentina = new about_argentina_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "boosted search results did not load properly");


	}

	@Given("^the user navigates to the ES version of the About Argentina page$")
	public void the_user_navigates_to_the_ES_version_of_the_About_Argentina_page() throws Throwable {
		TestBase.initialization();
		driver.get("https://corporate.exxonmobil.com/Locations/Argentina/About-Argentina-operations?content-lang=es");
	}

	@Then("^the ES version of the About Argentina page should load$")
	public void the_ES_version_of_the_About_Argentina_page_should_load() throws Throwable {
		argentina = new about_argentina_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "boosted search results did not load properly");
	}

}
