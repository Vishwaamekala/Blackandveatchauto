package com.wipro.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.wipro.qa.util.TestUtilDemo;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	
	public static  WebDriver driver ;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebDriverWait webDriverWait;

	public static String ProjectID;


	public TestBase(){
		try {

			prop = new Properties();
			FileInputStream ip = new FileInputStream("src/test/java/com/wipro/qa/config/config.properties");

			//FileInputStream ip = new FileInputStream("/Users/Rat105478/CucumberReportWorkSpace/BVLaminarAutomationWithReport/src/test/java/com/wipro/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver88.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver =new ChromeDriver(capabilities);
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
			driver = new FirefoxDriver(); 
		}
		
		
		/*
		 * e_driver = new EventFiringWebDriver(driver); // Now create object of
		 * EventListerHandler to register it with EventFiringWebDriver eventListener =
		 * new WebEventListener(); e_driver.register(eventListener); driver = e_driver;
		 */
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilDemo.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilDemo.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("sitUrl"));
		webDriverWait = new WebDriverWait(driver,30000);

	}
	
	
	
	
	
	
	
	

}
