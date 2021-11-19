package nov18;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Button.html");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.contains("Selenium"))
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("Noo");
        }
        driver.navigate().to("http://leafground.com/pages/Button.html");
        
          //position
        Point location = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
        System.out.println(location);
          //Button color
        String cssValue = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color");
        System.out.println(cssValue);
          //Height
        int cssValue2 = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize().getHeight();
        System.out.println(cssValue2);

        
	}

}
