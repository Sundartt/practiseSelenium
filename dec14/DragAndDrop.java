package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disablenotifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://www.leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(findElement, 50, 100).perform();
		
	}

}
