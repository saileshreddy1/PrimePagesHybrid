package lib;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CommonMethods {

	WebDriver Driver;
	WebDriverWait wait;
	Actions objAction; 
//	
//	 	     To Launch Browser
	
	
	public void configDriver(String strBrowser)
	{
		if(strBrowser.equalsIgnoreCase("Firefox"))
		{
			try 
			{
				System.setProperty("webdriver.gecko.driver","E:\\geckodriver.exe");
				Driver=new FirefoxDriver();		
				Driver.manage().window().maximize();
				Reporter.log("FireFox Driver Launched to start Testing on Prime Pages");
				Driver.get("https://primepagesinfo.com/dev/home");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if (strBrowser.equalsIgnoreCase("Chrome")) {
		
			try {
				System.setProperty("webdriver.chrome.driver",
						"E:\\chromedriver.exe");
				Driver = new ChromeDriver();
				Driver.manage().window().maximize();
				Reporter.log("Chrome Driver Launched to start Testing on Prime Pages");
				Driver.get("https://primepagesinfo.com/dev/home");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else
		{
			Reporter.log("Invalid Driver Passed");
		}
		
	}
	
	
//	
//	 		To Identify the webelement		
// 	
	
	public WebElement webElementLocator(String strIdentifier, String strLocator)
	{
		WebElement element = null;
//		Driver.findElement(By.xpath(""));
		switch (strIdentifier) {

		case "id":
			element = Driver.findElement(By.id(strLocator));
			break;
			
		case "name":
			element = Driver.findElement(By.name(strLocator));
			break;
			
		case "ClassName":
			element = Driver.findElement(By.className(strLocator));
			break;
			
		case "tagName":
			element = Driver.findElement(By.tagName(strLocator));
			break;
			
		case "linkText":
			element = Driver.findElement(By.linkText(strLocator));
			break;
			
		case "partialLinkText":
			element = Driver.findElement(By.partialLinkText(strLocator));
			break;
			
		case "xpath":
			element = Driver.findElement(By.xpath(strLocator));
			break;
			
		case "cssSelector":
			element = Driver.findElement(By.cssSelector(strLocator));
			break;
			
		}
		return element;
		
	}
	

	
//	
//	 	   To Send the data into the text box field	    
	
	 
	public void sendKeys(String strIdentifier, String strLocator, String strContent)
	{
		WebElement element= webElementLocator(strIdentifier, strLocator);
		element.sendKeys(strContent);
	}
	
//	
//	  				To clear text in the text box field
		
	public void clearText(String strIdentifier, String strLocator) {

		WebElement element= webElementLocator(strIdentifier, strLocator);
		element.clear();
	}
	
//				To perform Click operations
//	
	public void clickonWebElement(String strIdentifier, String strLocator)
	{
		WebElement element= webElementLocator(strIdentifier, strLocator);
		element.click();	
	}
	
//	To Identify Multiple WebElemets 
//	
	
	public List<WebElement> multipleWebElementLocator(String strMultipleElementIdentifier, String strMultipleElementLocator)
	{
		
		List<WebElement> objElement =null; 
				
		switch (strMultipleElementIdentifier) {

		case "id":
			objElement = Driver.findElements(By.id(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "name":
			objElement = Driver.findElements(By.name(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			
			break;
			
		case "ClassName":
			objElement = Driver.findElements(By.className(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "tagName":
			objElement = Driver.findElements(By.tagName(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "linkText":
			objElement = Driver.findElements(By.linkText(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "partialLinkText":
			objElement = Driver.findElements(By.partialLinkText(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "xpath":
			objElement = Driver.findElements(By.xpath(strMultipleElementLocator));
			Reporter.log("Size of links present under this categories "+objElement.size());
			for (int i = 0; i < objElement.size(); i++)
			{
				
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		case "cssSelector":
			objElement = Driver.findElements(By.cssSelector(strMultipleElementLocator));
			for (int i = 0; i < objElement.size(); i++)
			{
				
				if (objElement.get(i).isDisplayed())
				{
					String strElementName = objElement.get(i).getText();
					Reporter.log(strElementName +" link is displayed");
				}
			} 
			break;
			
		}
		return objElement;
	}
	
	public void dropDown(String strIdentifier, String strLocator)
	{
		WebElement element= webElementLocator(strIdentifier, strLocator);
		Select sel=new Select(element);
		if (element.isDisplayed())
		{
			sel.selectByIndex(25);
		}
		else
		{
			sel.selectByVisibleText("Hotel & Travel");
		}
	}
	
	
//	public void verifyMultipleLinksPresent(String strIdentifier, String strLocator, String strMultipleElementIdentifier, String strMultipleElementLocator)
//	{
//		List<WebElement> objMultipleElements=multipleWebElementLocator(strMultipleElementIdentifier, strMultipleElementLocator);
//		for (int i = 0; i < objMultipleElements.size(); i++)
//		{
//			String strElementName = objMultipleElements.get(i).getText();
//			if (objMultipleElements.get(i).isDisplayed())
//			{
//				Reporter.log(strElementName +" link is displayed");
//			}
//		} 
//	}

//		To verify the page title
//	
	
	public void verifyTitleofThePage(String strTitle)
	{
		if (Driver.getTitle().equals(strTitle)){
			
			Reporter.log(strTitle + " is displayed as expected as head section");
		}
		else
		{
			Reporter.log("failed to  display the title");
		}
	}
	
//	
//	Wait until element present
	
	public WebElement waitUntilElementPresent(String strIdentifier, String strLocator)
	{
		
		WebElement waitWebElement=null;
		wait= new WebDriverWait(Driver, 30);
		switch(strIdentifier) {
		
		case "id":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(strLocator)));
			break;
			
		case "name":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.name(strLocator)));
			break;
			
		case "className":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className(strLocator)));
			break;
			
		case "tagname":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName(strLocator)));
			break;
			
		case "linkText":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(strLocator)));
			break;

		case "partialLinkText":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(strLocator)));
			break;
			
		case "xpath":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(strLocator)));
			break;
			
		case "cssSelector":
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(strLocator)));
			break;
		}
		return waitWebElement;
	}
	
//	
//			Verify teh text 
	
	
	public void verifyElementPresent(String strIdentifier, String strLocator)
	{
		WebElement element = webElementLocator(strIdentifier, strLocator);
		if (element.isDisplayed()){
			
			Reporter.log(element.getText() + " is Displayed");			
		}
		else
		{
			Reporter.log(element.getText() + " is not Displayed");
		}
		
	}
	
//	
//			Thread.Sleep
	

	public void waitForPage()
	{
		try {

			for (int i = 0; i < 50;) {

				if (Driver.getTitle().length() != 0) {

					Reporter.log("Wait for page to load");
				}
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void mouseHowerActions(String strIdentifier, String strLocator)
	{
		objAction = new Actions(Driver);
		WebElement element = webElementLocator(strIdentifier, strLocator);
		objAction.moveToElement(element).build().perform();		
	}
	

	
//	
//	 Close Driver
	
	public void closeBrowser()
	{
		Driver.close();
	}
	
	
//	
//	Quit Driver
	
	
	public void quitBrowser()
	{
		Driver.quit();
	}
	
}


