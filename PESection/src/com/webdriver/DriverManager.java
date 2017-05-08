package com.webdriver;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.utils.Pesection.Appconfig.*;


public class DriverManager {
	private static DriverManager manager = null;
	private WebDriver driver;
	private WebDriverWait wait;


	protected DriverManager() {
		initializeDriver();
	}

	/**
	 * Select a browser
	 */
	private void initializeDriver() {
		if (BROWSER.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + IEDRIVER_PATH);
			driver = new InternetExplorerDriver();
		} else if (BROWSER.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + CHROMEDRIVER_PATH);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(IMPLICIT_WAIT, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, EXPLICIT_WAIT, WEBDRIVERWAIT_SLEEP);
	}

	public static DriverManager getManager() {
		if (manager == null || manager.driver.toString().contains("null")) {
			manager = new DriverManager();
		}
		return manager;
	}

	/**
	 * Get the Web driver
	 *
	 * @return WebDriver instance
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * Get wait
	 * @return WebDriverWait instance
     */
	public WebDriverWait getWait() {
		return wait;
	}

	/**
	 * Set to null the webdriver
	 */
	public void quitDriver() {
		try {

			driver.quit();
		} catch (Exception e) {

		}
		driver = null;
	}

}
