package com.Test_Case_sequencing_in_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Demo_Test_Case_sequencing_in_TestNG 
{
	/*You need to use the ‘priority‘ parameter, if you want the methods to be executed in your order. 
	 * Parameters are keywords that modify the annotation’s function.

	Let’s take the same above example and execute all @Test methods in right order. 
	Simply assign priority to all @Test methods starting from 0(Zero).

  */


	WebDriver driver;
  @Test(priority=2)
  public void Test_Case_sequencing_in_TestNG1() 
  {
	  driver.get("https://www.facebook.com");
	  // further write a script in a block
  }
  
  @Test(priority=0)
  public void Test_Case_sequencing_in_TestNG2() 
  {
	  driver.get("https://www.google.com");
	// further write a script in a block
  }

  @Test(priority=1)
  public void Test_Case_sequencing_in_TestNG3() 
  {
	  driver.get("https://github.com");
	// further write a script in a block
  }

  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver","./Driver_Files/chromedriver.exe");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("----disable-notification----");
	  driver=new ChromeDriver(option);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
