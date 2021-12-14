package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disablenotifications");
	ChromeDriver driver=new ChromeDriver(option);
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement findElement = driver.findElement(By.xpath("//li[@class='navlink lnHeight']/a/span"));
	Actions act=new Actions(driver);
	act.moveToElement(findElement).perform();
	
	
}
}
