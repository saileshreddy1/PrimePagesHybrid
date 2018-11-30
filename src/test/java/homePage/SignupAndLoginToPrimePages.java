package homePage;

import java.awt.AWTException;

import org.testng.annotations.Test;

import businessFunction.VerifyElementsInPrimePagesHome;

public class SignupAndLoginToPrimePages extends Root {

	public static VerifyElementsInPrimePagesHome objVEPP = new VerifyElementsInPrimePagesHome(objBrow);
	businessFunction.SignupAndLoginToPrimePages objSLPP=new businessFunction.SignupAndLoginToPrimePages(objBrow);

	@Test
	public void VerifyHomePage() throws InterruptedException, AWTException {
		
		objBrow.configDriver("Chrome");
		objVEPP.setup();
		objVEPP.verifyTitle();
		objVEPP.verifyHeaderElementsPresentinHomePage();
		objSLPP.setup();
		objSLPP.ClickonSignupLink();
		objSLPP.signupIntoPrimePages("Sachin", "Tendulkar", "master2000000@gmail.com", "9874561230", "Welcome@123");
		objSLPP.verifyTitleofThePage("Primepagesinfo - Your Business Webpage");
		objSLPP.createFreeWebPage("Commerce & Business", "Gold and Jewellery show rooms", "Jewellery Shops","Jewellery Shops", "SachinTendulkar", "APOODGHJBT12345", "number10@gmail.com", "9988774455", "Andhra Pradesh", "Tirupati", "Tirupati", "Tirupati is the city where user can get the gold");
		objSLPP.verifyTitleofThePage("Primepagesinfo - Your Business Webpage");
		Thread.sleep(5000);
		objBrow.quitBrowser();
	
	}
	
}
