package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBaseBanking;

public class LoginWebPage extends TestBaseBanking {
	
		public LoginWebPage () {
			
			PageFactory.initElements(driver, this);
		}
		 @FindBy(xpath="//input[@name='uid']")
		 private WebElement id;
		 
		 @FindBy(xpath="//input[@name='password']")
		 private WebElement pwd;
		 
		 @FindBy(xpath="//input[@name='btnLogin']")
		 private WebElement btnlogin;
		 
		 
		 
		 public void setUsername() {
			 id.sendKeys("mngr391179");
		 }
		 
		 public void setPassword() {
			 pwd.sendKeys("asajUpY");
		 }
		 public void verifyLogin() {
			 btnlogin.click();
		 }
}
