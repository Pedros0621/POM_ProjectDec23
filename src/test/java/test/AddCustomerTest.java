package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {

	WebDriver driver;

	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboardHeaderText = "Dashboard";
	String userNameAlerMsg = "Please enter your user name";
	String passwordAlertMsg = "Please enter your password";
	String addCustomerHeaderText = "New Customer";
	String fullName = "Mr. Selenium";
	String company = "Techfios";
	String email = "abc1234@techfios.com";
	String phone = "5157888906";
	String country = "Afgnanistan";

	@Test
	public void userShouldBeAbleToAddCustomer() {
		// create object
		// by the name of the class
		driver = BrowserFactory.init();
		// driver.findElement(By.xpath("//*[@id=\"login_submit\"]")).click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		// loginPage.clickSignButton();

		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPageText(dashboardHeaderText);
		dashboardPage.clickOnCustomerButton();
		dashboardPage.clickOnAddCustomerButton();

		// String actualDashboardHeaderText = dashboardPage.validateDashboardPageText();
		// Assert.assertEquals(actualDashboardHeaderText, "Dashboard", "Dashboard page
		// not found!!");
		// Assert.assertEquals(dashboardPage.getvalidateDashboardPageText(),
		// "Dashboard", "Dashboard page not found!!");
		// Assert.assertEquals(actualDashboardHeaderText, "Dashboard", "Dashboard page
		// not found");

		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPageText(addCustomerHeaderText);
		addCustomerPage.insertFullName(fullName);
	

	}

}
