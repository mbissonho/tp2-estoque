package com.tp2.estoque;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BeforeSetupHelper {

	private static WebDriver firefoxWebdriver = null;
	
	public static void setUpFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver");
		BeforeSetupHelper.firefoxWebdriver = (WebDriver) new FirefoxDriver();
	}
	
	public static WebDriver getFirefoxWebdriver() {
		return firefoxWebdriver;
	}
	
}
