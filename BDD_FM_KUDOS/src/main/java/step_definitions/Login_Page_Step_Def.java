package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Page_Step_Def extends Base_Class{

	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @Before
	 public void before_Scenario()
	 {
		 driver 	= get_driver();
		 wait 		= get_explicitWait();
	 }
	 
	 @Then("^close the browser$")
	 public void close_the_browser()
	 {
		 driver.close();
		 super.driver = null;
		 super.ExplicitWait = null;
	 }
	 
	 
	 @Given("^user is already on Login Page$")
	 public void user_is_already_on_login_page(){
	 
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	
	 driver.get("http://kudos-interview.s3-website-us-east-1.amazonaws.com/");
	 
	 }
	
	 @When("^title of login page is Login$")
	 public void title_of_login_page_is_Login()
	 {
		 
		 wait.until(ExpectedConditions.titleIs("Login"));
		
		 String Title_Login = driver.getTitle();
		 
		 Assert.assertEquals(Title_Login, "Login");
		 
	 }
	 
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String Username, String Password)
	 {
		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
			
		 Username1.sendKeys(Username);
		 
		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 
		 Password1.sendKeys(Password);
	 }
	
	 	@Then("^user enters username and password$") 
		 public void user_enters_username_and_password()
		 {
			 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
				
			 Username1.sendKeys("Arjun");
			 
			 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
			 
			 Password1.sendKeys("Arjun123");
		 }
	
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\" as null values$")
	 public void user_enters_username_and_password_as_null_values(String Username, String Password)
	 {
		 WebElement Username1 = driver.findElement(By.xpath("//input[contains(@name,'uname')]"));
			
		 Username1.sendKeys(Username);
		 
		 WebElement Password1 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		 
		 Password1.sendKeys(Password);
	 }
	 

	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button()
	 {
		 WebElement Submit = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));	 
		 Submit.click();	
	 }
	 
	 @Then("^validate user is on Create post page$")
	 public void validate_user_is_on_Create_post_page()
	 { 
		 wait.until(ExpectedConditions.titleIs("Create post"));
		
		 String Title_Creat_post = driver.getTitle();
		 
		 Assert.assertEquals(Title_Creat_post, "Create post");
	 }
	 
	 @Then("^validate user is not logged in due to missing login creadentilas$")
	 public void user_is_not_logged_in_due_to_missing_login_creadentilas()
		{
			wait.until(ExpectedConditions.titleIs("Login"));
			
			String Title_Creat_post = driver.getTitle();
			 
			Assert.assertEquals(Title_Creat_post, "Login");
			
		}
	 

	 @Then("^logout from the application$")
	 public void logout_from_the_application() throws InterruptedException{
		 
		 WebElement Logout_btn = driver.findElement(By.xpath("//a/img[@alt='signout']"));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(Logout_btn));
		
		 Thread.sleep(5000);
		 
		 Logout_btn.click(); 
		 
	 }
	
	
	 
	 
	 
}
