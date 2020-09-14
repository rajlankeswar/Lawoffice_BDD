package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import bsh.This;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class Kudos_Page_Step_Def extends Base_Class{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 private Scenario scenario;
	 
	  @Before
	  public void Scenario(Scenario scenario) {
	        this.scenario = scenario;
	        driver 	= get_driver();
			wait 	= get_explicitWait();
	    } 
			
	 
	
	 @Then("^view an existing post$")
	 public void view_an_existing_post() throws Exception
	 { 

		 	Thread.sleep(5000);
			
			WebElement ViewPost = driver.findElement(By.cssSelector("#postsData > li:nth-child(1) > div > p"));
			
			String Text = ViewPost.getText();
			
			Thread.sleep(5000);
			
	//		System.out.println(Text);
			
			scenario.write(Text);
	 }

	 
	 
	 

	 @Then("^create a new post$")
	 public void Creaetd_post_will_be_viewed() throws Exception
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
	
	 @Then("^Like a post$")
	 public void Like_a_post() throws Exception
	 {
		 WebElement Like_Post = driver.findElement(By.cssSelector("#postsData > li:nth-child(1) > div > span.like-post > img.inactive-img"));
			
		 Like_Post.click();
		 
		 System.out.println("Liked a post");
		 
		 Thread.sleep(5000);
			
		 Take_Screenshot();
		 
	 }
	 
	 
	 

	 @Then("^Validate Title not matched intentionally$")
	 public void Validate_Title_not_matched_intentionally()
		{
			wait.until(ExpectedConditions.titleIs("Create post"));
			
			String Title_Creat_post = driver.getTitle();
			 
			Assert.assertNotEquals(Title_Creat_post, "Create");
			
		}
	 
}
