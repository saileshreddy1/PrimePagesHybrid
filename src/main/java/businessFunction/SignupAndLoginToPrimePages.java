package businessFunction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import lib.CommonMethods;

public class SignupAndLoginToPrimePages {

	CommonMethods objBrowser;

	public SignupAndLoginToPrimePages(CommonMethods Br) {

		objBrowser = Br;
	}

	String strPath = System.getProperty("user.dir");
	Properties objLocators = new Properties();
	File objHomePageLocatorsFile = new File(
			strPath + "\\src\\main\\java\\elementLocators\\HomePageLocators.properties");
	File objSignUpandLoginPageLocatorsFile = new File(
			strPath + "\\src\\main\\java\\elementLocators\\SignUpandLoginLocators.properties");

//	Setup for properties to access file

	public void setup() {
		try {
			objLocators.load(new FileInputStream(objHomePageLocatorsFile));
			objLocators.load(new FileInputStream(objSignUpandLoginPageLocatorsFile));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ClickonSignupLink() {
		String strSignUpLocator = objLocators.getProperty("SignUp.link.Locator");
		objBrowser.clickonWebElement("xpath", strSignUpLocator);
		objBrowser.verifyTitleofThePage("Primepagesinfo - Login/Signup");
	}

	public void signupIntoPrimePages(String strFirstName, String strLastName, String strEmail, String strNumber,
			String strPassword) {
		String strFirstNameLocator = objLocators.getProperty("FirstName.TextFiled.Locator");
		objBrowser.waitUntilElementPresent("id", strFirstNameLocator);
		objBrowser.verifyElementPresent("id", strFirstNameLocator);
		objBrowser.sendKeys("id", strFirstNameLocator, strFirstName);

		String strLoginLocator = objLocators.getProperty("Login.Link.Locator");
		objBrowser.verifyElementPresent("xpath", strLoginLocator);

		String strLastNameLocator = objLocators.getProperty("LastName.TextFiled.Locator");
		objBrowser.verifyElementPresent("id", strLastNameLocator);
		objBrowser.sendKeys("id", strLastNameLocator, strLastName);

		String strEmailLocator = objLocators.getProperty("Email.TextFiled.Locator");
		objBrowser.verifyElementPresent("id", strEmailLocator);
		objBrowser.sendKeys("id", strEmailLocator, strEmail);

		String strNumberLocator = objLocators.getProperty("Number.TextFiled.Locator");
		objBrowser.verifyElementPresent("id", strNumberLocator);
		objBrowser.sendKeys("id", strNumberLocator, strNumber);

		String strPasswordLocator = objLocators.getProperty("Password.TextFiled.Locator");
		objBrowser.verifyElementPresent("id", strPasswordLocator);
		objBrowser.sendKeys("id", strPasswordLocator, strPassword);

		String strSubmitLocator = objLocators.getProperty("Submit.Button.Locator");
		objBrowser.verifyElementPresent("xpath", strSubmitLocator);
		objBrowser.clickonWebElement("xpath", strSubmitLocator);
	}

	public void verifyTitleofThePage(String strTitle) {
		objBrowser.verifyTitleofThePage(strTitle);
	}

	public void createFreeWebPage(String strCategoryName, String strHeading, String strSubHeading,
			String strMultipleSelection, String strBusinessName, String strGSTNUM, String strBusinessEmail,
			String strBusinessPhone, String strStateName, String strCityName, String strAddress, String strDescription)
			throws InterruptedException, AWTException {

		Thread.sleep(5000);
		String strCategoryNameLocator = objLocators.getProperty("CategoryName.DropDown.Locator");
		objBrowser.waitUntilElementPresent("xpath", strCategoryNameLocator);
		objBrowser.verifyElementPresent("xpath", strCategoryNameLocator);
		objBrowser.sendKeys("xpath", strCategoryNameLocator, strCategoryName);
		Thread.sleep(1000);
		String strHeadingLocator = objLocators.getProperty("Heading.DropDown.Locator");
		objBrowser.waitUntilElementPresent("id", strHeadingLocator);
		objBrowser.verifyElementPresent("id", strHeadingLocator);
		objBrowser.sendKeys("id", strHeadingLocator, strHeading);
		Thread.sleep(1000);
		String strSubHeadingLocator = objLocators.getProperty("SubHeading.DropDown.Locator");
		objBrowser.waitUntilElementPresent("id", strSubHeadingLocator);
		objBrowser.verifyElementPresent("id", strSubHeadingLocator);
		objBrowser.sendKeys("id", strSubHeadingLocator, strSubHeading);
		Thread.sleep(1000);
		String strMultipleSelectionLocator = objLocators.getProperty("MultipleSelection.DropDown.Locator");
		objBrowser.waitUntilElementPresent("id", strMultipleSelectionLocator);
		objBrowser.verifyElementPresent("id", strMultipleSelectionLocator);
		objBrowser.sendKeys("id", strMultipleSelectionLocator, strMultipleSelection);

		String strChooseButtonLocator = objLocators.getProperty("Choose.Button.Locator");
		objBrowser.waitUntilElementPresent("name", strChooseButtonLocator);
		objBrowser.clickonWebElement("name", strChooseButtonLocator);

		Robot objRB = new Robot();
		StringSelection strImage = new StringSelection(
				"C:\\Users\\Sailesh Reddy\\Desktop\\my data\\Desktop\\Jokes images\\30.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strImage, null);
		objRB.delay(1000);
		objRB.keyPress(KeyEvent.VK_CONTROL);
		objRB.keyPress(KeyEvent.VK_V);
		objRB.keyRelease(KeyEvent.VK_V);
		objRB.keyRelease(KeyEvent.VK_CONTROL);
		objRB.delay(1000);
		objRB.keyPress(KeyEvent.VK_ENTER);
		objRB.keyRelease(KeyEvent.VK_ENTER);
		objRB.delay(2000);

		String StrBusinessNameLocator = objLocators.getProperty("BusinessName.TextField.Locator");
		objBrowser.waitUntilElementPresent("xpath", StrBusinessNameLocator);
		objBrowser.verifyElementPresent("xpath", StrBusinessNameLocator);
		objBrowser.sendKeys("xpath", StrBusinessNameLocator, strBusinessName);

		String strGSTNUMLocator = objLocators.getProperty("GSTNUM.TextField.Locator");
		objBrowser.waitUntilElementPresent("xpath", strGSTNUMLocator);
		objBrowser.verifyElementPresent("xpath", strGSTNUMLocator);
		objBrowser.sendKeys("xpath", strGSTNUMLocator, strGSTNUM);

		String strBusinessEmailLocator = objLocators.getProperty("BusinessEmail.TextField.Locator");
		objBrowser.waitUntilElementPresent("xpath", strBusinessEmailLocator);
		objBrowser.verifyElementPresent("xpath", strBusinessEmailLocator);
		objBrowser.sendKeys("xpath", strBusinessEmailLocator, strBusinessEmail);
		
		String strBusinessPhoneLocator = objLocators.getProperty("BusinessPhone.TextField.Locator");
		objBrowser.waitUntilElementPresent("xpath", strBusinessPhoneLocator);
		objBrowser.verifyElementPresent("xpath", strBusinessPhoneLocator);
		objBrowser.sendKeys("xpath", strBusinessPhoneLocator, strBusinessPhone);

		Thread.sleep(2000);
		String strStateNameLocator = objLocators.getProperty("StateName.DropDown.Locator");
		objBrowser.waitUntilElementPresent("name", strStateNameLocator);
		objBrowser.verifyElementPresent("name", strStateNameLocator);
		objBrowser.sendKeys("name", strStateNameLocator, strStateName);
		Thread.sleep(2000);
		String strCityNameLocator = objLocators.getProperty("CityName.DropDown.Locator");
		objBrowser.waitUntilElementPresent("name", strCityNameLocator);
		objBrowser.verifyElementPresent("name", strCityNameLocator);
		objBrowser.sendKeys("name", strCityNameLocator, strCityName);

		String strAddresslocation = objLocators.getProperty("Address.TextField.Locator");
		objBrowser.waitUntilElementPresent("name", strAddresslocation);
		objBrowser.verifyElementPresent("name", strAddresslocation);
		objBrowser.sendKeys("name", strAddresslocation, strAddress);

		String strModeOfPaymentLocator = objLocators.getProperty("ModeOfPayment.CheckBox.locator");
		objBrowser.waitUntilElementPresent("xpath", strModeOfPaymentLocator);
		objBrowser.clickonWebElement("xpath", strModeOfPaymentLocator);

		String strDescriptionLocator = objLocators.getProperty("Description.TextField.Locator");
		objBrowser.waitUntilElementPresent("name", strDescriptionLocator);
		objBrowser.verifyElementPresent("name", strDescriptionLocator);
		objBrowser.sendKeys("name", strDescriptionLocator, strDescription);

		String strAgreeCheckBoxLocator = objLocators.getProperty("CheckBox.ID.Locator");
		objBrowser.waitUntilElementPresent("id", strAgreeCheckBoxLocator);
		objBrowser.clickonWebElement("id", strAgreeCheckBoxLocator);

		String strSubmitButtonLocator = objLocators.getProperty("Submit.Button.Locator");
		objBrowser.waitUntilElementPresent("xpath", strSubmitButtonLocator);
		objBrowser.clickonWebElement("xpath", strSubmitButtonLocator);

	}

}
