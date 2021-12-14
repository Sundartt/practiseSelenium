package dec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {
	public static void main(String[] args) {

		// Download the chromedriver exe and set its path
		WebDriverManager.chromedriver().setup();
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// launch the url
		driver.get("http://www.leafground.com/pages/Window.html");
		// Maximize the browser
		driver.manage().window().maximize();
		//Get current window title
		String title = driver.getTitle();
		System.out.println(title);
		// Get current window reference
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		// Click button to open home page in New Window
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		//Get next window reference
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		//I am moving to next window and going to get title of that window
		List<String> test=new ArrayList<String>(windowHandles);
		driver.switchTo().window(test.get(1));
		//Get the title of next window
		String title2 = driver.getTitle();
		System.out.println(title2);
		//close the current window
		driver.close();
		//I am moving control to previous window and close
		driver.quit();
		

	}
}
