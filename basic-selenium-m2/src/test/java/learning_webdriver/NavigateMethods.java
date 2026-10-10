package learning_webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(1000);
		
		Navigation nav = driver.navigate();
		
		String url1  = "https://www.facebook.com/";
		URL url2 = new URL("https://www.zomato.com/");
//		nav.to(url1);
		nav.to(url2);
		
		Thread.sleep(1000);
		
		nav.back();

		Thread.sleep(1000);
		
		nav.forward();
		
		Thread.sleep(1000);
		
		nav.refresh();
		
		Thread.sleep(1000);
		driver.quit();		
	}
}
