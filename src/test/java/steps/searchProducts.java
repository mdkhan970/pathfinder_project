package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchProducts extends googleBase{
	
	googleHomePage gp;

	@Given("i am on the google home-page")
	public void i_am_on_the_google_home_page() {
		launchBrowser();
	}

	@When("i enter the {string} in the search bar")
	public void i_enter_the_in_the_search_bar(String string) {

		gp = new googleHomePage(driver);
		gp.enterProductNameInSearchBar(string);
	}


	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.click();
	}

	@Then("i can see the search result successfully")
	public void i_can_see_the_search_result_successfully() {
		WebElement searchResult = driver.findElement(By.id("result-stats"));
//		Assert.assertEquals("Expected", searchResult.getText());
//		Assert.assertNotEquals("Expected", searchResult.getText());
//		Assert.assertTrue(searchResult.isDisplayed());
		Assert.assertTrue(gp.verifyTheSearchResults());
//		Assert.assertFalse(searchResult.isDisplayed());
//		Assert.assertNull(searchResult);
//		Assert.assertNotNull(searchResult);
		
		closeAll();
	}
}