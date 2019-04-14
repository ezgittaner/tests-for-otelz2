package com.otelz.scrollAndSearchTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.otelz.base.TestUtilities;
import com.otelz.pages.WelcomePageObject;

public class ScrollAndSearchTest extends TestUtilities {

	@Parameters({ "cityname" })
	@Test
	public void scrollAndSearchTest(String cityname) {
		log.info("Starting Scroll and Search Test");
		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		sleep(3000);

		welcomePage.clickSearchLink();

		welcomePage.searchOtel(cityname);

		sleep(3000);
	}

}
