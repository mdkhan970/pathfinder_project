package AdvanceSelinium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hovers {

	public static void main(String[] args) {
		WebDriver driver;
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/hovers");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
			WebElement text1 = driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/h5"));
			WebElement link1 = driver.findElement(By.xpath("(//div[@class='figcaption'])[1]/a"));
			
			Actions act = new Actions(driver);
			act.moveToElement(img1).build().perform(); 
			
			Assert.assertEquals(text1.getText(), "name: user1");
			Assert.assertTrue(link1.isEnabled());
	}
}