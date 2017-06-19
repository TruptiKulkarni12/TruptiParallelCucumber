package com.cucumber.MavenCucumberPrototype;

import java.net.URL;

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

public class Steps1 
{
	public WebDriver driver;
	public String hubURL="http://192.168.0.101:4444/wd/hub";
	protected ThreadLocal<RemoteWebDriver>threadlocal=null;
@Given("^This is second scenario first steps$")
public void this_is_second_scenario_first_steps() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	DesiredCapabilities caps=DesiredCapabilities.internetExplorer();
	driver=new RemoteWebDriver(new URL(hubURL), caps);
	System.out.println("Second sce..");
	//System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\Desktop\\Trupti\\IEDriverServer.exe");
    //driver=new InternetExplorerDriver();
	driver.get("http://www.yahoo.com");
	driver.findElement(By.linkText("Sign in")).click();
   
}

@When("^This is second scenario second steps$")
public void this_is_second_scenario_second_steps() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Second sce1..");
   
}

@Then("^This is second scenario third steps$")
public void this_is_second_scenario_third_steps() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Second sce2..");
   
}



}
