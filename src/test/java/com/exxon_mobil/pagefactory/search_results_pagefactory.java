package com.exxon_mobil.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class search_results_pagefactory extends TestBase {
	
	// Search
	
	@FindBy(css = "button.mainNav--search-icon > i")
	public WebElement search_icon;
	
	@FindBy(css = "div.container.searchBar--container > div > section > form > div")
	public WebElement search_module;
	
	@FindBy(css = "div.searchModule--wrapper > div.searchModule--input")
	public WebElement search_module_input;
	
	@FindBy(css = "div.searchModule--input-cta > a")
	public WebElement search_button;
	
	@FindBy(css = "div.searchBar--close > i")
	public WebElement x_button;
	
	@FindBy(css = "div.searchModule--input-txt > input")
	public WebElement search_input_field;
	
	@FindBy(css = "div.searchModule--autocomplete")
	public WebElement search_input_field_autocomplete;
	
	@FindBy(css = "div.searchModule--autocomplete.open > div > div > a")
	public List<WebElement> search_input_field_autocomplete_items;

	@FindBy(css = "div.searchModule--noResults-message")
	public WebElement no_results_message;

	@FindBy(css = "div.searchModule--noResults-message > h3")
	public WebElement no_results_message_text;

	// Search resutls Tabs
	@FindBy(css = "#tab-1")
	public WebElement ExxonMobil;

	@FindBy(css = "#tab-2")
	public WebElement Energy_Factor;

	@FindBy(css = "#tab-3")
	public WebElement Perspectives_blog;

	@FindBy(css = "#content-1 > section > div > div > div.searchResults--title > h2")
	public WebElement results_eyebrow;

	@FindBy(css = "#content-1 div.searchResults--results > div")
	public List<WebElement> ExxonMobil_results_items;

	@FindBy(css = "#content-2 > section > div > div > div.searchResults--title > h2")
	public WebElement energy_factor_results_eyebrow;

	@FindBy(css = "#content-2 > section > div > div > div.searchResults--results > div")
	public List<WebElement> energy_factor_results_items;

	@FindBy(css = "#content-3 > section > div > div > div.searchResults--title > h2")
	public WebElement perspectives_blog_results_eyebrow;

	@FindBy(css = "#content-3 div.searchResults--results > div")
	public List<WebElement> perspectives_blog_results_items;

	@FindBy(css = "#filterBy > p > span.dropdown-select-selected")
	public WebElement filter_by;
	
	@FindBy(css = "#filterBy > ul > li:nth-child(3) > a")
	public WebElement article_filter;
	
	@FindBy(css = "#sortBy > p > span.dropdown-select-selected")
	public WebElement sort_by;
	
	@FindBy(css = "#sortBy > ul > li:nth-child(3) > a")
	public WebElement sort_by_date;
	
	@FindBy(css="#content-1 > section > div > div > div.searchResults--results > div > div > p > span.date")
	public WebElement search_result_item_dates;

	@FindBy(css = "#content-1 > section > div > div > div.searchResults--buttons > button")
	public WebElement exxon_mobil_Load_More_button;

	@FindBy(css = "#content-2 > section > div > div > div.searchResults--buttons > button")
	public WebElement energy_factor_Load_More_button;

	@FindBy(css = "#content-3 > section > div > div > div.searchResults--buttons > button")
	public WebElement perspectives_blog_Load_More_button;
	
	@FindBy(css = "#content-1 > section > div > div > div.searchResults--results > div > div.searchResults--item > p > strong")
	public List<WebElement> exxon_mobil_filter_type_in_results_item;
	
	@FindBy(css = "#content-1 > section > div > div > div.searchResults--results > div > div.searchResults--item > p > span.date")
	public List<WebElement> exxon_mobil_sort_by_date_data;
	
	@FindBy(css = "body > main > div")
	public WebElement search_spinner;
	

	public search_results_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
