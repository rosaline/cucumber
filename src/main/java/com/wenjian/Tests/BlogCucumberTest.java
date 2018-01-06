package com.wenjian.Tests;


import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wenjian.Pages.BlogPage;
import com.wenjian.Utils.TestCaseBase;

import cucumber.api.java8.En;

public class BlogCucumberTest extends TestCaseBase implements En{
	private WebDriver driver = new ChromeDriver();
	private BlogPage blogPage = new BlogPage(driver);
	
	public BlogCucumberTest() {
		Given("^I enter my blog address \"([^\"]*)\" and go to Home page$", 
				(String url) -> { driver.get(url);});
		
		When("^I click the search button$", () -> {
			blogPage.clickSearchBtn();
		});
		
		And("^I enter \"([^\"]*)\" in the input field$", (String keyword) -> {
			blogPage.inputSearchWording(keyword);
		});
		
		And("^I click the first result of search$", () -> {
			blogPage.clickFirstResultOfSearch();
		});
		
		Then("^I go to the article page with title containing \"([^\"]*)\"$",
				(String keyword) -> {
					assertCon
		});
	}
	
	public static void assertContainsIgnoreCase(String set, String subset) {
		Assert.assertTrue(set.toLowerCase().indexOf(subset.toLowerCase()) > 0);
	}

}
