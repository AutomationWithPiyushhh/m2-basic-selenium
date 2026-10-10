package learning_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MangeMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);

		Window win = driver.manage().window();
		win.maximize();
		win.minimize();
		win.fullscreen();

		Dimension dim1 = win.getSize();
		int w = dim1.getWidth();
		int h = dim1.getHeight();
		System.out.println(dim1);
		System.out.println(w);
		System.out.println(h);
		win.setSize(new Dimension(700, 400));

		Point pt1 = win.getPosition();
		int x = pt1.getX();
		int y = pt1.getY();
		System.out.println(pt1);
		System.out.println(x);
		System.out.println(y);
		win.setPosition(new Point(10, 30));

		Thread.sleep(5000);
		driver.quit();
	}
}
