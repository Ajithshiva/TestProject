package POMTestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CodingClass extends POMTestCases{

	@FindBy (xpath = "//input[@name='txtUserName']" ) WebElement UN ;
	@FindBy (xpath = "//input[@name='txtPassword']" ) WebElement PWD ;
	@FindBy (xpath = "//input[@name='Submit']" ) WebElement SB ;
	
	public void login() {
		  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		  UN.sendKeys("selenium");
		  PWD.sendKeys("Vcube");
		  SB.click();
		  
	  }
	
}
