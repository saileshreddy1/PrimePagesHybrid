package businessFunction;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import lib.CommonMethods;

public class VerifyElementsInPrimePagesHome {

//	Arguments Constructor
	
	CommonMethods objBrowser;
	public VerifyElementsInPrimePagesHome(CommonMethods Br) {

		objBrowser = Br;
	}

	String strPath = System.getProperty("user.dir");
	Properties objLocators = new Properties();
	File objHomePageLocatorsFile = new File(
			strPath + "\\src\\main\\java\\elementLocators\\HomePageLocators.properties");

//	Setup for properties to access file

	public void setup() {
		try {
			objLocators.load(new FileInputStream(objHomePageLocatorsFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyTitle() {
		
		objBrowser.verifyTitleofThePage("Primepages | Local business search engine");

	}

	public void verifyHeaderElementsPresentinHomePage() {
		
		/*
		 * Home Page Elements
		 */
		
		String strSelectLocationLocator = objLocators.getProperty("SelectLocation.textbox.Locator");
		objBrowser.verifyElementPresent("xpath", strSelectLocationLocator);

		String strSearchBusinessCategoriesLocator = objLocators
				.getProperty("SearchBusinessCategories.Searchbox.Locator");
		objBrowser.verifyElementPresent("xpath", strSearchBusinessCategoriesLocator);

		String strLoginLocator = objLocators.getProperty("Login.link.Locator");
		objBrowser.verifyElementPresent("xpath", strLoginLocator);

		String strSignUpLocator = objLocators.getProperty("SignUp.link.Locator");
		objBrowser.verifyElementPresent("xpath", strSignUpLocator);

		String strCareersLocator = objLocators.getProperty("Careers.link.Locator");
		objBrowser.verifyElementPresent("xpath", strCareersLocator);

		String strPostInfoLocator = objLocators.getProperty("PostInfo.link.Locator");
		objBrowser.verifyElementPresent("xpath", strPostInfoLocator);

		String strApplyforAgencyLocator = objLocators.getProperty("ApplyforAgency.link.Locator");
		objBrowser.verifyElementPresent("xpath", strApplyforAgencyLocator);

		String strFreeWebPageLocator = objLocators.getProperty("FreeWebPage.link.Locator");
		objBrowser.verifyElementPresent("xpath", strFreeWebPageLocator);

		String strFaceBookLocator = objLocators.getProperty("FaceBook.link.Locator");
		objBrowser.verifyElementPresent("xpath", strFaceBookLocator);

		String strGooglePlusLocator = objLocators.getProperty("GooglePlus.link.Locator");
		objBrowser.verifyElementPresent("xpath", strGooglePlusLocator);

		String strLinkedinLocator = objLocators.getProperty("Linkedin.link.Locator");
		objBrowser.verifyElementPresent("xpath", strLinkedinLocator);

		String strtwitterLocator = objLocators.getProperty("twitter.link.Locator");
		objBrowser.verifyElementPresent("xpath", strtwitterLocator);

	

	}

	public void verifyElementsUnderProfessional() {
		
		/*
		 * Professions Elements
		 */

		String strProfessionsLinkLocator = objLocators.getProperty("Professions.Link.Locator");
		objBrowser.mouseHowerActions("xpath", strProfessionsLinkLocator);
		objBrowser.verifyElementPresent("xpath", strProfessionsLinkLocator);

		String strProfessionsImage = objLocators.getProperty("Professions.image.Locator");
		objBrowser.mouseHowerActions("xpath", strProfessionsImage);

		String strProfessionsgrouplinks = objLocators.getProperty("Professions.links.Locator");
		objBrowser.mouseHowerActions("xpath", strProfessionsgrouplinks);
		objBrowser.multipleWebElementLocator("xpath", strProfessionsgrouplinks);
	}

	public void verifyElementsUnderServices() {
		
		/*
		 * Services
		 */

		String strServiceLocator = objLocators.getProperty("Service.link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strServiceLocator);
		objBrowser.mouseHowerActions("xpath", strServiceLocator);
		objBrowser.verifyElementPresent("xpath", strServiceLocator);

		String strServicesGroupLinks = objLocators.getProperty("UnderServices.links.Locator");
		objBrowser.mouseHowerActions("xpath", strServicesGroupLinks);
		objBrowser.multipleWebElementLocator("xpath", strServicesGroupLinks);

	}

	public void verifyElementsUnderCommerceandBusiness() {
		
		/*
		 * Commerce and Business
		 */

		String strCommerceBusinessLocator = objLocators.getProperty("CommerceBusiness.link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strCommerceBusinessLocator);
		objBrowser.mouseHowerActions("xpath", strCommerceBusinessLocator);
		objBrowser.verifyElementPresent("xpath", strCommerceBusinessLocator);

		String strCommerceBusinessMultipleLocator = objLocators.getProperty("CommerceBusiness.Multiplelinks.Locator");
		objBrowser.mouseHowerActions("xpath", strCommerceBusinessMultipleLocator);
		objBrowser.multipleWebElementLocator("xpath", strCommerceBusinessMultipleLocator);
	}

	public void verifyElementsUnderIndustriesandManufacturing() {
		
		/*
		 * Industries & Manufacturing
		 */

		String strIndustriesManufacturingLocator = objLocators.getProperty("IndustriesManufacturing.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strIndustriesManufacturingLocator);
		objBrowser.mouseHowerActions("xpath", strIndustriesManufacturingLocator);
		objBrowser.verifyElementPresent("xpath", strIndustriesManufacturingLocator);

		String strIndustriesManufacturingMultipleLocator = objLocators
				.getProperty("IndustriesManufacturing.MultipleLink.Locator");
		objBrowser.mouseHowerActions("xpath", strIndustriesManufacturingMultipleLocator);
		objBrowser.multipleWebElementLocator("xpath", strIndustriesManufacturingMultipleLocator);
	}

	public void verifyElementsUnderMoterVechical() {
		
		/*
		 * Motor Vehicles
		 */

		String strMotorVehiclesLocator = objLocators.getProperty("MotorVehicles.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strMotorVehiclesLocator);
		objBrowser.mouseHowerActions("xpath", strMotorVehiclesLocator);
		objBrowser.verifyElementPresent("xpath", strMotorVehiclesLocator);

		String strMotorVehiclesLocatorMultipleLocator = objLocators.getProperty("MotorVehicles.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strMotorVehiclesLocatorMultipleLocator);
	}

	public void verifyElementsUnderHotelandTravel() {
		
		/*
		 * Hotel and Travel
		 */
		
		String strHotelTravelLocator = objLocators.getProperty("HotelTravel.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strHotelTravelLocator);
		objBrowser.mouseHowerActions("xpath", strHotelTravelLocator);
		objBrowser.verifyElementPresent("xpath", strHotelTravelLocator);

		String strHotelTravelLocatorMultipleLocator = objLocators.getProperty("HotelTravel.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strHotelTravelLocatorMultipleLocator);
	}

	public void verifyElementsUnderRealEstateandConstructions() {
		
		/*
		 * Real Estate & Constructions
		 */
		
		String strRealEstateConstructionsLocator = objLocators.getProperty("RealEstateConstructions.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strRealEstateConstructionsLocator);
		objBrowser.mouseHowerActions("xpath", strRealEstateConstructionsLocator);
		objBrowser.verifyElementPresent("xpath", strRealEstateConstructionsLocator);

		String strRealEstateConstructionsLocatorMultipleLocator = objLocators
				.getProperty("RealEstateConstructions.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strRealEstateConstructionsLocatorMultipleLocator);

	}

	public void verifyElementsUnderAgricultureandAlliedFields() {
		
		/*
		 * Agriculture & Allied Fields
		 */

		String strAgricultureAlliedFieldsLocator = objLocators.getProperty("AgricultureAlliedFields.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strAgricultureAlliedFieldsLocator);
		objBrowser.mouseHowerActions("xpath", strAgricultureAlliedFieldsLocator);
		objBrowser.verifyElementPresent("xpath", strAgricultureAlliedFieldsLocator);

		String strAgricultureAlliedFieldsMultipleLocator = objLocators
				.getProperty("AgricultureAlliedFields.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strAgricultureAlliedFieldsMultipleLocator);

	}

	public void verifyElementsUnderEducaion() {
		
		/*
		 * Education
		 */

		String strEducationLocator = objLocators.getProperty("Education.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strEducationLocator);
		objBrowser.mouseHowerActions("xpath", strEducationLocator);
		objBrowser.verifyElementPresent("xpath", strEducationLocator);

		String strEducationMultipleLocator = objLocators.getProperty("Education.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strEducationMultipleLocator);
	}

	public void verifyElementsUnderEmployment() {
		
		/*
		 * Employment
		 */

		String strEmploymentLocator = objLocators.getProperty("Employment.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strEmploymentLocator);
		objBrowser.mouseHowerActions("xpath", strEmploymentLocator);
		objBrowser.verifyElementPresent("xpath", strEmploymentLocator);

		String strEmploymentMultipleLocator = objLocators.getProperty("Employment.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strEmploymentMultipleLocator);
	}

	public void verifyElementsUnderEntertainmentandSports() {
		
		/*
		 * Entertainment & Sports
		 */

		String strEntertainmentSportsLocator = objLocators.getProperty("EntertainmentSports.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strEntertainmentSportsLocator);
		objBrowser.mouseHowerActions("xpath", strEntertainmentSportsLocator);
		objBrowser.verifyElementPresent("xpath", strEntertainmentSportsLocator);

		String strEntertainmentSportsMultipleLocator = objLocators
				.getProperty("EntertainmentSports.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strEntertainmentSportsMultipleLocator);

	}

	public void verifyElementsUnderOthers() {

		/*
		 * Others
		 */

		String strOthersLocator = objLocators.getProperty("Others.Link.Locator");
		objBrowser.waitUntilElementPresent("xpath", strOthersLocator);
		objBrowser.mouseHowerActions("xpath", strOthersLocator);
		objBrowser.verifyElementPresent("xpath", strOthersLocator);

		String strOthersMultipleLocator = objLocators.getProperty("Others.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strOthersMultipleLocator);
	}

	public void verifyElementsUnderFooter() {
		
		/*
		 * Footer Links
		 */

		String strReadMoreLocator = objLocators.getProperty("ReadMore.Link.Locator");
		objBrowser.verifyElementPresent("xpath", strReadMoreLocator);

		String strRelatedLinksMultipleLocator = objLocators.getProperty("Related.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strRelatedLinksMultipleLocator);

		String strFollowUsLinksMultipleLocator = objLocators.getProperty("FollowUs.MultipleLink.Locator");
		objBrowser.multipleWebElementLocator("xpath", strFollowUsLinksMultipleLocator);

		String strVRCPLLocator = objLocators.getProperty("VRCPL.Link.Locator");
		objBrowser.verifyElementPresent("xpath", strVRCPLLocator);
	}
	
	
	
	
	
	

	
	public void test()
	{
		
//		import java.util.HashMap;
//		import java.util.Map;
//		import java.util.Map.Entry;
		/*
		Map<String, String[]> properties = new HashMap<>();
		
		String[] linkKeys = listOf("Login.link", "SignUp.link", "Careers.link", "PostInfo.link", "ApplyforAgency.link", 
				"FreeWebPage.link");
		
		String[] xpathKeys = listOf("SelectLocation.textbox", "SearchBusinessCategories.Searchbox", "FaceBook.link",
				"GooglePlus.link", "Linkedin.link", "twitter.link");
		
		properties.put("link", linkKeys);
		properties.put("xpath", xpathKeys);
		
		
		for (Entry<String, String[]> entry : properties.entrySet()) {
			String propertyType = entry.getKey();
			String[] keys = entry.getValue();
			for (String key : keys) {
				String property = objLocators.getProperty(key);
				objBrowser.verifyElementPresent(propertyType, property);
			}
		}
	*/
		
		
/*		
 
 		String[] linkKeys = listOf("Login.link", "SignUp.link", "Careers.link", "PostInfo.link", "ApplyforAgency.link", 
				"FreeWebPage.link");
		
		String[] xpathKeys = listOf("SelectLocation.textbox", "SearchBusinessCategories.Searchbox", "FaceBook.link",
				"GooglePlus.link", "Linkedin.link", "twitter.link");
		
		for (String linkKey : linkKeys) {
			String property = objLocators.getProperty(linkKey);
			objBrowser.verifyElementPresent("link", property);
		}
		
		for (String xpathKey : xpathKeys) {
			String property = objLocators.getProperty(xpathKey);
			objBrowser.verifyElementPresent("xpath", property);
		}
*/
		
		
		
		
		/*	
	 	final String[] xpaths = listOf(strSelectLocation, strSearchBusinessCategories, strFaceBook, strGooglePlus, strtwitter);
		
		final String[] links = listOf(strLinkedin, strLogin, strSignUp, strCareers, strPostInfo, strFreeWebPage, strApplyforAgency);
		
		
		for (String xpath : xpaths) {
			objBrowser.verifyElementPresent("xpath", xpath);
		}
		
		for (String link : links) {
			objBrowser.verifyElementPresent("link", link);
		}
		
	*/
		
		
		/*
		String[] listOf(String ...elements){
			return elements;
		}
		*/
		
	}
}
