package com.osa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.osa.utility.Uitility;

public class Forum {
public static Logger log=Uitility.getLog(Forum.class);
	public Forum(WebDriver dr) {
		PageFactory.initElements(dr, this);
		}
@FindBy(id="username")
WebElement userName;
@FindBy(id="password")
WebElement password;
@FindBy(id="login_button")
WebElement loginButton;

/**
 * Pass username as parameter, 
 * @param username
 */
public void enterUsername(String username) {
	log.info("Entering the username : "+username);
	userName.sendKeys(username);
}
public void enterPassword(String passWord) {
	log.info("Entering the username : ********");
	password.sendKeys(passWord);
}
public void clickOnLoginButton() {
	log.info("Clicking on Login Button");
	loginButton.click();
}
}
