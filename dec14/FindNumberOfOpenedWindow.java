package dec14;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindNumberOfOpenedWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				//Click open multiple window
				driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
				//Get second window reference
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);
				List<String> lp=new ArrayList<String>(windowHandles);
				//Find the number of opened windows
				 int size = lp.size();
				System.out.println(size);
					
				
								

				
				
				
				
				
				
	}

}
