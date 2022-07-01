package irctc.Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class trains {
	
	public WebDriver driver;
		
		public  trains (WebDriver driver) {
			this.driver = driver;
		}
			@FindBy (how = How.XPATH, using="//div[@class='col-sm-5 col-xs-11 train-heading']") WebElement atrains;
			@FindBy (how=How.CSS, using="#divMain > div > app-train-list > div.col-sm-9.col-xs-12 > div > div.ng-star-inserted > div:nth-child(8) > div.form-group.no-pad.col-xs-12.bull-back.border-all > app-train-avl-enq > div.ng-star-inserted > div:nth-child(5) > div.white-back.col-xs-12.ng-star-inserted > table > tr > td:nth-child(2) > div") WebElement clicknext;
			@FindBy (how=How.CSS, using="//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[8]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]") WebElement scrshot;
			
			
			public void avatrains () {
		List<WebElement> trainlist = driver.findElements(By.ByXPath.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
		
		System.out.println(trainlist.size());
		
		for(int i=0; i<trainlist.size();i++) {
			
			System.out.println(trainlist.get(i).getText());
		}
			}
			
			public void scroll() {
				
				
				((JavascriptExecutor)driver).executeScript("scroll(0,2400)");
			
			}
			
public void clicknextbut() {
	clicknext.click();
	
}
 public void scrnshot() throws IOException {
	 
	
	 
	 File Source = scrshot.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(Source, new File ("/Users/rubhenbenedict/Desktop/screenshots/IRCTC2.png"));
	 System.out.println("Screenshot Taken");

}

}