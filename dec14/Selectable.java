package dec14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disablenotifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement li1 = driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee']"));
		WebElement li2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[2]"));
		WebElement li3 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[3]"));
		WebElement li4 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[4]"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(li1).click(li2).click(li3).click(li4).keyUp(Keys.CONTROL).perform();
		
	}

}
