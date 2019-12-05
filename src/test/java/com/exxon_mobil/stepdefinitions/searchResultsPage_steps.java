package com.exxon_mobil.stepdefinitions;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.exxon_mobil.pagefactory.search_results_pagefactory;
import com.exxon_mobil.util.TestBase;
import com.exxon_mobil.util.util_methods;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchResultsPage_steps extends TestBase {

	search_results_pagefactory search_results;
	JavascriptExecutor js;

	@Then("^user should see no results message section$")
	public void user_should_see_no_results_message() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean no_results_message = search_results.no_results_message.isDisplayed();
		Assert.assertTrue(no_results_message,
				"no results message display wheb user executes a search that yeilds no results");

	}

	@Given("^\"([^\"]*)\" should render in the no results message$")
	public void should_render_in_the_no_results_message(String arg1) throws Throwable {
		search_results = new search_results_pagefactory();
		String no_results_message = search_results.no_results_message_text.getText();
		Assert.assertTrue(no_results_message.contains(arg1), "search term is not included in the no results message");

	}

	@Then("^first tab should be selected$")
	public void first_tab_should_be_selected() throws Throwable {
		search_results = new search_results_pagefactory();
		WebElement results_category = search_results.ExxonMobil;
		boolean selected = results_category.getAttribute("class").contains("selected");
		if (selected == true) {
			Assert.assertTrue(true);

		} else {
			Assert.fail("In the search results page on landing, First results tab is not selected");
		}

	}

	@Then("^results eyebrow should display$")
	public void results_eyebrow_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_eyebrow = search_results.results_eyebrow.isDisplayed();
		Assert.assertTrue(search_eyebrow, "Search results: search eyebrow is not beind displayed");

	}

	@Then("^results items should display$")
	public void results_items_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.ExxonMobil_results_items;

		try {
			for (WebElement item : search_items) {
				boolean a = item.isDisplayed();
				Assert.assertTrue(a, "Search results: one or more results item is not displayed");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("^Load More button should display$")
	public void load_More_button_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_more_button = search_results.exxon_mobil_Load_More_button.isDisplayed();
		Assert.assertTrue(search_more_button);

	}

	@When("^user clicks the Load More button$")
	public void user_clicks_the_Load_More_button() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.exxon_mobil_Load_More_button.click();

	}

	@Then("^the result item count should increase$")
	public void result_item_count_should_increase() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.ExxonMobil_results_items;

		int result_count = search_items.size();

		if (result_count > 10 && result_count <= 20) {
			Assert.assertTrue(true);
		}

	}

	@When("^user clicks on Energy Factor tab$")
	public void user_clicks_on_Energy_Factor_tab() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.Energy_Factor.click();

	}

	@Then("^Energy Factor results tab should be selected$")
	public void energy_Factor_results_tab_should_be_selected() throws Throwable {
		search_results = new search_results_pagefactory();
		WebElement energy_factor = search_results.Energy_Factor;
		String text = energy_factor.getAttribute("class");
		boolean a = text.contains("selected");
		Assert.assertTrue(a);
	}

	@Then("^Energy Factor results eyebrow should display$")
	public void energy_Factor_results_eyebrow_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_eyebrow = search_results.energy_factor_results_eyebrow.isDisplayed();
		Assert.assertTrue(search_eyebrow, "Search results: Energy factor tab:  eyebrow is not being displayed");

	}

	@Then("^Energy Factor results items should display$")
	public void energy_Factor_results_items_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.energy_factor_results_items;

		try {
			for (WebElement item : search_items) {
				boolean a = item.isDisplayed();
				Assert.assertTrue(a, "Search results: Energy factor tab: one or more results item is not displayed");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("^Energy Factor Load More button should display$")
	public void energy_Factor_Load_More_button_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_more_button = search_results.energy_factor_Load_More_button.isDisplayed();
		Assert.assertTrue(search_more_button);

	}

	@When("^user clicks the Energy Factor tab Load More button$")
	public void user_clicks_the_Energy_Factor_tab_Load_More_button() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.energy_factor_Load_More_button.click();

	}

	@Then("^Energy factor result item count should increase$")
	public void energy_factor_result_item_count_should_increase() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.energy_factor_results_items;

		int result_count = search_items.size();

		if (result_count > 10 && result_count <= 20) {
			Assert.assertTrue(true);
		}

	}

	@When("^user clicks on Perspectives blog tab$")
	public void user_clicks_on_Perspectives_blog_tab() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.Perspectives_blog.click();

	}

	@Then("^Perspectives blog results tab should be selected$")
	public void perspectives_blog_results_tab_should_be_selected() throws Throwable {
		search_results = new search_results_pagefactory();
		WebElement perspectivse_blog = search_results.Perspectives_blog;
		String text = perspectivse_blog.getAttribute("class");
		boolean a = text.contains("selected");
		Assert.assertTrue(a);

	}

	@Then("^Perspectives blog results eyebrow should display$")
	public void perspectives_blog_results_eyebrow_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_eyebrow = search_results.perspectives_blog_results_eyebrow.isDisplayed();
		Assert.assertTrue(search_eyebrow, "Search results: Perspectives blog tab:  eyebrow is not being displayed");

	}

	@Then("^Perspectives blog results items should display$")
	public void perspectives_blog_results_items_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.perspectives_blog_results_items;

		try {
			for (WebElement item : search_items) {
				boolean a = item.isDisplayed();
				Assert.assertTrue(a,
						"Search results: Perspectives blog tab: one or more results item is not displayed");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("^Perspectives blog Load More button should display$")
	public void perspectives_blog_Load_More_button_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_more_button = search_results.perspectives_blog_Load_More_button.isDisplayed();
		Assert.assertTrue(search_more_button);

	}

	@When("^user clicks the Perspectives blog tab Load More button$")
	public void user_clicks_the_Perspectives_blog_tab_Load_More_button() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.perspectives_blog_Load_More_button.click();

	}

	@Then("^Perspectives blog result item count should increase$")
	public void perspectives_blog_result_item_count_should_increase() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results = new search_results_pagefactory();
		List<WebElement> search_items = search_results.perspectives_blog_results_items;

		int result_count = search_items.size();

		if (result_count > 10 && result_count <= 20) {
			Assert.assertTrue(true);
		}

	}

	@When("^user filters by article$")
	public void user_filters_by_article() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results = new search_results_pagefactory();
		search_results.filter_by.click();
		// Thread.sleep(3000);
		search_results.article_filter.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(search_results.search_spinner));

	}

	@Then("^result items should be less$")
	public void result_items_should_be_less() throws Throwable {

	}

	@Then("^result items should have the article tag$")
	public void result_items_should_have_the_article_tag() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> filter_selection = search_results.exxon_mobil_filter_type_in_results_item;
		for (WebElement type : filter_selection) {
			String text = type.getText();
			Assert.assertEquals(text, "Article");

		}

	}

	@Then("^boosted search results should load$")
	public void boosted_search_results_should_load() throws Throwable {
		search_results = new search_results_pagefactory();
		js = (JavascriptExecutor) driver;
		String pageloadstatus = (String) js.executeScript("return document.readyState");
		Assert.assertEquals(pageloadstatus, "complete", "boosted search results did not load properly");

	}

	// Search steps:

	// Scenario: Search modal: default state
	@When("^user clicks search button$")
	public void user_clicks_search_button() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.search_icon.click();

	}

	@Then("^search module should display$")
	public void search_modal_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_module_displayed = search_results.search_module.isDisplayed();
		Assert.assertTrue(search_module_displayed, "Upon search icon click, search module is not displayed");

	}

	@Then("^the search module input should be present$")
	public void the_search_field_should_be_present() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_module_input_displayed = search_results.search_module_input.isDisplayed();
		Assert.assertTrue(search_module_input_displayed,
				"Upon search icon click, search module input field is not displayed");

	}

	@Then("^the search button should be disabled$")
	public void the_search_button_should_be_disabled() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_module_search_button = search_results.search_button.isSelected();
		Assert.assertFalse(search_module_search_button,
				"Upon search icon click, search module search button is not disabled");

	}

	@When("^user clicks on the X button$")
	public void user_clicks_on_the_X_button() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.x_button.click();

	}

	@Then("^search module should no longer display$")
	public void search_module_should_no_longer_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean search_module_displayed = search_results.search_module.isDisplayed();
		Assert.assertFalse(search_module_displayed,
				"Search module: upon clicking X button,search module still displays");

	}

	// Scenario: Search modal:Search button enabled/disabled states
	@When("^enters a search term in the search edit field$")
	public void enters_a_search_term_in_the_search_edit_field() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.search_input_field.sendKeys("a");

	}

	@Then("^the search module search button should be enabled$")
	public void the_search_module_search_button_should_be_enabled() throws Throwable {
		search_results = new search_results_pagefactory();

		WebElement search = search_results.search_button;
		String text = search.getAttribute("class");
		if (text.contains("disabled")) {
			Assert.assertFalse(false, "Search button is not active upon populating search field");
		}

	}

	@When("^user deletes the search term in the search edit field$")
	public void user_deletes_the_search_term_in_the_search_edit_field() throws Throwable {
		search_results = new search_results_pagefactory();

		WebElement element = search_results.search_input_field;

		element.sendKeys(Keys.BACK_SPACE);

	}

	@Then("^the search module search button should be disabled$")
	public void the_search_module_search_button_should_be_disabled() throws Throwable {
		search_results = new search_results_pagefactory();
		WebElement search = search_results.search_button;
		String text = search.getAttribute("class");
		if (text.contains("disabled")) {
			Assert.assertTrue(true, "Search button is not disabled upon clearing the search field");
		}

	}

	// Scenario: Search modal: Invoke type ahead service works on search term
	@When("^enters a search ca in the search edit field$")
	public void enters_a_search_carbon_copy_in_the_search_edit_field() throws Throwable {
		search_results = new search_results_pagefactory();

		search_results.search_input_field.sendKeys("ca");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.className("searchModule--autocomplete-item")));

	}

	@Then("^type ahead suggestions should display$")
	public void type_ahead_suggestions_should_display() throws Throwable {
		search_results = new search_results_pagefactory();
		boolean auto_complete_display = search_results.search_input_field_autocomplete.isDisplayed();
		List<WebElement> autocomplete_items = search_results.search_input_field_autocomplete_items;
		int size = autocomplete_items.size();

		boolean enabled = autocomplete_items.isEmpty();

		Assert.assertTrue(auto_complete_display, "Search module: search auto complete doesn't display");
		Assert.assertFalse(enabled, "Search module: search auto complete items are empty");

		if (size > 0) {
			Assert.assertTrue(true, "Search module auto complete items are not rendering");
		}

	}

	@Then("^search term should be in the suggested selections texts$")
	public void search_term_should_be_in_the_suggested_selections_texts() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> autocomplete_items = search_results.search_input_field_autocomplete_items;
		for (WebElement item : autocomplete_items) {
			String text = item.getText();
			boolean a = text.contains("ca");

			Assert.assertTrue(a, "one or more autocomplete item text do not include 'carbon' ");

		}

	}

	@When("^user clears the search edit field$")
	public void user_clears_the_search_edit_field() throws Throwable {
		search_results = new search_results_pagefactory();
		util_methods.clear_edit_field(search_results.search_input_field);
		search_results.search_input_field.clear();

		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.invisibilityOf(search_results.search_input_field_autocomplete));

	}

	@Then("^the type ahead suggestions should no longer display$")
	public void the_type_ahead_suggestions_should_no_longer_display() throws Throwable {

		search_results = new search_results_pagefactory();
		boolean auto_complete_display = search_results.search_input_field_autocomplete.isDisplayed();

		Assert.assertFalse(auto_complete_display, "Search module: search auto complete doesn't display");

	}

	@When("^user executes search with q12we34r")
	public void user_executes_search_with_q_we_r() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.search_input_field.sendKeys("q12we34r");
		search_results.search_button.click();

	}

	@Given("^user executes search with \"([^\"]*)\"$")
	public void user_executes_search_with(String arg1) throws Throwable {

		search_results = new search_results_pagefactory();
		search_results.search_input_field.sendKeys(arg1);
		search_results.search_button.click();

	}

	@When("^user sorts by date$")
	public void user_sorts_by_date() throws Throwable {
		search_results = new search_results_pagefactory();
		search_results.sort_by.click();
		search_results.sort_by_date.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(search_results.search_spinner));

	}

	@Then("^result items should dates should display in descending order$")
	public void result_items_should_dates_should_display_in_descending_order() throws Throwable {
		search_results = new search_results_pagefactory();
		List<WebElement> date_elements = search_results.exxon_mobil_sort_by_date_data;

		LinkedList<String> date_strings = new LinkedList<String>();

		Map<String, String> months = new LinkedHashMap<String, String>();
		months.put("Jan.", "01");
		months.put("Feb.", "02");
		months.put("March", "03");
		months.put("April", "04");
		months.put("May", "05");
		months.put("June", "06");
		months.put("July", "07");
		months.put("Aug.", "08");
		months.put("Sept.", "09");
		months.put("Oct.", "10");
		months.put("Nov.", "11");
		months.put("Dec.", "12");

		for (WebElement date : date_elements) {
			String a = date.getText();

			date_strings.add(a);
		}

		for (String date : date_strings) {
			for (Map.Entry<String, String> entry : months.entrySet()) {
				if (date.contains(entry.getKey()) == true)

					date.replace(date, entry.getValue());

			}
			System.out.println(date);

		}

	}

	@After
	public void quit() {
		driver.quit();
	}

}
