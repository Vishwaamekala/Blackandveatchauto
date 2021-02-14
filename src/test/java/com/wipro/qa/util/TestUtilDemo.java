package com.wipro.qa.util;
/**
 * @author Rat105478
 *
 */
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.wipro.qa.base.TestBase;

import io.cucumber.java.en.Then;

public class TestUtilDemo extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	private static Actions actions;

	public static boolean isElementPresent(By locator, String elementName) {
		try {

			getWebElement(locator).isDisplayed();
			// report.InfoTest(elementName + "is present");
			return true;
		} catch (NoSuchElementException e) {

			// report.addFailLog("Class Utils | Method OpenBrowser | Exception Desc :
			// "+e.getMessage(), "Failed");
			return false;
		}
	}
	
	
	public static void doSendKeys(By locator, String value) {
		try {

			// getWebElement(locator).clear();
			getWebElement(locator).sendKeys(value);
			// report.InfoTest("<b>" +value+ "</b>" + "entered in inputbox");
		} catch (Exception e) {

			System.out.println("Some exception occured while sending to webelement" + locator);
			// report.addFailLog("Class Utils | Method OpenBrowser | Exception Desc :
			// "+e.getMessage(), "Failed");
		}
	}
	
	public static void doSendKeysExecuter(By locator, String value) {
		try {

			WebElement wb = driver.findElement(locator);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='';", wb);
			getWebElement(locator).sendKeys(value);
			// report.InfoTest("<b>" +value+ "</b>" + "entered in inputbox");
		} catch (Exception e) {

			System.out.println("Some exception occured while sending to webelement" + locator);
			// report.addFailLog("Class Utils | Method OpenBrowser | Exception Desc :
			// "+e.getMessage(), "Failed");
		}
	}

	public static void clearAnddoSendKeys(By locator, String value) {
		try {

			getWebElement(locator).clear();
			getWebElement(locator).sendKeys(value);
			// report.InfoTest("<b>" +value+ "</b>" + "entered in inputbox");
		} catch (Exception e) {

			System.out.println("Some exception occured while sending to webelement" + locator);
			// report.addFailLog("Class Utils | Method OpenBrowser | Exception Desc :
			// "+e.getMessage(), "Failed");
		}
	}

	public static String getTex(By locator) {

		WebElement element = driver.findElement(locator);
		String text = element.getText();
		// report.InfoTest(element + "is present");

		return text;
	}

	/**
	 * Method to click on an element
	 * 
	 * @param locator         : String : Locator type (id, name, class, xpath, css)
	 * @param stepDiscription : String : Locator value
	 */
	public static void clickElement(By locator, String stepDiscription) throws RuntimeException {
		try {
			WebElement element = getWebElement(locator);
			if (element.isEnabled()) {
				element.click();
				// waitUntil(300);
			} else
				System.out.println(" below report statement will be implemented");
			// report(FAIL, identifier "Click on: ");
		} catch (Exception e) {
			e.printStackTrace();
			// report(FAIL, identifier "Click on: ");
		}
	}
	
	public static boolean clickElements(By locator, String stepDiscription) throws RuntimeException {
		try {
			WebElement element = getWebElement(locator);
				element.click();
				return true;
			} 
		
		catch (Exception e) {
			return false;
		}
	}

	public static WebElement getWebElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			/*
			 * if(flash.equalIgnoreCase("yes")) { JavaScriptUtil.flash(element,driver); }
			 */

		} catch (Exception e) {
			System.out.println("Some Exception occured while creating webelement " + locator);
		}
		return element;

	}
	
	public static boolean isEnabled(By locator, String elementName) {
		try {

			getWebElement(locator).isEnabled();
			// report.InfoTest(elementName + "is present");
			return true;
		} catch (NoSuchElementException e) {

			// report.addFailLog("Class Utils | Method OpenBrowser | Exception Desc :
			// "+e.getMessage(), "Failed");
			return false;
		}
	}

	/**
	 * Method of dropDownSelect
	 * 
	 * @param locator         : String : Locator type (id, name, class, xpath, css)
//	 * @param stepDiscription : String : Locator value
	 */
	public static void dropDownSelect(By locator, String val, String elementName) throws RuntimeException {
		WebElement element = driver.findElement(locator);
		Select drp = new Select(element);
		drp.selectByVisibleText(val);
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}
	
	/**
	 * Method of dropDownSelect byIndex
	 * 
	 * @param locator         : String : Locator type (id, name, class, xpath, css)
//	 * @param stepDiscription : String : Locator value
	 */
	public static void dropDownSelectByIndex(By locator, int val, String elementName) throws RuntimeException {
		WebElement element = driver.findElement(locator);
		Select drp = new Select(element);
		drp.selectByIndex(val);
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}

	/**
	 * Method of dropDownSelect byValue
	 * 
	 * @param locator         : String : Locator type (id, name, class, xpath, css)
//	 * @param stepDiscription : String : Locator value
	 */
	public static void dropDownSelectByValue(By locator, String val, String elementName) throws RuntimeException {
		WebElement element = driver.findElement(locator);
		Select drp = new Select(element);
		drp.selectByValue(val);
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}

	public static void scrollDownForLogPage() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,200000)");
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}
	public static void scrollDown() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,70000)");
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}
	public static void scrollDownForShort() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}
	
	public static void scrollDownTillBottum() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
	public static void scrollDownToElementPresent(By locator) throws RuntimeException {
		WebElement Element = driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    //This will scroll the page till the element is found		
	     jse.executeScript("arguments[0].scrollIntoView(true);", Element);
	}
	
	public static void scrollUpTop() throws RuntimeException {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
        jse.executeScript("window.scrollBy(0,-1000)",")");
  }
	public static void scrollUP() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, -700000)");
		// report.InfoTest("<b>" +val+ "</b>" + "Selected Form" +elementName+
		// "dropDown");

	}
	
	public static void scrollUpToElementPresent(By locator) throws RuntimeException {

		WebElement element = driver.findElement(locator);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', 'background: green; border: 3px solid blue;');", element);
		jse.executeScript("arguments[0].scrollIntoView()", element);
		}
	public static void scrolltoponly() throws RuntimeException {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0, 0);");
		}
	
	
	public static void scrollUp() throws RuntimeException, Throwable {
		Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		//Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		
		}
	
	public static void mouseHover(By locator) throws RuntimeException {
		 WebElement ele = driver.findElement(locator);
		 Actions action = new Actions(driver);
		 action.moveToElement(ele).build().perform();

	}
	public static void mouseHoverAndClick(By locator) throws RuntimeException {
		 WebElement ele = driver.findElement(locator);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(ele);
		 actions.click().build().perform();
	}
	
	
}
