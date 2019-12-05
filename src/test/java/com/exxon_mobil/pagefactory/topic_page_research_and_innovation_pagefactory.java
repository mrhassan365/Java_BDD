package com.exxon_mobil.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class topic_page_research_and_innovation_pagefactory extends TestBase {

	@FindBy(css = "body > main > div.topic--wrapper > section:nth-child(2) > div > div > section > article > div")
	public WebElement article_youtube_video;

	@FindBy(css = "div.contentCollection--items > div")
	public List<WebElement> article_collection;

	@FindBy(css = "div.contentCollection--buttons > button")
	public WebElement topic_page_load_more_button;

	public topic_page_research_and_innovation_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
