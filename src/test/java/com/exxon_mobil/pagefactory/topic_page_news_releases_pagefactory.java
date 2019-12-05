package com.exxon_mobil.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class topic_page_news_releases_pagefactory extends TestBase {
	
	@FindBy (css = "div.contentCollection--buttons > button")
	public WebElement load_more_button;
	
	@FindBy (css = "div.contentCollection--items > div")
	public List<WebElement> news_releases_articles;
	
	

	public topic_page_news_releases_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
