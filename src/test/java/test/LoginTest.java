package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
WebDriver driver;
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		
		
		//create object
		//by the name of the class
		driver=BrowserFactory.init();
		//driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@codefios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		String actualDashboardHeaderText = dashboardPage.validateDashboardPageText();
		Assert.assertEquals(actualDashboardHeaderText, "Dashboard", "Dashboard page not found!!");
		//Assert.assertEquals(dashboardPage.validateDashboardPageText(), "Dashboard", "Dashboard page not found!!");
		//Assert.assertEquals(actualDashboardHeaderText, "Dashboard", "Dashboard page not found");
		
		BrowserFactory.tearDown();
	}

}