package com.otelz.newRoomTest;

import org.testng.annotations.Test;

import com.otelz.base.TestUtilities;
import com.otelz.pages.WelcomePageObject;

public class NewRoomTest extends TestUtilities {

	@Test
	public void newRoomTest() {

		// open main page
		WelcomePageObject welcomePage = new WelcomePageObject(driver, log);
		welcomePage.openPage();

		sleep(1000);
		welcomePage.clickNewRoomLink();

		takeScreenshot("New Room Added");

		sleep(1000);

		welcomePage.clickDeleteRoomLink();
		sleep(1000);
		takeScreenshot("New Room Deleted");

	}
}
