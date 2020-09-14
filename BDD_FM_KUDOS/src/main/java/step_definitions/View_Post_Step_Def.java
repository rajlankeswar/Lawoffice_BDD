package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class View_Post_Step_Def extends Base_Class{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @Before
	 public void before_Scenario()
	 {
		 driver 	= get_driver();
		 wait 		= get_explicitWait();
	 }
	 

	 @Then("^only view a post$")
	 public void Only_view_an_existing_post() throws Exception
	 {
		 	Thread.sleep(5000);
			
			WebElement ViewPost = driver.findElement(By.cssSelector("#postsData > li:nth-child(1) > div > p"));
			
			String Text = ViewPost.getText();
			
			System.out.println(Text);
	 }
	
}
