package com.cucumber.MavenCucumberPrototype;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps 
{
	public WebDriver driver;
	public String hubURL="http://192.168.0.101:4444/wd/hub";
	protected ThreadLocal<RemoteWebDriver>threadlocal=null;
	@Given("^This is first step$")
	public void this_is_first_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
		driver=new RemoteWebDriver(new URL(hubURL), caps);
		
		/*System.out.println("Execute first step");
	    System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\Trupti\\IEDriverServer.exe");
	    driver=new InternetExplorerDriver();*/
	    driver.get("http://www.google.com");
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Gmail")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^This is second step$")
	public void this_is_second_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Execute second step");
	}

	@Then("^This is third step$")
	public void this_is_third_step() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Execute third step");
		 //driver.close();
	}
	
}
