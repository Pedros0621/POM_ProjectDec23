package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.w3c.dom.html.HTMLFrameElement;

public class AddCustomerPage {
	
	
	WebDriver driver;
	
	
public AddCustomerPage(WebDriver driver) {
		this.driver=driver;	
		
		}
	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong")WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"general_compnay\"]/div[1]/div/input")WebElement FULL_NAME_ELEMENT;
	@FindBy(how=How.XPATH,using="/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span")WebElement CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"customers\"]/li[2]/a/span")WebElement ADDCUSTOMER_BUTTON_ELEMENT;
	
	public String getvalidateAddCustomerPageText() {
	String actualAddCustomerHeaderText = ADD_CUSTOMER_HEADER_ELEMENT.getText();
	return actualAddCustomerHeaderText; 
 

	}
public void validateAddCustomerPageText(String addCustomerHeaderText) {
	Assert.assertEquals(ADD_CUSTOMER_HEADER_ELEMENT.getText(), addCustomerHeaderText, "Dashboard Page not found!!");
	}


public void insertFullName(String fullName) {
	FULL_NAME_ELEMENT.sendKeys(fullName);
}
	
}



   //public void clickOnCustomerButton() {
	//   CUSTOMER_BUTTON_ELEMENT.click();
	   
  
 //  public void clickOnAddCustomerButton() {
	 //  ADDCUSTOMER_BUTTON_ELEMENT.click();
	//public String validateDashboardPageText() {
		//String dashboardHeaderText =DASHBOARD_HEADER_ELEMENT.getText();
		//return dashboardHeaderText;
	

