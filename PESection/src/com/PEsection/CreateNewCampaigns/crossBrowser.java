package com.PEsection.CreateNewCampaigns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class crossBrowser {

	public static void main(String[] args) {
	  WebDriver wb = new FirefoxDriver();
	  wb.get("https://app.crossbrowsertesting.com");
	  wb.findElement(By.xpath(".//*[@id='inputEmail']")).sendKeys("vijay.mishra@pixere.net");
	  wb.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys("vijay@0701");
	  wb.findElement(By.xpath(".//*[@id='general-form']/div[3]/button")).click();
	  wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  wb.findElement(By.xpath("//*[@id='address']")).sendKeys("http://personalizedemailstest.cloudapp.net");
	  wb.findElement(By.xpath(".//*[@class ='submit']")).click();
	  wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wait = new WebDriverWait(wb, 60);
	  wait.until(ExpectedConditions.elementToBeClickable(wb.findElement(By.id("novnc-canvas"))));
	  wb.switchTo().window("login");
	  
	  wb.findElement(By.id("username")).sendKeys("eakes");
	}
}
