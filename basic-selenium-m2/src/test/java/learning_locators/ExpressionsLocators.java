package learning_locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpressionsLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement element = driver.findElement(By.xpath("//label[text() = 'Excellent']"));
		element.click();
		
		List<WebElement> links = driver.findElements(By.tagName("b"));
		
		System.out.println(links.size());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
