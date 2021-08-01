package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class MultiSelectW3 
{
	WebDriver driver;
  @Test
  public void multiSelectM() throws InterruptedException 
  {
	  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	  driver.switchTo().frame("iframeResult");
	  Select car = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
	  car.selectByIndex(0);
	  Thread.sleep(1000);
	  car.selectByVisibleText("Opel");
	  Thread.sleep(1000);
	  car.selectByValue("audi");
	  Thread.sleep(3000);
	  car.deselectByIndex(3);
	  Thread.sleep(1000);
	  car.deselectByValue("opel");
	  Thread.sleep(1000);
	  car.deselectByVisibleText("Volvo");
	  Thread.sleep(5000);
	  
	  
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
