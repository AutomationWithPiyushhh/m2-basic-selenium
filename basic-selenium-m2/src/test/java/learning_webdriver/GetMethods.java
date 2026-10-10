package learning_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/"); // fqp X => InvalidArgumentException

		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String sourceCode = driver.getPageSource();

		System.out.println(title);
		System.out.println(url);
//		System.out.println(sourceCode);

		Thread.sleep(5000);

//		driver.close(); // close does not stop the server
		driver.quit(); // stops server as well
	}
}
