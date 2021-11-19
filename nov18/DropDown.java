package nov18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        WebElement findElement = driver.findElement(By.id("dropdown1"));
        Select se=new Select(findElement);
        se.selectByIndex(1);
        
        WebElement findElement2 = driver.findElement(By.id("dropdown2"));
        Select see =new Select(findElement2);
        see.deselectByVisibleText("Appium");
        
        WebElement findElement3 = driver.findElement(By.id("dropdown3"));
        Select seee=new Select(findElement3);
        se.selectByValue("3");

  
        
	}

}
