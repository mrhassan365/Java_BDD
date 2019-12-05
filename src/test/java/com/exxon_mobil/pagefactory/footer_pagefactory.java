package com.exxon_mobil.pagefactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;


public class footer_pagefactory extends TestBase {

	HttpURLConnection connection;
	URL url;
	int status_code;
	
	//Footer links
	@FindBy(css="div.footer--links > ul > li > a")
	public List<WebElement> footer_links;
	
	
	//Footer Social sites
	public @FindBy(css="div.footer--socialMedia > ul > li > a")
	List<WebElement> footer_social_site_links;
	
	//Footer Brands
	@FindBy(css = "div.footer--brands> a")
	public List<WebElement> footer_brands;
	
	//Footer Privacy links
	@FindBy(css = "div.footer--privacy> a")
	public List<WebElement> footer_privacy_links;
	



	public footer_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}

