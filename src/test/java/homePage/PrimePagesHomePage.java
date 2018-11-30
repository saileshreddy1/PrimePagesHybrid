package homePage;

import org.testng.annotations.Test;

import businessFunction.VerifyElementsInPrimePagesHome;

public class PrimePagesHomePage extends Root {

	public static VerifyElementsInPrimePagesHome objVEPP = new VerifyElementsInPrimePagesHome(objBrow);

	@Test
	public void VerifyHomePage() {
		
		objBrow.configDriver("Chrome");
		objVEPP.setup();
		objVEPP.verifyTitle();
		objVEPP.verifyHeaderElementsPresentinHomePage();
		objVEPP.verifyElementsUnderProfessional();
		objVEPP.verifyElementsUnderServices();
		objVEPP.verifyElementsUnderCommerceandBusiness();
		objVEPP.verifyElementsUnderIndustriesandManufacturing();
		objVEPP.verifyElementsUnderMoterVechical();
		objVEPP.verifyElementsUnderHotelandTravel();
		objVEPP.verifyElementsUnderRealEstateandConstructions();
		objVEPP.verifyElementsUnderAgricultureandAlliedFields();
		objVEPP.verifyElementsUnderEducaion();
		objVEPP.verifyElementsUnderEmployment();
		objVEPP.verifyElementsUnderEntertainmentandSports();
		objVEPP.verifyElementsUnderOthers();
		objVEPP.verifyElementsUnderFooter();
		objBrow.quitBrowser();

	}
}
