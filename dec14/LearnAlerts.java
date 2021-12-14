package dec14;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver =new ChromeDriver();
            driver.get("http://leafground.com/pages/Alert.html");
            driver.manage().window().maximize();
          
                     // Alert Box
            WebElement alertbox = driver.findElement(By.xpath("//button[text()='Alert Box']"));
            alertbox.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
                     //Confirm Box
            WebElement confirmbox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
            confirmbox.click();
            alert.dismiss();
                    // Prompt Box
            WebElement promptbox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
            promptbox.click();
            alert.sendKeys("Vijay");
            alert.accept();
            
                   // Lines break
            WebElement linesbreak = driver.findElement(By.xpath("//button[text()='Line Breaks?']"));
            linesbreak.click();
            Thread.sleep(2000);
            alert.accept();
            
	
	
	}

}
