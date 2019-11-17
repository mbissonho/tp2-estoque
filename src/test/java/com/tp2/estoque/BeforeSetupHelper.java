package com.tp2.estoque;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BeforeSetupHelper {

	private static WebDriver firefoxWebdriver = null;
	
	public static void setUpFirefoxDriver() {
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		
		System.setProperty("webdriver.gecko.driver","src/test/resources/geckodriver");
		BeforeSetupHelper.firefoxWebdriver = (WebDriver) new FirefoxDriver(options);
	}
	
	public static WebDriver getFirefoxWebdriver() {
		return firefoxWebdriver;
	}
	
}
