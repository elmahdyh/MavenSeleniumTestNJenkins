package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("https://www.softwaretestingmaterial.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	  ChromeOptions options = new ChromeOptions();
          options.addArguments("--headless","--disable-gpu","--no-sandbox");
	  driver = new ChromeDriver(options);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
