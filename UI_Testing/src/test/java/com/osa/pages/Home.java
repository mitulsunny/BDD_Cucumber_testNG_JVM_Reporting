package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.base.Browser;
import com.osa.utility.Uitility;

public class Home {
public static Logger log=Uitility.getLog(Home.class);
public Home(WebDriver dr) {
	PageFactory.initElements(dr, this);
	}
@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[1]/a") 
WebElement homeButton;
@FindBy(xpath="//a[text()='Forum']")
WebElement forumButton;

public void clickOnHomeButton() {
	log.info("Clicking on Home Button");
	homeButton.click();
}
public void clickOnForumButton() {
	log.info("Clicking on Forum Button");
		forumButton.click();
	}
}
