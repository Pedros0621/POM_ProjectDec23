package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
public DashboardPage(WebDriver driver) {
		this.driver=driver;	
		}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div/header/div/strong")WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]div[1]/div/input")WebElement FULL_NAME_ELEMENT;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span")WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"customers\"]/li[2]/a/span")WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	
 
	public String getvalidateDashboardPageText() {
	 String actualDashboardHeaderText = DASHBOARD_HEADER_ELEMENT.getText();
	return actualDashboardHeaderText; 
 }

	
public void validateDashboardPageText(String dashboardHeaderText) {
	Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboardHeaderText, "Dashboard Page not found!!");

	}
public void clickOnCustomerButton() {
	   CUSTOMER_BUTTON_ELEMENT.click();
	   
}
public void clickOnAddCustomerButton() {
	   ADD_CUSTOMER_BUTTON_ELEMENT.click();
   }
	//public String validateDashboardPageText() {
		//String dashboardHeaderText =DASHBOARD_HEADER_ELEMENT.getText();
		//return dashboardHeaderText;
	}

