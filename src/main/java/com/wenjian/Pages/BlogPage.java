package com.wenjian.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wenjian.Utils.BasePage;

public class BlogPage extends BasePage{
	public BlogPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.pageDriver = driver;
	}

	@FindBy(xpath = "//*[@id=\"masthead\"]/button[2]")
	private WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/div[1]/div/input")
	private WebElement searchInput;
	
	@FindBy(xpath = "/html/body/div[1]/div/ul/li[1]/article/a")
	private WebElement searchResultFirst;
	
	public void clickSearchBtn() {
		searchBtn.click();
	}
	
	public void inputSearchWording(String key) {
		searchInput.clear();
		searchInput.sendKeys(key);
	}
	
	public void clickFirstResultOfSearch() {
		searchResultFirst.click();
	}
}
