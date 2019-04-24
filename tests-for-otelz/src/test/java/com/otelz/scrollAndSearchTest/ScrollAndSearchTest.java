package com.otelz.scrollAndSearchTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.otelz.base.TestUtilities;
import com.otelz.pages.WelcomePageObject;

public class ScrollAndSearchTest extends TestUtilities {

	@Parameters({ "cityname" })
	@Test
	public void scrollAndSearchTest(String cityname) {

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();
		takeScreenshot("Welcome Page opened");

		// scroll down
		welcomePage.scrollDown();

		sleep(2000);

		// search İzmir hotels

		welcomePage.clickSearchLink();

		welcomePage.searchOtel(cityname);

		sleep(2000);

		takeScreenshot("İzmir writed");

		welcomePage.clickSearchButton();

	}

}
