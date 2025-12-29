package BasePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class BaseClass {
	
	public static WebDriver driver ;
	
  @BeforeTest
  public void openbrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\OneDrive\\Desktop\\Vcube\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }
  
}
