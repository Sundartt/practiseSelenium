package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("http://leafground.com/pages/Link.html");
   driver.manage().window().maximize();
   driver.findElement(By.linkText("Go to Home Page")).click();
   String title = driver.getTitle();
   System.out.println(title);
   driver.navigate().back();
   driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
   String title2 = driver.getTitle();
   System.out.println(title2);
   driver.navigate().back();
   driver.findElement(By.linkText("Verify am I broken?")).click();
   String title3 = driver.getTitle();
   System.out.println(title3);
   if(title3.contains("Status")) {
	   System.out.println("Broken");
	   
   }
   else {
	   System.out.println("Not Broken");
   }
   driver.navigate().back();
   driver.findElement(By.linkText("Go to Home Page")).click();
   driver.navigate().back();
   WebElement findElement = driver.findElement(By.linkText("How many links are available in this page?"));
   Dimension size = findElement.getSize();
   System.out.println(size);
	}

}
