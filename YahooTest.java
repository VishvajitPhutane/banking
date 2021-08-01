package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class YahooTest 
{
	WebDriver driver;
  @Test
  public void yahooM() throws InterruptedException 
  {	
	  driver.get("https://login.yahoo.com/");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-username")).sendKeys("phutane.vishvajit");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-passwd")).sendKeys("Jeet@1994");
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("[href='https://mail.yahoo.com/?.intl=in&.lang=en-IN&.partner=none&.src=fp']")).click();
	  Thread.sleep(8000);
	  driver.findElement(By.cssSelector("[data-test-id='compose-button']")).click();
	  Thread.sleep(8000);
	  driver.findElement(By.id("message-to-field")).sendKeys("ketan@paratussystems.com");
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//div/input[@data-test-id=\"compose-subject\"]")).sendKeys("Hi Ketan, I'm Vishvajit");
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("I have done my assignment.");
	  Thread.sleep(8000);
	  driver.findElement(By.xpath("//div/button[@tabindex='-1'][@data-test-id='compose-send-button']")).click();
	  Thread.sleep(8000);
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


