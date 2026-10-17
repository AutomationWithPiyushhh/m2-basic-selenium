package learning_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.automationwithpiyush.com/locatorsSignin.html");

		Thread.sleep(3000);

//		enter something in username field
//		WebElement usernameField = driver.findElement(By.id("email"));
//		WebElement usernameField = driver.findElement(By.cssSelector("[type='text']"));
		WebElement usernameField = driver.findElement(By.cssSelector("#email"));

		usernameField.sendKeys("admin");

//		enter 123456789 in password field
//		WebElement passwordField = driver.findElement(By.name("pass"));
		WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='••••••••']"));

		passwordField.sendKeys("123456789");

		Thread.sleep(1000);


//		className => click on checkBox
//		WebElement checkBox = driver.findElement(By.className("custom-checkbox"));
		WebElement checkBox = driver.findElement(By.cssSelector(".custom-checkbox"));
		checkBox.click();
		

//		WebElement regLink = driver.findElement(By.linkText("Register"));
//		WebElement regLink = driver.findElement(By.partialLinkText("Regi"));
//		regLink.click();

		Thread.sleep(3000);
		driver.quit();
	}
}
