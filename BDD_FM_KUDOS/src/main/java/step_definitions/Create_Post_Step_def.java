package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class Create_Post_Step_def extends Base_Class{
	
		WebDriver driver;
		WebDriverWait wait;
	 
		 @Before
		 public void before_Scenario()
		 {
			 driver 	= get_driver();
			 wait 		= get_explicitWait();
		 }
	
		 @Then("^only create a new post$")
		 public void only_Creaetd_post_will_be_viewed() throws Exception
		 {
			WebElement Post_Kudos_Text = driver.findElement(By.xpath("//*[@id=\"postArea\"]"));
			
			Post_Kudos_Text.sendKeys("Right IT Solutions one of the leading ERP Solution Provider in U.A.E. founded in the year 2005,"
						+ " with software development centre at Sharjah. We are engaged every aspect of Information Technology, including"
						+ " Software Development, Consulting and Training. Our professionally qualified IT and Management Professionals"
						+ " developed and supporting RightERP, a fully customizable Enterprises Resource Planning (ERP) Software.");
				
			WebElement Post_btn = driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/form/input[2]"));
			Post_btn.click();
								
			Thread.sleep(5000);
				
			ScrollDown_PageEnd();
				
			Thread.sleep(5000);
				
			Take_Screenshot();
		 }
	 
}
