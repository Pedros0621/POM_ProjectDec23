package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/section/div/div[2]/div/div/header/div/strong")WebElement DASHBOARD_HEADER_ELEMENT;

 public String validateDashboardPageText() {
	 String dashboardHeaderText = DASHBOARD_HEADER_ELEMENT.getText();
	return dashboardHeaderText; 
 }

	
//public void validateDashboardPageText(String dashboardHeaderText) {
	
   //  Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboardHeaderText, "Dashboard Page not found!!");
	
//}

	//public String validateDashboardPageText() {
		//String dashboardHeaderText =DASHBOARD_HEADER_ELEMENT.getText();
		//return dashboardHeaderText;
	}

