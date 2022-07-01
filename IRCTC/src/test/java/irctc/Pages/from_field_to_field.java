package irctc.Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class from_field_to_field {
	
	
	WebDriver driver;
		
		public  from_field_to_field (WebDriver driver) {
			this.driver = driver;
			
		}
		@FindBy (how = How.XPATH, using="//*[@id=\"origin\"]/span/input") WebElement from;
		@FindBy (how = How.XPATH, using="//*[@id=\"destination\"]/span/input") WebElement to;
		@FindBy (how = How.XPATH, using="//*[@id=\"jDate\"]/span/input") WebElement date;
		@FindBy (how = How.XPATH, using="//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[1]/td[6]/a") WebElement clkdate;
		@FindBy (how = How.XPATH, using="//*[@id=\"divMain\"]/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button") WebElement search;
		@FindBy (how = How.XPATH, using="//div[@class='col-sm-5 col-xs-11 train-heading']") WebElement atrains;
		
		
		
		public void fromfield (String enterfrom) {
			from.sendKeys(enterfrom);
			
		}
		public void fromfield2 () {
			from.sendKeys(Keys.TAB);
			
		}
		public void tofield (String enterto) {
			to.sendKeys(enterto);
		}
		public void tofield2() {
			from.sendKeys(Keys.TAB);
			
		}
//public void Date1 () {
			
	// String month = "July";
	// while(true) {
	  //  	  String text= driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/div/span[1]")).getText();
	    //	  if(text.equals(month)) {
	    //		  break;
	    //	  }
	    //	  else {
	    //		  driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]");
			
	    	  
		//}
		public void Date () {
			
			date.click();
			
			
		}
		public void clicknext() {
			clkdate.click();
			
		}
		
	
		public void Search () {
			search.click();
		}
		
		
}


