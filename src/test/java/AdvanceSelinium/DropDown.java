package AdvanceSelinium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dropdown");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
			Select s = new Select(dropDown);
			s.selectByIndex(2);
//			s.selectByValue("3");
//			s.selectByVisibleText("Option 2");
			
		List<WebElement> myElements = s.getOptions();
		
			for(WebElement str : myElements) {
				System.out.println(str);
			}
	}
}