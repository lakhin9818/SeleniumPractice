package Script;

import org.testng.annotations.Test;

import PageObject.homePage;
import TestBase.testBase;

public class homePageTest extends testBase {
	homePage HmObj = new homePage();

//Scripting Only here
	@Test
	public void VerifyPageTitle() {
		HmObj.verifyTitle();

	}

	// create user/signup function
	@Test
	public void signupUser() {
		HmObj.signUpUser();
		HmObj.signUpUser();
	}
}
