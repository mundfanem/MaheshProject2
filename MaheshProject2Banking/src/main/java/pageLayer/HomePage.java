package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBaseBanking;

public class HomePage extends TestBaseBanking{

	public HomePage () {
		PageFactory.initElements(driver,this);
	}
	 @FindBy(xpath="//a[text()='Log out']")
	 private WebElement logout;
	 
	 public void verifyLogout() {
		 logout.click();
	 }
}
