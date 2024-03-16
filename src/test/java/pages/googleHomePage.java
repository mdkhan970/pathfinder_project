package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	
	WebDriver driver;

	public googleHomePage(WebDriver dr) {
		
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "gLFyf")
	WebElement searchBar;
	@FindBy(name = "btnK")
	WebElement searchButton;
	@FindBy(id = "result-stats")
	WebElement searchResults;
	
	public void enterProductNameInSearchBar(String products) {
		searchBar.sendKeys(products);
	}
	
	public void clickOnTheButton() {
		searchButton.submit();
	}
	
	public boolean verifyTheSearchResults() {
		return searchResults.isDisplayed();
	}
}