import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myclass {
  @Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yoniflenner.net/Xamples/pizza");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
		//Example code
  }
}
