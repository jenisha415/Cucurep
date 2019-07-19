package greenfield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f()
{
	  //operations, actions, conditions to be performed
	  //click on signin link
	  driver.findElement(By.partialLinkText("SignIn")).click();
	  //enter username as lalitha
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  //enter password as password@123
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  //click login
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	 //enter the products to be searched
	  driver.findElement(By.name("products")).sendKeys("headphones");
	  //click find details
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  //click on sign out link
	  driver.findElement(By.partialLinkText("SignOut")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2B.02.14\\Downloads\\TestingBatch13&14\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  }

