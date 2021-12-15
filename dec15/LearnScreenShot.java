package dec15;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 * File source=driver.getScreenshotAs(OutputType.FILE); File target=new
		 * File("./snaps/vij.png"); FileUtils.copyFile(source, target);
		 */
		WebElement findElement = driver.findElement(By.xpath("//div[@id='logo']/img"));
		File source=findElement.getScreenshotAs(OutputType.FILE);
		File target=new File("./snaps/vij.png");
		FileUtils.copyFile(source, target);
		
		
		
	}

}
