package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class WikiTest 
{
	RemoteWebDriver driver;
	WebElement we;
  @Test
  public void wikiTestM() 
  {
	  driver.get("https://www.wikipedia.org/");
	  driver.findElement(By.id("js-link-box-en")).click();
	  driver.findElement(By.id("searchInput")).sendKeys("Selenium");
	  driver.findElement(By.id("searchButton")).click();
	  String expectedTitle = "Selenium - Wikipedia";
	  String actualtitle = driver.getTitle();
	  Assert.assertEquals(actualtitle,expectedTitle,"Title not matched");
	  String expectedheading = "Selenium";
	  String actualheading = driver.findElement(By.id("firstHeading")).getText();
	  Assert.assertEquals(actualheading,expectedheading);
  }
  @BeforeClass
  public void beforeClass() 
  {
	 // System.setProperty("webdriver.chrome.driver", "V:\\Vishvajit\\Java Practice\\webdrivertraining\\test\\resources\\chromedriver.exe");
	 // driver = new ChromeDriver();
	    System.out.println("Before class after commit")
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
