package AdvanceSelinium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement box1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement box2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(!box1.isSelected()) {
			box1.click();
		}
		else {
			System.out.println("Box 1 is alreday selected");
		}
		if(!box2.isSelected()) {
			box2.click();
		}
		else {
			System.out.println("Box 2 is alreday selected");
		}
	}
}