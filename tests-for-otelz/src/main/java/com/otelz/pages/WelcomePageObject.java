package com.otelz.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePageObject extends BasePageObject {

	private String pageUrl = "https://www.otelz.com/";
	private By newRoom = By.cssSelector("#searchBoxForm > div.sbc-body > div:nth-child(5) > div:nth-child(1) > a");
	private By deleteRoom = By
			.cssSelector("#searchBoxForm > div.sbc-body > div:nth-child(5) > div:nth-child(1) > div > label > span");
	private By search = By
			.cssSelector("#vueApp > div.home-top-search-box > div > div > div > div > div.col-xs-4 > div > input");
	private By selectCity = By.cssSelector(
			"#vueApp > div.home-top-search-box > div > div > div > div > div.col-xs-4 > div > div > div > ul > li:nth-child(1) > a > span");
	private By searchButton = By
			.cssSelector("#vueApp > div.home-top-search-box > div > div > div > div > div.col-xs-2 > button");

	public WelcomePageObject(WebDriver driver, Logger log) {
		super(driver, log);
	}

	/** Open WelcomePage with it's url */
	public void openPage() {
		log.info("Opening page: " + pageUrl);
		openUrl(pageUrl);
		log.info("Page opened!");
	}

	public WelcomePageObject clickNewRoomLink() {
		log.info("Clicking New Room on Welcome Page");
		click(newRoom);
		return new WelcomePageObject(driver, log);
	}

	public WelcomePageObject clickDeleteRoomLink() {
		log.info("Clicking Delete Room on Welcome Page");
		click(deleteRoom);
		return new WelcomePageObject(driver, log);
	}

	public WelcomePageObject clickSearchLink() {
		log.info("Clicking search on Welcome Page");
		click(search);
		return new WelcomePageObject(driver, log);
	}

	public void searchOtel(String cityname) {
		type(cityname, search);
		waitForVisibilityOf(selectCity, 3);
		click(selectCity);
	}

	public WelcomePageObject clickSearchButton() {
		log.info("Clicking search button Welcome Page");
		click(searchButton);
		return new WelcomePageObject(driver, log);
	}

}
