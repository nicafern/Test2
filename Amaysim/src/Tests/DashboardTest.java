package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginObjects;

public class DashboardTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amaysim.com.au");
		
		
		// Unsuccessfully login using invalid credentials. 
		LoginObjects ULogin=new LoginObjects(driver);			
		
		ULogin.clickLoginLink();
		ULogin.LogintoSite("0468340754", "invalid");
		body.logged-in-customer:nth-child(2) div.outer-wrap.new-navigation:nth-child(7) nav.closed.off-canvas-menu-new.page-dashboards ul.off-canvas-list li.active.ama-off-canvas-section-link.ama-submenu-item:nth-child(2) a:nth-child(1) > span:nth-child(1)
		if( driver.findElement(By.cssSelector(".form-row:nth-child(7) > div.message.warning")).isDisplayed()){
        	System.out.println("Test Passed: Unsuccesfully login using invalid credentials.");
        	}
			else{
				System.out.println("Test Failed: No warning message was displayed when user logged in using invalid credentials.");
        		}
			
		// Successfully login using invalid credentials. 		
		LoginObjects Login=new LoginObjects(driver);			
		
		Login.LogintoSite("0468340754", "theHoff34");
	
	}
}
