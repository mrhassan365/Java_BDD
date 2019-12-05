package com.exxon_mobil.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;

public class homepage_pagefactory extends TestBase {

	// Homepage Hero module
	@FindBy(css = "body > main > header > div > section")
	public WebElement homepage_hero_module;

	@FindBy(css = "article.homeHero--item.has-shadow.has-loaded.active > div > p.eyebrow.eyebrow-red")
	public WebElement homepage_hero_module_eyebrow;

	@FindBy(css = "article.homeHero--item.has-shadow.has-loaded.active > div > h2")
	public WebElement homepage_hero_module_title;

	@FindBy(css = "article.homeHero--item.has-shadow.has-loaded.active > div > p.h6.homeHero--text")
	public WebElement homepage_hero_module_title_text;

	@FindBy(css = "article.homeHero--item.has-shadow.has-loaded.active > div > div")
	public WebElement homepage_hero_module_CTA;

	@FindBy(css = "div.homeHero--control > div")
	public WebElement homepage_hero_module_controls;

	// Homepage Trending module
	@FindBy(css = "div.keytopicstrending--right > section")
	public WebElement trendingModule;

	@FindBy(css = "div.trending--content > div > a")
	public List<WebElement> trendingModuleItemTitles;

	@FindBy(css = "div.trending--content > div > div > p > span.dot")
	public List<WebElement> trendingModuleItemdot;

	@FindBy(css = "div.trending--content > div > div > p > span.date > span")
	public List<WebElement> trendingModuleItemdate;

	// Mission statement module

	@FindBy(css = "section.missionStatement")
	public WebElement mission_statement_module;

	@FindBy(css = "section.missionStatement > div > div > article")
	public WebElement mission_statement_module_content;

	// Mission Statement: 1st hoverable element
	@FindBy(css = "div.missionStatement--text")
	public WebElement mission_statement;

	@FindBy(css = "section.missionStatement > div > div > article > div.missionStatement--text > a:nth-child(1)")
	public WebElement mission_statement_module_first_hoverable_element;

	@FindBy(id = "section.missionStatement > div > div > article > div:nth-child(2)")
	public WebElement mission_statement_first_tooltip;

	@FindBy(css = "#MS_36c4995a-bb38-4078-abd7-1b561a19275f_6CF31B6076184F7D99B7DB12B16E49F8_1 > div.missionStatement--tooltip--image > img")
	public WebElement mission_statement_first_tooltip_image;

	@FindBy(css = "#MS_36c4995a-bb38-4078-abd7-1b561a19275f_6CF31B6076184F7D99B7DB12B16E49F8_1 > div.missionStatement--tooltip--text")
	public WebElement mission_statement_first_tooltip_text;

	@FindBy(css = "#MS_36c4995a-bb38-4078-abd7-1b561a19275f_6CF31B6076184F7D99B7DB12B16E49F8_1 > div.missionStatement--tooltip--cta")
	public WebElement mission_statement_first_tooltip_CTA;

	// Mission Statement: 2nd hoverable element

	@FindBy(css = "section.missionStatement > div > div > article > div:nth-child(3)")
	public WebElement mission_statement_second_tooltip;

	@FindBy(css = "section.missionStatement > div > div > article > div.missionStatement--text > a:nth-child(2)")
	public WebElement mission_statement_module_second_hoverable_element;

	// Mission Statement: 3rd hoverable element

	@FindBy(css = "section.missionStatement > div > div > article > div:nth-child(4)")
	public WebElement mission_statement_third_tooltip;

	@FindBy(css = "section.missionStatement > div > div > article > div.missionStatement--text > a:nth-child(3)")
	public WebElement mission_statement_module_third_hoverable_element;

	// Our Commitment Module

	// Our commitment: 1st grid item (Improving energy access)
	@FindBy(css = "body > main > div.home--wrapper > section.iconGrid.iconGrid-two-column > div > div.iconGrid--items > div:nth-child(1) > div:nth-child(1)")
	public WebElement improving_energy_access;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(1) > div.iconGrid--item-title")
	public WebElement first_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(1) > div.iconGrid--item-content")
	public WebElement first_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(1) > div.iconGrid--item-content > a")
	public WebElement first_grid_link;

	// Our commitment: 2nd grid item (Improving efficiency)
	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(2)")
	public WebElement improving_efficiency;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(2) > div.iconGrid--item-title")
	public WebElement second_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(2) > div.iconGrid--item-content")
	public WebElement second_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(2) > div.iconGrid--item-content > a")
	public WebElement second_grid_link;

	// Our commitment: 3rd grid item (Sustainability)
	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(3)")
	public WebElement sustainability;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(3) > div.iconGrid--item-title")
	public WebElement third_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(3) > div.iconGrid--item-content")
	public WebElement third_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(1) > div:nth-child(3) > div.iconGrid--item-content > a")
	public WebElement third_grid_link;

	// Our commitment: 4th grid item (Mitigating emissions)
	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(1)")
	public WebElement mitigating_emissions;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(1) > div.iconGrid--item-title")
	public WebElement fourth_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(1) > div.iconGrid--item-content")
	public WebElement fourth_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(1) > div.iconGrid--item-content > a")
	public WebElement fourth_grid_link;

	// Our commitment: 5th grid item (Job creation)
	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(2)")
	public WebElement job_creation;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(2) > div.iconGrid--item-title")
	public WebElement fifth_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(2) > div.iconGrid--item-content")
	public WebElement fifth_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(2) > div.iconGrid--item-content > a")
	public WebElement fifth_grid_link;

	// Our commitment: 6th grid item (Outreach)
	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(3)")
	public WebElement outreach;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(3) > div.iconGrid--item-title")
	public WebElement sixth_grid_title;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(3) > div.iconGrid--item-content")
	public WebElement sixth_grid_content;

	@FindBy(css = "div.iconGrid--items > div:nth-child(2) > div:nth-child(3) > div.iconGrid--item-content > a")
	public WebElement sixth_grid_link;

	// Trending module
	@FindBy(css = "div.keytopicstrending--right > section > div.trending--content > div:nth-child(1) > i")
	public WebElement twitter;

	@FindBy(css = " div.keytopicstrending--right > section > div.trending--content > div > i")
	public List<WebElement> trending_module_social_share_items;

	@FindBy(css = "  div.trending--content > div> div > a")
	public List<WebElement> social_share_handles;

	// Energy Factor Module

	@FindBy(css = "section.singleFeature.singleFeatureImagewrapper_b1219661f0b94dd4b4c6024890969f0b.container")
	public WebElement energy_factor_module;

	@FindBy(css = "section.singleFeature.singleFeatureImagewrapper_b1219661f0b94dd4b4c6024890969f0b.container > div > div > span")
	public WebElement energy_factor_module_eyebrow;

	@FindBy(css = "section.singleFeature.singleFeatureImagewrapper_b1219661f0b94dd4b4c6024890969f0b.container > div > div > h2")
	public WebElement energy_factor_module_title;

	@FindBy(css = "section.singleFeature.singleFeatureImagewrapper_b1219661f0b94dd4b4c6024890969f0b.container > div > div > div")
	public WebElement energy_factor_module_description;

	@FindBy(css = "section.singleFeature.singleFeatureImagewrapper_b1219661f0b94dd4b4c6024890969f0b.container > div > div > a")
	public WebElement energy_factor_module_button;

	// Stock Ticker module
	@FindBy(css = "section.stockTicker > div > div")
	public WebElement stock_ticker_module;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--title")
	public WebElement stock_ticker_title;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--data > div.stockTicker--data-item.stockTicker--price")
	public WebElement stock_ticker_price;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--data > div.stockTicker--data-item.stockTicker--change")
	public WebElement stock_ticker_change;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--data > div.stockTicker--data-item.stockTicker--time > p > span:nth-child(1)")
	public WebElement stock_ticker_time;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--data > div.stockTicker--data-item.stockTicker--time > p > span:nth-child(3)")
	public WebElement stock_ticker_date;

	@FindBy(css = "section.stockTicker > div > div > div.stockTicker--item.stockTicker--button")
	public WebElement stock_ticker_button;

	public homepage_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
