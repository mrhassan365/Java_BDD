package com.exxon_mobil.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class topic_page_investors_pagefactory extends TestBase {

	@FindBy(css = "section:nth-child(1) > div > div > section > div > div")
	public WebElement stock_ticker;

	@FindBy(css = "div.stockTicker--data-item.stockTicker--price")
	public WebElement stock_ticker_price;
	
	@FindBy(css = "div.contentCollection--items > div")
	public List<WebElement> topic_page_investors_events_items;
	
	@FindBy(css = "div.contentCollection--buttons > button")
	public WebElement load_more_button;

	public topic_page_investors_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
