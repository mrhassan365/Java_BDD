package com.exxon_mobil.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class util_methods extends TestBase {

	public static HttpURLConnection connection;
	public static URL url;
	static Actions action;

	public static ArrayList<Integer> get_http_status_codes(List<WebElement> link_list) throws IOException {
		ArrayList<Integer> l2 = new ArrayList<Integer>();

		for (WebElement l : link_list) {
			String href = l.getAttribute("href");

			url = new URL(href);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			int statuscode = connection.getResponseCode();
			l2.add(statuscode);

		}

		return l2;

	}

	public static int get_http_status_code(WebElement link) throws IOException {
		String href = link.getAttribute("href");
		url = new URL(href);
		connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode = connection.getResponseCode();

		return statuscode;

	}

	public static ArrayList<String> get_URLs_from_listOfLinks(List<WebElement> link_list) {
		ArrayList<String> url_list = new ArrayList<String>();
		for (WebElement link : link_list) {
			String href = link.getAttribute("href");
			url_list.add(href);
		}
		return url_list;
	}

	public static String get_URL_from_link(WebElement link) {
		String url = link.getAttribute("href");
		return url;
	}

	public static String get_text(WebElement link) {
		String link_text = link.getText();
		return link_text;
	}

	public static ArrayList<String> get_text_from_ListOfLinks(List<WebElement> link_list) {
		ArrayList<String> link_texts = new ArrayList<String>();
		for (WebElement link : link_list) {
			String link_text = link.getText();
			link_texts.add(link_text);

		}
		return link_texts;

	}

	public static boolean hover(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element);
		return true;

	}

	public static boolean movetoElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		return true;
	}

	public static void clear_edit_field(WebElement element) {
		Actions builder = new Actions(driver);
		builder.moveToElement(element).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.BACK_SPACE).build().perform();

	}

	public static boolean is_selected(WebElement element) {
		return element.isSelected();
	}

	public static boolean is_enabled(WebElement element) {
		return element.isEnabled();
	}

	public static boolean is_displayed(WebElement element) {
		return element.isDisplayed();
	}

}
