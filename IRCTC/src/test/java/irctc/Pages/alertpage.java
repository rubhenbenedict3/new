package irctc.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class alertpage {
	WebDriver driver;
		
		public  alertpage(WebDriver driver) {
			this.driver = driver;
			
		}
		@FindBy (how = How.XPATH, using="/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button") WebElement alrt;
		@FindBy (how = How.XPATH, using="//*[@id=\"origin\"]/span/input") WebElement ck;
		@FindBy (how = How.XPATH, using="//*[@id=\"origin\"]/span/input") WebElement pop;
		
		public void clickalertok () {
			alrt.click();
		}
		public void handelpopup () throws AWTException, InterruptedException {
			ck.click();
		 Robot robot = new Robot();
		 robot.mouseMove(24, 24);
		 Thread.sleep(2000);
		 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 Thread.sleep(2000);
		 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		 
		}

}
