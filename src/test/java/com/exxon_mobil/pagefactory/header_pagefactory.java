package com.exxon_mobil.pagefactory;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exxon_mobil.util.TestBase;

public class header_pagefactory extends TestBase {

	HttpURLConnection connection;
	URL url;
	int status_code;

	// Header Exxon Mobil Promo
	@FindBy(css = "div.mainNav--logo")
	public WebElement Main_nav_logo;

	// Global Navs
	@FindBy(css = "div.mainNav--aside > ul > li")
	public List<WebElement> header_navs;

	// Global nav links
	@FindBy(css = "div.mainNav--aside > ul > li > div > ul > li > ul > li > a")
	public List<WebElement> header_nav_links;

	// Energy and environment
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(1)")
	public WebElement Energy_and_environment;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(1) > div")
	public WebElement Energy_and_environment_subnav;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(1)  > div > ul > li > ul > li > a")
	public List<WebElement> Energy_and_environment_subnav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(1) > div > div > img")
	public WebElement Energy_and_environment_sub_nav_img;

	@FindBy(css = " div.mainNav--aside > ul > li:nth-child(1) > div > div")
	public WebElement Energy_and_environment_sub_nav_overview_description;

	// Search and innovation
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(2)")
	public WebElement Search_and_innovation;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(2)  > div > ul > li > ul > li > a")
	public List<WebElement> Search_and_innovation_sub_nav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(2) > div > div >img")
	public WebElement Search_and_innovation_sub_nav_img;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(2) > div > div")
	public WebElement Search_and_innovation_sub_nav_overview_description;

	// Community engagement
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(3)")
	public WebElement Community_engagement;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(3)  > div > ul > li > ul > li > a")
	public List<WebElement> Community_engagement_sub_nav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(3) > div > div > img")
	public WebElement Community_engagement_sub_nav_img;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(3) > div > div")
	public WebElement Community_engagement_sub_nav_overview_description;

	// Company
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(4)")
	public WebElement Company;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(4)  > div > ul > li > ul > li > a")
	public List<WebElement> Company_sub_nav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(4) > div > div > img")
	public WebElement Company_sub_nav_img;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(4) > div > div")
	public WebElement Company_sub_nav_overview_description;

	// Newsroom
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(5)")
	public WebElement Newsroom;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(5)  > div > ul > li > ul > li > a")
	public List<WebElement> Newsroom_sub_nav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(5) > div > div > img")
	public WebElement Newsroom_sub_nav_img;

	@FindBy(xpath = "/html/body/header/nav/section/div[1]/div[3]/ul/li[5]/div/div")
	public WebElement Newsroom_sub_nav_overview_description;

	// Investors
	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(6)")
	public WebElement Investors;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(6)  > div > ul > li > ul > li > a")
	public List<WebElement> Investors_sub_nav_links;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(6) > div > div > img")
	public WebElement Investors_sub_nav_img;

	@FindBy(css = "div.mainNav--aside > ul > li:nth-child(6) > div > div")
	public WebElement Investors_sub_nav_overview_description;

	// Global Selector
	@FindBy(css = "button.mainNav--globalSelector")
	public WebElement GlobalSelector;

	@FindBy(css = "div.globalSelector--overlay")
	public WebElement GlobalSelectorOverlay;

	@FindBy(css = "div.globalSelector--header > div > button")
	public WebElement GlobalSelectorOverlayXbutton;

	public header_pagefactory() {
		PageFactory.initElements(driver, this);
	}

}
