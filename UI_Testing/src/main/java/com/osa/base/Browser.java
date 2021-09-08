package com.osa.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.osa.utility.Uitility;

public class Browser {
	public static Logger log=Uitility.getLog(Browser.class);
	public static WebDriver openBrowser(String browser) {
		WebDriver dr=null;
		String os=System.getProperty("os.name");
		log.info("The test is running on "+os);
		//92.0
		if(browser.equals("chrome")) {
		log.info("Setting chrome driver path");
		System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\windows\\chromedriver.exe");
		log.info("Creating object for ChromeDriver");
		dr=new ChromeDriver();
		}else {
			System.out.println("Firefox driver is working");
		}
		log.info("Maximizing the window screen");
		dr.manage().window().maximize();
		log.info("Setting implicitlyWait in the browser");
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return dr;
	}
}
