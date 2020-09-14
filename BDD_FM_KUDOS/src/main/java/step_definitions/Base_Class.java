package step_definitions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	 protected static WebDriver driver;
	 protected static WebDriverWait ExplicitWait;

	 public void Take_Screenshot() throws Exception
	 {
		 File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
		 String workingDir = System.getProperty("user.dir");
		 File dest = new File(workingDir+"\\Screenshots\\" + filename);
		 FileUtils.copyFile(screen, dest);
		
	 }
	 

	 
 public WebDriver get_driver()
	 {
		 if(driver==null)
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Selenium_RequiredFiles\\ChromDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 
		 return driver;
		 		  
	 }
	
	 public WebDriverWait get_explicitWait()
	 {
		 if(ExplicitWait == null) {
			 ExplicitWait = new WebDriverWait(driver,10);
		 }
			
		 return ExplicitWait;
	 }
	 
	
	 public JavascriptExecutor ScrollDown_PageEnd()
	 {
	
		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 return  (JavascriptExecutor) javascript.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	  		  
	 }
	 
}
