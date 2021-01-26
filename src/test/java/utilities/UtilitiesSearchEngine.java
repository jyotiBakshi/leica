package utilities;

import org.openqa.selenium.By;

public class UtilitiesSearchEngine extends InitiateDriver {

	private String txtboxSearch="sb_form_q";
	private String searchKey="Leica Geosystems\n";
	public String xpathTopResult="(//*[@id='b_results']/li[@class='b_algo']//h2/a)[1]";
	public String expectedTopResult="leica-geosystems.com";	
	private String searchEngine="http://bing.com";
	
	public void openSearchEngine() {
		driver.get(searchEngine);
	}
	
	public void enterSearchKey() {
		driver.findElement(By.id(txtboxSearch)).sendKeys(searchKey);
	}
	
}
