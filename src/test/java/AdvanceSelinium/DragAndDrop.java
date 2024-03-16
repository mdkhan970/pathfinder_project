package AdvanceSelinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement col1 = driver.findElement(By.xpath("(//div[@class='column'])[1]"));
		WebElement col2 = driver.findElement(By.xpath("(//div[@class='column'])[2]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(col1, col2).build().perform();
//		act.dragAndDropBy(col2, 100, 200).build().perform();
	}
}