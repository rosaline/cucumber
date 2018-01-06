package com.wenjian.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseBase {
	protected static WebDriver driver;
	
	protected static void startDriver (String browserType) {
		switch (browserType) {
		case "Firefox":
			System.setProperty("webdriver.gecko.driver",
					"src//main//resources//Drivers//geckodriver");
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver",
					"src//main//resources//Drivers//chromedriver");
			driver = new ChromeDriver();
			break;
		default:
			System.out.println("Please using: Chrome, Firefox");
			break;
		}
	}

}
