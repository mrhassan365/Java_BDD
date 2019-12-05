package com.exxon_mobil.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;

import com.exxon_mobil.pagefactory.header_pagefactory;
import com.exxon_mobil.util.TestBase;
import com.exxon_mobil.util.util_methods;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class header_steps extends TestBase {

	header_pagefactory header;
	Actions action;

	util_methods util;

	@Given("^I am on the Exxon Mobil Home Page$")
	public void i_am_on_the_Exxon_Mobil_Home_Page() throws Throwable {
		TestBase.initialization();
	}

	@Then("^I should see ExxonMobil home promo link$")
	public void i_should_see_ExxonMobil_home_promo_link() throws Throwable {
		header = new header_pagefactory();
		WebElement main_logo = header.Main_nav_logo;
		boolean main_nav_logo_display = main_logo.isDisplayed();
		Assert.assertTrue(main_nav_logo_display, "Main nav logo is not displayed");
	}

	@Then("^on hover each nav displays a subnav$")
	public void on_hover_each_nav_displays_a_subnav() throws Throwable {
		header = new header_pagefactory();
		List<WebElement> header_navs = header.header_navs;
		for (WebElement a : header_navs) {
			action = new Actions(driver);
			action.moveToElement(a).build().perform();
			Assert.assertTrue(a.isDisplayed());
		}

	}

	@Then("^all links in each sub nav should be valid$")
	public void all_links_in_each_sub_nav_should_be_valid() throws Throwable {
		header = new header_pagefactory();
		List<WebElement> header_nav_links = header.header_nav_links;
		for (WebElement a : header_nav_links) {
			int code = util_methods.get_http_status_code(a);
			if (code == 200 || code == 403 || code == 999) {
				Assert.assertTrue(true);
			} else {
				System.out.println(a.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}

		}

	}

// Global Selector steps

	@Then("^user should see the global selector$")
	public void user_should_see_the_global_selector() throws Throwable {
		header = new header_pagefactory();
		Assert.assertTrue(header.GlobalSelector.isDisplayed(), "Global Selector doesn not display");

	}

	@When("^user clicks on the Global selector$")
	public void user_clicks_on_the_Global_selector() throws Throwable {
		header = new header_pagefactory();
		header.GlobalSelector.click();

	}

	@Then("^the global selector overlay should display$")
	public void the_global_selector_overlay_should_display() throws Throwable {
		header = new header_pagefactory();
		Assert.assertTrue(header.GlobalSelectorOverlay.isDisplayed(), "Global selector overlay does not display");

	}

	@When("^user clicks on the x button$")
	public void user_clicks_on_the_x_button() throws Throwable {
		header = new header_pagefactory();
		header.GlobalSelectorOverlayXbutton.click();

	}

	@Then("^the global selector overlay should no longer display$")
	public void the_global_selector_overlay_should_no_longer_display() throws Throwable {
		header = new header_pagefactory();
		Assert.assertFalse(header.GlobalSelectorOverlay.isDisplayed(), "Global selector overlay does not close");

	}

	@After
	public void quit() {
		driver.quit();
	}

}
