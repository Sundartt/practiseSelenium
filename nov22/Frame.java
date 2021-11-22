package nov22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      driver.findElement(By.id("//b[@id='topic']")).sendKeys("Selenium");
      driver.switchTo().frame(0);
      driver.findElement(By.id("//input[@id='a']")).click();
      driver.switchTo().frame(0);
      WebElement findElement = driver.findElement(By.id("//select[@id='animals']"));
      Select se=new Select(findElement);
      se.selectByValue("babycat");
      
      
	}

}
