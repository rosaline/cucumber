package com.wenjian.Tests;

import org.junit.Test;

import com.wenjian.Pages.BlogPage;
import com.wenjian.Utils.TestCaseBase;

public class BlogTest extends TestCaseBase {
	
	@Test
	public void search_function_should_work() {
		startDriver("Chrome");
		
		String blogUrl = "https://yaowenjie.github.io/";	
		driver.get(blogUrl);
		
		BlogPage blogPage = new BlogPage(driver);
		blogPage.clickSearchBtn();
		blogPage.inputSearchWording("PowerShell");
		blogPage.clickFirstResultOfSearch();
	}
}