package com.portal.login;

import static com.utils.Pesection.Appconfig.PORTAL_URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webdriver.DriverManager;



public class LoginToPortal {
	
	public WebDriver driver;
    public WebDriverWait wait;
    LoginToHomePageFactory pomLogin;
       	public void LoginWeb(String username, String password){
		//WebDriver driver = new FirefoxDriver();
   		driver = DriverManager.getManager().getDriver();
		DriverManager.getManager().getDriver().get(PORTAL_URL);
		pomLogin = PageFactory.initElements(driver, LoginToHomePageFactory.class);
        pomLogin.getUserNameTxt().sendKeys(username);
        pomLogin.getPasswordTxt().sendKeys(password);
        pomLogin.getLoginBtn().click();
        System.out.println("");
	}
   	
    public void teradown(){
    	driver = DriverManager.getManager().getDriver();
    	pomLogin = PageFactory.initElements(driver, LoginToHomePageFactory.class);
    	pomLogin.getsettingICON().click();
    	pomLogin.getlogOUT_btn().click();
    	driver.close();
    }

}
