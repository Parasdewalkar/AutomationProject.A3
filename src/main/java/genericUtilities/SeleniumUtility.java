package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

	/**This method will maximize the window
	 * 
	 * @param driver
	 * @param element
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method will add 110 seconds of implicitly wait
	 * @param driver
	 */
	
	public void  addImplicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method will wait 10 seconds for a element to be visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * This method will handle dropdown by index
	 * @param element
	 * @param indexDropdown
	 */
	
	public void handleDropdown( WebElement element, int indexDropdown) {
		Select sel  = new Select(element);
		sel.selectByIndex(indexDropdown);
	}
	
	
	/**
	 * This method will handle dropdown by value
	 * @param element
	 * @param valueDropdown
	 */
	public void handleDropdown( WebElement element , String  valueDropdown) {
		Select sel  = new Select(element);
		sel.selectByValue(valueDropdown);
	}
	
	/**
	 * This method will handle dropdown by visibleText
	 * @param visibleTextDropdown
	 * @param element
	 */
	public void handleDropdown(String visibleTextDropdown,WebElement element) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleTextDropdown);
	}

	/**
	 * This method will move the cursor to WebElement
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element ) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();;
	}
	
	/**
	 * This method will perform double click 
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform Rightclick 
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	
	/**
	 * This method is used to Perform dragAndDrop
	 * @param driver
	 * @param src
	 * @param dest
	 */
	
	public void dragAndDropAction(WebDriver driver , WebElement src, WebElement dest) {
		Actions action  = new Actions(driver);
		action.dragAndDrop(src, dest).perform();;
	}
	
	public void drapAndDropAction(WebDriver driver, int xOffSet, int yOffSet) {
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(null, xOffSet, yOffSet);
	}
	
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollToWebElementAction(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		
		action.scrollToElement(element);
	}

	/**
	 * Frame Handling by WebElement
	 * @param driver
	 * @param element
	 */
	
	public void frameHandling(WebDriver driver, WebElement element) {
		
		driver.switchTo().frame(element);
	}
	
	/**
	 * 
	 * @param driver
	 * @param indexFrame
	 */
	public void FrameHandling(WebDriver driver, int indexFrame) {
		driver.switchTo().frame(indexFrame);
	}
	
	/**
	 * 
	 * @param driver
	 * @param stringFrame
	 */
	public void frameHandling(WebDriver driver, String stringFrame) {
		driver.switchTo().frame(stringFrame);
	}

}
