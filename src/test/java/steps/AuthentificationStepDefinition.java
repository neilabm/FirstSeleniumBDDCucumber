package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AuthentificatonPageObject;
import utils.TestBase;

public class AuthentificationStepDefinition extends TestBase {

	//WebDriver driver;
	AuthentificatonPageObject authentificatonPageObject;

	public AuthentificationStepDefinition() throws IOException {
	super();
	}

	@Before
	public void setup() {
       initialization();
	}

	@Given("I navigate on website")
	public void i_navigate_on_website() {
		driver.get(properties.getProperty("URL"));
	}

	@When("I enter username")
	public void i_enter_username() {
		authentificatonPageObject = new AuthentificatonPageObject(driver);
		authentificatonPageObject.enterUserName();

	}

	@When("I enter password")
	public void i_enter_password() {

		authentificatonPageObject.enterUserPassword();

	}

	@When("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {

		authentificatonPageObject.clickButton();
	}

	@Then("the inventory page shows")
	public void the_inventory_page_shows() {
	}

	@When("^I enter \"(.*)\"$")
	public void i_enter(String name) {
		authentificatonPageObject.enterUserName(name);

	}

	@When("^I put \"(.*)\"$")
	public void i_put(String example_pwd) {
		authentificatonPageObject.enterUserPassword(example_pwd);

	}
	@After
	public void quit() {
		driver.quit();	}
	
}
