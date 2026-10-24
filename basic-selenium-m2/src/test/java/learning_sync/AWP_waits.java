package learning_sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AWP_waits {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.automationwithpiyush.com/synchronization.html");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

//		WebElement start = driver.findElement(By.cssSelector("[onclick=\"startProcess('start')\"]"));
//		start.click();

//		WebElement stop = driver.findElement(By.cssSelector("[onclick=\"startProcess('stop')\"]"));
//		stop.click();

//		explicit wait
//		1> clickability
		WebElement trigger = driver.findElement(By.id("trigger-input"));
		trigger.click();

		WebElement target = driver.findElement(By.id("target-input"));

//		wait until the target element to be clickable
		wait.until(ExpectedConditions.elementToBeClickable(target));

		target.sendKeys("admin"); // ElementNotInteractableException

//		2> Visibility
		WebElement reveal = driver.findElement(By.id("btn-visibility"));
		reveal.click();

		WebElement hiddenBox = driver.findElement(By.id("hidden-box"));

//		wait until the hidden box is visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden-box")));

		System.out.println(hiddenBox.isDisplayed());

		Thread.sleep(3000);
		driver.quit();
	}
}
