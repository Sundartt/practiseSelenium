package dec15;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapDealsAgain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Launch a website
		driver.get("https://www.snapdeal.com/");
		// Maximize the browser
		driver.manage().window().maximize();
		// Go to men's fashion
		WebElement findElement = driver.findElement(By.xpath("//li[@class='navlink lnHeight']/a/span")); // or(//span[@class='catText'])[6]
		Actions builder = new Actions(driver);
		builder.moveToElement(findElement).perform();
		// Go to sports shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		// Get the count of sports shoes
		String text = driver.findElement(By.xpath("//span[@class='category-count']")).getText();
		String replaceAll = text.replaceAll("\\D", "");
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println(parseInt);
		// Click training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		// Sort Low to High
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		Thread.sleep(2000);
		// check the product displayed correctly
		List<WebElement> prodList = driver.findElements(By.xpath("//span[@class ='lfloat product-price']"));

		List<String> shoePrice = new ArrayList<String>();

		for (int i = 0; i < prodList.size(); i++) {

			String price = prodList.get(i).getText();

			shoePrice.add(price);

			int intShoePrice = Integer.parseInt(price.replaceAll("\\D", ""));

			System.out.println(intShoePrice);

		}

		// Select the price range
		WebElement findElement2 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		findElement2.clear();
		findElement2.sendKeys("900");
		WebElement findElement3 = driver.findElement(By.xpath("//input[@name='toVal']"));
		findElement3.clear();
		findElement3.sendKeys("1200");
		// Click Go
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(2000);
		// Click view more
		driver.findElement(By.xpath("//div[@class='filter-inner filter-inner-height']/following-sibling::button"))
				.click();
		// Filter with navy color
		// driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		driver.findElement(By.xpath("//input[@id='Color_s-Navy']/following-sibling::label[1]")).click();

	}
}