package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/* Locators and methods of Login page  
*/


public class LoginObjects 
{
	
	WebDriver driver;
	
	By LoginLink = By.xpath("//span[contains(text(),'Login')]");
	By UserName = By.id("username");
	By Password = By.id("password");
	By LoginButton = By.name("button");
	
	
	//initialize webdriver
	public LoginObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//login objects
	public void clickLoginLink()
	{
		driver.findElement(LoginLink).click();
	}
	
	public void typeUserName(String user)
	{
		driver.findElement(UserName).sendKeys(user);
	}
	
	public void typePassword(String password)
	{
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(LoginButton).click();
	}
	
	//log into site method
	public void LogintoSite(String user, String password)
	{
		driver.findElement(UserName).sendKeys(user);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginButton).click();
	}
	
}
