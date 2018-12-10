package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	
	@Given("^User is on US Lawns Landing Page$")
	public void navigatingToURL(){
	System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://usldata.com");
		
	}

    @When("^User logs into the application with un and password$")
    public void user_logs_into_the_application_with_un_and_password(){
    	driver.findElement(By.id("user_name")).sendKeys("admin");
    	driver.findElement(By.id("user_password")).sendKeys("bitsadmin2015$$");
    	driver.findElement(By.id("login_button")).click();
        
    }


}
