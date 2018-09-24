package com.mygroup2.myid3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mytests {
	
	  public void test1() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\seleniumfiles\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://yoniflenner.net/Xamples/pizza");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.quit();
			//Example code

}
}

