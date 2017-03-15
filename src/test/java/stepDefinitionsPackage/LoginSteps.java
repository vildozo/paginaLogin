package stepDefinitionsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.junit.Assert.*;


public class LoginSteps {
private WebDriver driver;
	
	public LoginSteps(){
		String driverGecko = "/home/jv/Selenium/SeleniumBrowserDrivers/browserMozila/geckodriver";
		System.setProperty("webdriver.gecko.driver",driverGecko);
		
		this.driver = new FirefoxDriver();
	}
	
	@Given("^I open a webpage$")
	public void user_open_a_webpage() throws Throwable {		
		
		driver.get("http://localhost/www");
		String title = driver.getTitle();
		
	}
	

	@When("^user inserts his \"(.*?)\" and \"(.*?)\"$")
	public void user_inserts_his_and(String arg1, String arg2) throws Throwable {		
		driver.get("http://localhost/www");
		driver.findElement(By.name("usuario")).sendKeys("Javier");
		driver.findElement(By.name("contrasena")).sendKeys("GATZ");
		
	}

	@When("^clicks login$")
	public void clicks_login() throws Throwable {
		driver.get("http://localhost/www");
		driver.findElement(By.id("botoncito")).click();
	}
	
	

	@Then("^mailpage is opened$")
	public void mailpage_is_opened() throws Throwable {
		driver.get("http://localhost/www/mail.html");
		
		String title = driver.getTitle();	
		Assert.assertEquals(title,"Mail To");
	}

}
