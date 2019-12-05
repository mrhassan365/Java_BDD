package com.exxon_mobil.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.footer_pagefactory;
import com.exxon_mobil.util.TestBase;
import com.exxon_mobil.util.util_methods;

import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class footer_steps extends TestBase {

	footer_pagefactory footer;

	@Then("^all the footer links should be valid$")
	public void all_the_footer_links_should_be_valid() throws Throwable {
		footer = new footer_pagefactory();
		List<WebElement> footer_links = footer.footer_links;
		for (WebElement a : footer_links) {
			int code = util_methods.get_http_status_code(a);

			if (code == 200 || code == 999 || code == 403 || code == 301) {
				Assert.assertTrue(true);
			} else {
				System.out.println(a.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}

		}
	}

	@Then("^user should see all the social sites$")
	public void user_should_see_all_the_social_sites() throws Throwable {
		footer = new footer_pagefactory();
		List<WebElement> footer_social = footer.footer_social_site_links;
		for (WebElement a : footer_social) {
			int code = util_methods.get_http_status_code(a);
			if (code == 200 || code == 999 || code == 403 || code == 301) {
				Assert.assertTrue(true);
			} else {
				System.out.println(a.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}

		}

	}

	@Then("^all the footer brand links should be valid$")
	public void all_the_footer_brand_links_should_be_valid() throws Throwable {
		footer = new footer_pagefactory();
		List<WebElement> footer_brands = footer.footer_brands;
		for (WebElement a : footer_brands) {
			int code = util_methods.get_http_status_code(a);

			if (code == 200 || code == 999 || code == 403 || code == 301) {
				Assert.assertTrue(true);
			} else {
				System.out.println(a.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}

		}

	}

	@Then("^all the footer privacy links should be valid$")
	public void all_the_footer_privacy_links_should_be_valid() throws Throwable {
		footer = new footer_pagefactory();
		List<WebElement> footer_privacy_links = footer.footer_privacy_links;
		for (WebElement a : footer_privacy_links) {
			int code = util_methods.get_http_status_code(a);
			if (code == 200 || code == 999 || code == 403 || code == 301) {
				Assert.assertTrue(true);
			} else {
				System.out.println(a.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}

		}
	}

	@After
	public void quit() {
		driver.quit();
	}

}
