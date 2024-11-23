package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import SelTest.homePage;

public class testBase {
	public static WebDriver driver;

	@BeforeTest
	public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\lakhin\\SeleniumPractice\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://automationexercise.com/");
		return driver;
	}

	public String click(WebElement ele, String msg) {
		ele.click();
		return msg;
	}

	public void waitForElementToBeClickable(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
