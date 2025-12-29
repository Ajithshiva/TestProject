package POMTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePack.BaseClass;

public class POMTestCases extends BaseClass{
  @Test
  public void loginpage() {
	  
	  CodingClass c = PageFactory.initElements(driver, CodingClass.class) ;
	  c.login();
	  
  }
}
