package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("http://leafground.com/pages/Edit.html");
         driver.manage().window().maximize();
         driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kavivijay2015@gmail.com");
         driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("vijay");
         String attribute = driver.findElement(By.name("username")).getAttribute("value");
         System.out.println(attribute);
         driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
         boolean displayed = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isDisplayed();
         System.out.println(displayed);
         try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         driver.close();
         
	}

}
