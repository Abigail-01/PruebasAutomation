package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;

public class BasePage {
	protected static WebDriver driver;
	private static WebDriverWait wait;

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	}

	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
	}

	public static void navigateTo(String url) {
		driver.get(url);
	}

	private WebElement Find(String locator) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		return driver.findElement(By.xpath(locator));

	}
	public void clickElement(String locator) {
		Find(locator).click();
		
	}
	public void write (String locator, String testToWrite ) {
		Find(locator).clear();
		Find(locator).sendKeys(testToWrite);
		
	}
	public void selecFromDropdownByValue(String locator, String valueToSelect) {
		Select dropdown = new Select (Find(locator));
		dropdown.selectByValue(valueToSelect);
		
	}
	public void selecFromDropdownByIndex(String locator, int valueToSelect) {
		Select dropdown = new Select (Find(locator));
		dropdown.deselectByIndex(valueToSelect);
		
	}
	public void selecFromDropdownByText(String locator, String valueToSelect) {
		Select dropdown = new Select (Find(locator));
		dropdown.deselectByVisibleText(valueToSelect);
		
	}
	//public void s
	
	

	public static void closeBrowser() {
		driver.quit();
	}
}