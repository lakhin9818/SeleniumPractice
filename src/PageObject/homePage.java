package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import TestBase.testBase;

public class homePage extends testBase {
	WebDriver driver;

//WebElements
//	WebElement LoginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement LoginButton;

	public homePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//logics here
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void verifyTitle() {
		String ExpectedTitle = "Automation Exercise";
		Assert.assertEquals(getTitle(), ExpectedTitle);

	}

	public String signUpUser() {
		String msg;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitForElementToBeClickable(LoginButton);
		msg = click(LoginButton, "Clicking Signup/login button");
		return msg;
	}
}
