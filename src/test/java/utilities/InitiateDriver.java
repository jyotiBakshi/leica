package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {

	public WebDriver driver;
	private final String chromeDriverPath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";
	
	public void initiateChromeDriver() {	

		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver= new ChromeDriver();
	}
	
	public void closeDriver() {
		driver.quit();
	}
}

