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
        Select se1=new Select(findElement);
        se1.selectByIndex(1);
        
        WebElement findElement2 = driver.findElement(By.name("dropdown2"));
        Select se2 =new Select(findElement2);
        se2.selectByVisibleText("Appium");
        
        WebElement findElement3 = driver.findElement(By.id("dropdown3"));
        Select se3=new Select(findElement3);
        se3.selectByValue("3"); 
        
        WebElement findElement4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
        Select se4=new Select(findElement4);
        List<WebElement> options = se4.getOptions();
        int size = options.size();
        System.out.println(size);
        
        driver.findElement(By.xpath("(//div[@class='example'])[5]//select")).sendKeys("UFT/QTP");
        
        driver.findElement(By.xpath("(//div[@class='example'])[6]//select/option[2]")).click();
        

        }

}
