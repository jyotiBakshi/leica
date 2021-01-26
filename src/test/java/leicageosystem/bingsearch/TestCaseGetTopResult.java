package leicageosystem.bingsearch;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.UtilitiesSearchEngine;

public class TestCaseGetTopResult extends UtilitiesSearchEngine {
	@Test
	public void GetTopResultTest() {
		initiateChromeDriver(); //Set property of chrome driver and open it
		openSearchEngine(); //Open bing search engine in browser
		enterSearchKey(); //Search for a key
		String actualTopResult=driver.findElement(By.xpath(xpathTopResult)).getAttribute("href"); //Get the top result returned
		assertTrue(actualTopResult.contains(expectedTopResult),"Expected result doesn't match the actual result");
		closeDriver();
	}
}
