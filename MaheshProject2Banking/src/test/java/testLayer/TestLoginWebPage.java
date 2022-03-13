package testLayer;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageLayer.HomePage;
import pageLayer.LoginWebPage;
import testBase.TestBaseBanking;

public class TestLoginWebPage extends TestBaseBanking{
		LoginWebPage l;
		HomePage h;
		//String a="";
		public TestLoginWebPage() {
			l= new LoginWebPage();
			h= new HomePage();
		}
		
		@Test
		public void testLogin() throws InterruptedException {
			Thread.sleep(4000);
			System.out.println("This is test");
		
			l.setUsername();
			l.setPassword();
			l.verifyLogin();
			Thread.sleep(4000);
			h.verifyLogout();
			//a= driver.switchTo().alert().getText();
			//Assert.assertEquals("You Have Succesfully Logged Out!!", a);
			
		}
}
