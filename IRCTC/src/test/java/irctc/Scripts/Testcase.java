package irctc.Scripts;

import java.awt.AWTException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import irctc.Pages.alertpage;
import irctc.Pages.from_field_to_field;
import irctc.Pages.trains;
import irctc.Utils.TestBase;



public class Testcase extends TestBase{
	
	
	@BeforeTest
	public void url() {
		driver.get(URL);
	}
@Test(priority=1)
public void alerthandel() throws InterruptedException, AWTException {
	
	alertpage alertpag = PageFactory.initElements(driver,alertpage.class);
	alertpag.clickalertok();
	 Thread.sleep(5);
	 //alertpag.handelpopup();
	
	
}
@Test(priority=2)
public void frmtodate() throws InterruptedException, AWTException  {
	 from_field_to_field frm = PageFactory.initElements(driver,from_field_to_field.class);
	
	
       frm.fromfield("MAS");
       frm.fromfield2();
       Thread.sleep(200);
       frm.tofield("COIMBATORE JN - CBE");
       frm.tofield2();
       Thread.sleep(200);
      
       frm.Date();  
       Thread.sleep(200);
       frm.clicknext();
       Thread.sleep(200);
       frm.Search();
       
    
      
}
@Test(priority=3)
public void trainlists() throws Exception {
	trains tr = PageFactory.initElements(driver, trains.class);
	Thread.sleep(5000);
	tr.avatrains();
	System.out.println(tr);
	Thread.sleep(5000);
	tr.scroll();
	Thread.sleep(5000);
	tr.clicknextbut();
	Thread.sleep(2000);
	tr.scrnshot();
	
	
}
	
}


