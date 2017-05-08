package com.portal.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToHomePageFactory {

	private WebDriver driver;
	protected WebDriverWait wait;

	@FindBy(id = "btnSignin")
	private WebElement loginBtn;

	@FindBy(xpath = ".//*[@id='username']")
	private WebElement userNameTxt;

	@FindBy(xpath = ".//*[@id='password']")
	private WebElement passwordTxt;

	@FindBy(xpath = ".//*[@id='settingIcon']")
	private WebElement settingICON_btn;
	
	@FindBy(xpath = ".//*[@id='logout']/a")
	private WebElement logOUT_btn;
	
	public WebElement getlogOUT_btn() {
		return logOUT_btn;
	}
	
	public WebElement getsettingICON() {
		return settingICON_btn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUserNameTxt() {
		return userNameTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}
}
