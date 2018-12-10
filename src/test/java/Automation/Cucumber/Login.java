package Automation.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@Test
	public void navigate() {
		System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=2.44/");
	}

}
