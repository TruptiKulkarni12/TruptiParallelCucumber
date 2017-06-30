package com.cucumber.MavenCucumberPrototype.stepdefination;

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


import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;



public class StepsGoogle {

    WebDriver driver;
	
	@Before
	public void startUp(){
		System.out.println("Inside Before Block");
		System.setProperty("webdriver.ie.driver", "D:\\Trupti\\MavenCucumberPrototype\\driver\\IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
		System.out.println("Inside After Block");
		//driver.quit();
	}
	
	@Given("^I will launch a browser and navigate to google$")
	public void i_will_launch_a_browser_and_navigate_to_google() throws Throwable {
		System.out.println("Launching Browser and Naviagte to http://google.com");
		driver.get("http://google.com");
	}

	@Given("^check google webpage is launched$")
	public void check_google_webpage_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals("Google", driver.getTitle());
		System.out.println("Validating if Page Is Launched With Title As Google");
	}

	@When("^enter Infosys in the search box$")
	public void enter_Infosys_in_the_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Search for Infosys");
		WebElement txtbox = driver.findElement(By.name("q"));
		txtbox.sendKeys("Infosys");
	}

	@When("^hit the enter button$")
	public void hit_the_enter_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Click Search Button");
		WebElement btnObject = driver.findElement(By.name("btnG"));
		btnObject.click();
	}

	@Then("^I will validate the results page$")
	public void i_will_validate_the_results_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate if the search is successful");
		String searchResult = driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
		System.out.println(searchResult);
		
	}

	@Then("^I will validate the first result link$")
	public void i_will_validate_the_first_result_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Validate if the first link");
		WebElement searchResult = driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/div/span/em"));
		System.out.println(searchResult.getText());
	}
	
	@Given("^I will launch the schwab website$")
	public void i_will_launch_the_schwab_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nLaunching Browser and Naviagte to https://schwab.com\n");
		driver.get("https://schwab.com");
		Thread.sleep(5000);
	    
	}

	@And("^I will check the Find a Branch Link on the page$")
	public void i_will_check_the_Find_a_Branch_Link_on_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nValidate if the Find a Branch Link is present\n");
		String searchResult = driver.findElement(By.xpath(".//*[@id='utility-navigation']/ul/li[1]/a/span")).getText();
		//System.out.println(searchResult);
		assertEquals("Find a branch",searchResult);
		Thread.sleep(5000);
	   
	}

	@When("^I click on Find a Branch Link$")
	public void i_click_on_Find_a_Branch_Link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nClick on Find a branch link\n");
		WebElement linkfindBranch = driver.findElement(By.xpath(".//*[@id='utility-navigation']/ul/li[1]/a/span"));
		linkfindBranch.click();
		Thread.sleep(5000);
	}

	@Then("^I will verify Branch Locator page$")
	public void i_will_verify_Branch_Locator_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("\nValidate the Branch Locator page is Displayed\n");
	   Boolean isElementPresent = driver.findElement(By.xpath(".//*[@id='txtAddr']")).isDisplayed();
	   if (!isElementPresent) {
		   System.out.print("\nSearch Text Box Is Not Present On The Page\n");
	   }else
	   {
		   System.out.print("\nSearch Text Box Is Present On The Page\n");
	   }
	   Thread.sleep(5000);
	}

	@When("^I will enter a zip code in the locate textbox$")
	public void i_will_enter_a_zip_code_in_the_locate_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nEnter ZIP Code\n");
		WebElement txtSearchBox = driver.findElement(By.xpath(".//*[@id='txtAddr']"));
		txtSearchBox.clear();
		txtSearchBox.sendKeys("27560");
		Thread.sleep(5000);
	}

	@When("^I click on locate button$")
	public void i_click_on_locate_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("\nClick On Locate Button\n");
		WebElement btnLocate = driver.findElement(By.xpath(".//*[@id='btn_loc']"));
		btnLocate.click();
		Thread.sleep(5000);
	}

	@Then("^I will check the branch results near me$")
	public void i_will_check_the_branch_results_near_me() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*List <WebElement> searchResult = driver.findElements(By.xpath(".//div[@class='branch-details']/p[@class='address']"));
		for(WebElement i:searchResult)
        {
            System.out.println(i.findElement(By.xpath(".//div[@class='branch-details']/p[@class='address']")).getText());
        }*/
		
		/*List <WebElement> searchResult = driver.findElements(By.xpath(".//*[@id='results-list']/ul/li[@class='branch-item']"));
		for(WebElement i:searchResult)
        {
            System.out.println(i.findElement(By.xpath(".//div[@class='branch-details']/p[@class='address']")).getText());
        }*/
		
		Boolean searchResult = driver.findElement(By.xpath(".//*[@id='results-list']")).isDisplayed();
		   if (!searchResult) {
			   System.out.print("\nSearch Result not Found on the page\n");
		   }else
		   {
			   System.out.print("\nSearch Result found on the page:::\n" + driver.findElement(By.xpath(".//*[@id='results-list']/ul/li[1]/div[1]/p[2]")).getText());
		   }
		 driver.close();
	    
	}




}
