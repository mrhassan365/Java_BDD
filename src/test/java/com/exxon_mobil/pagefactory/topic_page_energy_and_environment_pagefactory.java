package com.exxon_mobil.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class topic_page_energy_and_environment_pagefactory extends TestBase {

	@FindBy(css = "section:nth-child(2) > div > div > section > div > article")
	public WebElement article_chart;

	@FindBy(css = "div.articleMedia--imageWrapper > picture > img")
	public WebElement article_chart_img;

	public topic_page_energy_and_environment_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
