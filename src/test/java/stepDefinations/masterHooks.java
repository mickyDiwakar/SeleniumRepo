package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.automationpracticePage;
import pageObjects.flightHomePage;
import resources.TestBase;

public class masterHooks extends TestBase  {
	public WebDriver driver;
	//Navigate to "http://automationpractice.com/index.php"
	@Before("@automationpractice")
	public void setUpautomationpractice() throws IOException {
		driver=	new TestBase().initializeDriver();
		//driver = initializeDriver();
		new automationpracticePage(driver).naviagteToPracticeURL();
		
	}
	
	@After("@automationpractice") 
	public  void tearDownautomationpractice() {
		
		if (driver!=null) {
			driver.quit();
		}
		
		
	}
	//air aissa site
	
	  @Before("@airAsia1")
	  public void setUpairAsia() throws IOException { 
		  //driver= initializeDriver(); 
	  driver = new TestBase().initializeDriver(); 
	  new flightHomePage(driver).getflightUrl();
	  }
	  
	  @After ("@airAsia1") 
	  public void tearDownairAsia()
	  { if (driver!=null) {
			driver.quit();
		} }
	 
	  @Before("@travel")
		public void setUpnewtour() throws IOException {
			//driver = initializeDriver();
			driver = new TestBase().initializeDriver();
		}
		@After ("@travel")
		public  void tearDownnewtout() {
			if (driver!=null) {
				driver.quit();
			}
			
		}
		
		
		 @Before("@E2ETest")
			public void setUpCrm() throws IOException {
				//driver = initializeDriver();
				driver = new TestBase().initializeDriver();
				
			}
			@After ("@E2ETest")
			public  void tearDownCrm() {
				if (driver!=null) {
					driver.quit();
				}
			}

			@Before("@CRM")
			public void setUpCrm1() throws IOException {
				//driver = initializeDriver();
				driver=initializeDriver();
				driver.get(p.getProperty("crmProUrl"));
				
			}
			@After ("@CRM")
			public  void tearDownCrm1() {
				if (driver!=null) {
					driver.quit();
				}
			}
			
			
			
			
}
