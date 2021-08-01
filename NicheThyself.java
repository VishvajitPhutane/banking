package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NicheThyself 
{
	WebDriver driver;
  @Test
  public void nicheThyselfM() throws InterruptedException 
  {
	  driver.get("https://nichethyself.com/tourism/home.html");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("stc123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//div[4]/form/button")).click();
	  Thread.sleep(3000);
	  
  }
  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "V:\\Vishvajit\\Java Practice\\webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
