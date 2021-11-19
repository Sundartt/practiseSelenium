package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]//img")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Images")) {
			System.out.println("Broken");
		}
		else {
			System.out.println("Not Broken");
		}
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]//img")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
	}
}
