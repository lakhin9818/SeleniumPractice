package TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

//import SelTest.homePage;

public class testBase {
	public static WebDriver driver;
//	homePage objhomePage;

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

	public void Wait(int timeinSeconds) {
		driver.manage().timeouts().implicitlyWait(timeinSeconds, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 30);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
