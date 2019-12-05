package com.exxon_mobil.stepdefinitions;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.homepage_pagefactory;
import com.exxon_mobil.util.TestBase;
import com.exxon_mobil.util.util_methods;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homepage_steps extends TestBase {

	homepage_pagefactory homepage;
	Actions action;
	JavascriptExecutor js;
	WebDriverWait wait;

	@Given("^the Exxon Mobil Home Page loads$")
	public void the_Exxon_Mobil_Home_Page_loads() throws Throwable {
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "Investors topic page did not load properly");

	}

	// Homepage Hero Module

	@Then("^user should see homepage hero module$")
	public void user_should_see_homepage_hero_module() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module.isDisplayed());

	}

	@Then("^user should see homepage hero module eyebrow$")
	public void user_should_see_homepage_hero_module_eyebrow() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module_eyebrow.isDisplayed());

	}

	@Then("^user should see homepage hero module title$")
	public void user_should_see_homepage_hero_module_title() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module_title.isDisplayed());
	}

	@Then("^user should see homepage hero module title text$")
	public void user_should_see_homepage_hero_module_title_text() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module_title_text.isDisplayed());
	}

	@Then("^user should see homepage hero module CTA$")
	public void user_should_see_homepage_hero_module_CTA() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module_CTA.isDisplayed());
	}

	@Then("^user should see the hompeage hero module controls$")
	public void user_should_see_the_hompeage_hero_module_controls() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.homepage_hero_module_controls.isDisplayed());

	}

	// Trending Module

	@Then("^user should see the Trending module$")
	public void user_should_see_the_Trending_module() throws Throwable {
		homepage = new homepage_pagefactory();
		Assert.assertTrue(homepage.trendingModule.isDisplayed());

	}

	@Then("^each Trending module item should have a title$")
	public void each_Trending_module_item_should_have_a_title() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> titles = homepage.trendingModuleItemTitles;
		int article_count = 0;
		for (WebElement title : titles) {
			if (title.isDisplayed() == true) {
				Assert.assertTrue(true);
				article_count++;
			}else {
				Assert.fail(title + " does not have a title");
			}

		}
		System.out.println("Trending Module content count for: " +driver.getCurrentUrl()+ ": " + article_count);
	}

	@Then("^the title link should be valid$")
	public void the_title_link_should_be_valid() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> titles = homepage.trendingModuleItemTitles;
		for(WebElement title: titles) {
			int code = util_methods.get_http_status_code(title);
			if (code == 200 || code == 403 || code == 999) {
				Assert.assertTrue(true);
			}else {
				System.out.println(title.getAttribute("href") + ": " + code + " does not target a valid link");
				Assert.fail();
			}
		}
		

	}

	@Then("^each item should have a dot$")
	public void each_item_should_have_a_dot() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> dots = homepage.trendingModuleItemdot;
		for(WebElement dot: dots) {
			Assert.assertTrue(dot.isDisplayed(), dot + " does not display");
			
		}

	}

	@Then("^eaxh item should have a date$")
	public void eaxh_item_should_have_a_date() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> dates = homepage.trendingModuleItemdate;
		for(WebElement date: dates) {
			Assert.assertTrue(date.isDisplayed(), date + " does not display");
		}
	}

	// Mission statement module

	@Then("^user should see the mission statement module$")
	public void user_sould_see_the_mission_statement_module() throws Throwable {
		WebElement mission_statement__module = homepage.mission_statement_module;
		boolean module = mission_statement__module.isDisplayed();
		Assert.assertTrue(module, "Mission statement module does not display");

	}

	@Then("^the the mission statement module content should display$")
	public void the_the_mission_statement_module_content_should_display() throws Throwable {
		WebElement mission_statement__module_content = homepage.mission_statement_module_content;
		boolean title = mission_statement__module_content.isDisplayed();

		Assert.assertTrue(title, "Mission statement module: content does not display");

		String text = mission_statement__module_content.getText();
		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Mission statement module: content displays no text");

	}

	@Then("^on first element hover, first tooltip should render$")
	public void on_first_element_hover_tooltip_loads_with_image_content_and_button() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement mission_statement_module_first_hoverable_element = homepage.mission_statement_module_first_hoverable_element;
		action = new Actions(driver);
		action.moveToElement(mission_statement_module_first_hoverable_element).build().perform();
		WebElement mission = homepage.mission_statement;
		String text = mission.getAttribute("class");

		if (text.contains("opacity")) {
			Assert.assertTrue(true);
		}

	}

	@Then("^on second element hover, second tooltip should render$")
	public void on_second_element_hover_tooltip_loads_with_image_content_and_button() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement mission_statement_module_second_hoverable_element = homepage.mission_statement_module_second_hoverable_element;
		action = new Actions(driver);
		action.moveToElement(mission_statement_module_second_hoverable_element).build().perform();
		WebElement mission = homepage.mission_statement;
		String text = mission.getAttribute("class");

		if (text.contains("opacity")) {
			Assert.assertTrue(true);
		}
	}

	@Then("^on third element hover, third tooltip should render$")
	public void on_third_element_hover_tooltip_loads_with_image_content_and_button() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement mission_statement_module_third_hoverable_element = homepage.mission_statement_module_third_hoverable_element;
		action = new Actions(driver);
		action.moveToElement(mission_statement_module_third_hoverable_element).build().perform();
		WebElement mission = homepage.mission_statement;
		String text = mission.getAttribute("class");

		if (text.contains("opacity")) {
			Assert.assertTrue(true);
		}
	}

	// Our Commitment section: 1st grid (Improving energy access)
	@Then("^on hover, the first grid opens$")
	public void on_hover_the_first_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement improving_energy_access = homepage.improving_energy_access;

		action = new Actions(driver);
		action.moveToElement(improving_energy_access).build().perform();

		String actual_grid_state = improving_energy_access.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Improving energy access grid isn't open on hover isn't open upon hover");

	}

	@Then("^first grid item title should be present$")
	public void first_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement first_grid_title = homepage.first_grid_title;

		boolean title = first_grid_title.isDisplayed();
		Assert.assertTrue(title, "Our commitment: first grid title element is not present");

		String title_text = first_grid_title.getText();
		int title_length = title_text.length();
		boolean a = title_length > 1;
		Assert.assertTrue(a, "Our commitment: first grid title text is not present");

	}

	@Then("^first grid item description should be present$")
	public void first_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement first_grid_content = homepage.first_grid_content;

		boolean content = first_grid_content.isDisplayed();
		Assert.assertTrue(content, "Our commitment: first grid content is not present");

		String description_text = first_grid_content.getText();
		int description_length = description_text.length();
		boolean a = description_length > 1;
		Assert.assertTrue(a, "Our commitment: first grid title text is not present");
	}

	@Then("^first grid item link should be present$")
	public void first_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement first_grid_link = homepage.first_grid_link;

		boolean link = first_grid_link.isDisplayed();
		Assert.assertTrue(link, "Our commitment: first grid link is not present");

		String url = util_methods.get_URL_from_link(homepage.fifth_grid_link);
		int url_size = url.length();
		boolean b = url_size > 33;

		Assert.assertTrue(b, "Our Commitment: first grid url is not valid");

	}

	// Our Commitment section: 2nd grid (Improving efficency)

	@Then("^on hover, the second grid opens$")
	public void on_hover_the_second_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement improving_efficiency = homepage.improving_efficiency;
		action = new Actions(driver);
		action.moveToElement(improving_efficiency).build().perform();
		String actual_grid_state = improving_efficiency.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Improving efficiency grid isn't open on hover isn't open upon hover");

	}

	@Then("^second grid item title should be present$")
	public void second_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();

		WebElement second_grid_title = homepage.second_grid_title;
		boolean title = second_grid_title.isDisplayed();
		Assert.assertTrue(title, "Our commitment: second grid title element not present");

		String title_text = second_grid_title.getText();
		int title_length = title_text.length();
		boolean a = title_length > 1;
		Assert.assertTrue(a, "Our commitment: second grid title text is not present");

	}

	@Then("^second grid item description should be present$")
	public void second_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement second_grid_content = homepage.second_grid_content;
		boolean content = second_grid_content.isDisplayed();

		Assert.assertTrue(content, "Our commitment: second grid content is not present");
	}

	@Then("^second grid item link should be present$")
	public void second_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement second_grid_link = homepage.second_grid_link;
		boolean link = second_grid_link.isDisplayed();

		Assert.assertTrue(link, "Our commitment: second grid link is not present");
	}

	// Our Commitment section: 3rd grid (Sustainability)

	@Then("^on hover, the third grid opens$")
	public void on_hover_the_third_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement sustainability = homepage.sustainability;
		action = new Actions(driver);
		action.moveToElement(sustainability).build().perform();
		String actual_grid_state = sustainability.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Sustainability grid isn't open on hover isn't open upon hover");
	}

	@Then("^third grid item title should be present$")
	public void third_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement third_grid_title = homepage.third_grid_title;
		boolean title = third_grid_title.isDisplayed();

		Assert.assertTrue(title, "Our commitment: third grid title is not present");

	}

	@Then("^third grid item description should be present$")
	public void third_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement third_grid_content = homepage.third_grid_content;
		boolean content = third_grid_content.isDisplayed();

		Assert.assertTrue(content, "Our commitment: third grid content is not present");
	}

	@Then("^third grid item link should be present$")
	public void third_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement third_grid_link = homepage.third_grid_link;
		boolean link = third_grid_link.isDisplayed();

		Assert.assertTrue(link, "Our commitment: third grid title is not present");
	}

	// Our Commitment section: 4th grid (Mitigating emissions)

	@Then("^on hover, the fourth grid opens$")
	public void on_hover_the_fourth_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement mitigating_emissions = homepage.mitigating_emissions;
		action = new Actions(driver);
		action.moveToElement(mitigating_emissions).build().perform();
		String actual_grid_state = mitigating_emissions.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Mitigating emissions grid isn't open on hover isn't open upon hover");

	}

	@Then("^fourth grid item title should be present$")
	public void fourth_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fourth_grid_title = homepage.fourth_grid_title;
		boolean title = fourth_grid_title.isDisplayed();

		Assert.assertTrue(title, "Our commitment: fourth grid title is not present");
	}

	@Then("^fourth grid item description should be present$")
	public void fourth_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fourth_grid_content = homepage.fourth_grid_content;
		boolean content = fourth_grid_content.isDisplayed();

		Assert.assertTrue(content, "Our commitment: fourth grid content is not present");
	}

	@Then("^fourth grid item link should be present$")
	public void fourth_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fourth_grid_link = homepage.fourth_grid_link;
		boolean link = fourth_grid_link.isDisplayed();

		Assert.assertTrue(link, "Our commitment: fourth grid title is not present");
	}

	// Our Commitment section: 5th grid (Job creation)

	@Then("^on hover, the fifth grid opens$")
	public void on_hover_the_fifth_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement job_creation = homepage.job_creation;
		action = new Actions(driver);
		action.moveToElement(job_creation).build().perform();
		String actual_grid_state = job_creation.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Job creation grid isn't open on hover isn't open upon hover");
	}

	@Then("^fifth grid item title should be present$")
	public void fifth_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fifth_grid_title = homepage.fifth_grid_title;
		boolean title = fifth_grid_title.isDisplayed();

		Assert.assertTrue(title, "Our commitment: fifth grid title is not present");
	}

	@Then("^fifth grid item description should be present$")
	public void fifth_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fifth_grid_content = homepage.fifth_grid_content;
		boolean content = fifth_grid_content.isDisplayed();

		Assert.assertTrue(content, "Our commitment: fifth grid content is not present");
	}

	@Then("^fifth grid item link should be present$")
	public void fifth_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement fifth_grid_link = homepage.fifth_grid_link;
		boolean link = fifth_grid_link.isDisplayed();

		Assert.assertTrue(link, "Our commitment: fifth grid title is not present");
	}

	// Our Commitment section: 6th grid (Outreach)

	@Then("^on hover, the sixth grid opens$")
	public void on_hover_the_sixth_grid_opens() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement outreach = homepage.outreach;
		util_methods.movetoElement(outreach);
		String actual_grid_state = outreach.getAttribute("class");
		String expected_grid_state = "iconGrid--item open-item";
		Assert.assertEquals(actual_grid_state, expected_grid_state,
				"Our commitment: Outreach grid isn't open on hover isn't open upon hover");

//		action = new Actions(driver);
//		action.moveToElement(outreach).build().perform();

	}

	@Then("^sixth grid item title should be present$")
	public void sixth_grid_item_title_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement sixth_grid_title = homepage.sixth_grid_title;
		boolean title = sixth_grid_title.isDisplayed();

		Assert.assertTrue(title, "Our commitment: sixth grid title is not present");
	}

	@Then("^sixth grid item description should be present$")
	public void sixth_grid_item_description_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement sixth_grid_content = homepage.sixth_grid_content;
		boolean content = sixth_grid_content.isDisplayed();

		Assert.assertTrue(content, "Our commitment: sixth grid content is not present");
	}

	@Then("^sixth grid item link should be present$")
	public void sixth_grid_item_link_should_be_present() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement sixth_grid_link = homepage.sixth_grid_link;
		boolean link = sixth_grid_link.isDisplayed();

		Assert.assertTrue(link, "Our commitment: sixth grid title is not present");
	}

	// Trending Module: Social Share

	@Then("^Exxon Mobil Facebook trending should display with it's handle$")
	public void exxon_Mobil_Facebook_trending_should_display_with_iit_s_handle() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> trending_items = homepage.trending_module_social_share_items;
		List<WebElement> trending_social_handle_urls = homepage.social_share_handles;
		for (WebElement item : trending_items) {
			String text = item.getAttribute("class");

			if (text.contains("facebook")) {
				boolean fb = item.isDisplayed();

				Assert.assertTrue(fb, "Trending: Facebook is not present");

				for (WebElement url : trending_social_handle_urls) {
					String url_value = util_methods.get_URL_from_link(url);
					if (url_value.contains("facebook")) {
						boolean fb_handle = url.isDisplayed();
						Assert.assertTrue(fb, "Trending: Facebook handle is not present");

						Assert.assertTrue(fb_handle, "Trending: Facebook handle url is not correct");

					}
				}

			}
		}
	}

	@Then("^Exxon Mobil Twitter trending should display with it's handle$")
	public void exxon_Mobil_Twitter_trending_should_display_with_iit_s_handle() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> trending_items = homepage.trending_module_social_share_items;
		List<WebElement> trending_social_handle_urls = homepage.social_share_handles;
		for (WebElement item : trending_items) {
			String text = item.getAttribute("class");

			if (text.contains("twitter")) {
				boolean twitter = item.isDisplayed();

				Assert.assertTrue(twitter, "Trending: Twitter is not present");

				for (WebElement url : trending_social_handle_urls) {
					String url_value = util_methods.get_URL_from_link(url);
					if (url_value.contains("twitter")) {
						boolean twitter_handle = url.isDisplayed();
						Assert.assertTrue(twitter, "Trending: Twitter handle is not present");

						Assert.assertTrue(twitter_handle, "Trending: Twitter handle url is not correct");

					}
				}

			}
		}
	}

	@Then("^Exxon Mobil Instagram trending should display with it's handle$")
	public void exxon_Mobil_Instagram_trending_should_display_with_iit_s_handle() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> trending_items = homepage.trending_module_social_share_items;
		List<WebElement> trending_social_handle_urls = homepage.social_share_handles;
		for (WebElement item : trending_items) {
			String text = item.getAttribute("class");

			if (text.contains("instagram")) {
				boolean ig = item.isDisplayed();

				Assert.assertTrue(ig, "Trending: Instagram is not present");

				for (WebElement url : trending_social_handle_urls) {
					String url_value = util_methods.get_URL_from_link(url);
					if (url_value.contains("instagram")) {
						boolean ig_handle = url.isDisplayed();
						Assert.assertTrue(ig, "Trending: Instagram handle is not present");

						Assert.assertTrue(ig_handle, "Trending: Instagram handle url is not correct");

					}
				}

			}
		}
	}

	@Then("^Exxon Mobil LinkedIn trending should display with it's handle$")
	public void exxon_Mobil_LinkedIn_trending_should_display_with_iit_s_handle() throws Throwable {
		homepage = new homepage_pagefactory();
		List<WebElement> trending_items = homepage.trending_module_social_share_items;
		List<WebElement> trending_social_handle_urls = homepage.social_share_handles;
		for (WebElement item : trending_items) {
			String text = item.getAttribute("class");

			if (text.contains("linkedin")) {
				boolean li = item.isDisplayed();

				Assert.assertTrue(li, "Trending: Facebook is not present");

				for (WebElement url : trending_social_handle_urls) {
					String url_value = util_methods.get_URL_from_link(url);
					if (url_value.contains("linkedin")) {
						boolean li_handle = url.isDisplayed();
						Assert.assertTrue(li, "Trending: Facebook handle is not present");

						Assert.assertTrue(li_handle, "Trending: Facebook handle url is not correct");

					}
				}

			}
		}

	}

	// Energy Factor Module

	@Then("^user should see the Energy Factor module$")
	public void user_should_see_the_Energy_Factor_module() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement energy_factor_module = homepage.energy_factor_module;
		boolean module = energy_factor_module.isDisplayed();

		Assert.assertTrue(module, "Energy Factor module does not display");

	}

	@Then("^user should see the Energy Factor eyebrow$")
	public void user_should_see_the_eyebrow() throws Throwable {

		homepage = new homepage_pagefactory();
		WebElement energy_factor_module_eyebrow = homepage.energy_factor_module_eyebrow;
		boolean eyebrow = energy_factor_module_eyebrow.isDisplayed();

		Assert.assertTrue(eyebrow, "Energy Factor: eyebrow is not present");

		String text = energy_factor_module_eyebrow.getText();
		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: eyebrow does not display text");
	}

	@Then("^user should see the Energy Factor title$")
	public void user_should_see_title() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement energy_factor_module_title = homepage.energy_factor_module_title;
		boolean title = energy_factor_module_title.isDisplayed();

		Assert.assertTrue(title, "Energy Factor: title is not present");

		String text = energy_factor_module_title.getText();
		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: title does not display text");
	}

	@Then("^user should see the Energy Factor description$")
	public void user_should_see_description() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement energy_factor_module_description = homepage.energy_factor_module_title;
		boolean module = energy_factor_module_description.isDisplayed();

		Assert.assertTrue(module, "Energy Factor: description is not present");

		String text = energy_factor_module_description.getText();
		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: description does not display text");
	}

	@Then("^user should see the Energy Factor Learn more button$")
	public void user_should_see_the_Learn_more_button() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement energy_factor_module_button = homepage.energy_factor_module_button;
		boolean module = energy_factor_module_button.isDisplayed();
		boolean enabled = energy_factor_module_button.isEnabled();

		Assert.assertTrue(module, "Energy Factor: button is not present");
		Assert.assertTrue(enabled, "Energy Factor: button is not enabled");

	}

	// Stock Ticker Module

	@Then("^user should see the Stock Ticker module$")
	public void user_should_see_the_Stock_Ticker_module() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module = homepage.stock_ticker_module;

		boolean module = stock_ticker_module.isDisplayed();

		Assert.assertTrue(module, "Stock Ticker module does not display");

	}

	@Then("^user should see the Stock Ticker title$")
	public void user_should_see_the_Stock_Ticker_title() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_title = homepage.stock_ticker_title;
		boolean title = stock_ticker_module_title.isDisplayed();

		Assert.assertTrue(title, "Stock Ticker module: title does not display");

		String text = stock_ticker_module_title.getText();
		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Stock Ticker module: title text does not display");
	}

	@Then("^user should see the Stock Ticker price$")
	public void user_should_see_the_Stock_Ticker_price() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_price = homepage.stock_ticker_price;
		boolean title = stock_ticker_module_price.isDisplayed();

		Assert.assertTrue(title, "Stock Ticker module: price does not display");

		String text = stock_ticker_module_price.getText();

		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Stock Ticker module: price amount does not display");

		String c = text.substring(1);
		double b = Double.valueOf(c);
		if (b > 0) {
			Assert.assertTrue(true, "stock ticker price is not greater than 0");
		}
	}

	@Then("^user should see the Stock Ticker change$")
	public void user_should_see_the_Stock_Ticker_change() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_change = homepage.stock_ticker_change;
		boolean title = stock_ticker_module_change.isDisplayed();

		Assert.assertTrue(title, "Stock Ticker module:  does not display\"");

		String text = stock_ticker_module_change.getText();

		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: title does not display text");
	}

	@Then("^user should see the Stock Ticker time$")
	public void user_should_see_the_Stock_Ticker_time() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_time = homepage.stock_ticker_time;
		boolean title = stock_ticker_module_time.isDisplayed();

		Assert.assertTrue(title, "Energy Factor: title is not present");

		String text = stock_ticker_module_time.getText();

		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: title does not display text");
	}

	@Then("^user should see the Stock Ticker date$")
	public void user_should_see_the_Stock_Ticker_date() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_date = homepage.stock_ticker_date;
		boolean title = stock_ticker_module_date.isDisplayed();

		Assert.assertTrue(title, "Energy Factor: title is not present");

		String text = stock_ticker_module_date.getText();

		int length = text.length();
		boolean a = length > 1;
		Assert.assertTrue(a, "Energy Factor: title does not display text");
	}

	@Then("^user should see the Stock Ticker button$")
	public void user_should_see_the_Stock_Ticker_button() throws Throwable {
		homepage = new homepage_pagefactory();
		WebElement stock_ticker_module_button = homepage.stock_ticker_button;
		boolean module = stock_ticker_module_button.isDisplayed();
		boolean enabled = stock_ticker_module_button.isEnabled();

		Assert.assertTrue(module, "Stock Ticker module: button is not present");
		Assert.assertTrue(enabled, "Stock Ticker module: button is not enabled");
	}

	@After
	public void quit() {
		driver.quit();
	}

}
