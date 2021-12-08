package dec8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentsDulipcateLeadNovBatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Download the driver and set its path
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the window
		driver.manage().window().maximize();
		// Enter the Username {Elder to younger sibling}
		WebElement findElement = driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
		findElement.sendKeys("Demosalesmanager");
		String attribute = findElement.getAttribute("value");
		System.out.println(attribute);

		// Enter the password { Elder to younger sibling}
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		// Click login button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// Click CRM/SFA link {Grandparent to child}
		driver.findElement(By.xpath("//div[@id='button']/div/a")).click();
		// Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click find leads{Grandparent to child}
		driver.findElement(By.xpath("(//ul[@class='shortcuts'])/li[3]/a")).click();
		// Click Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		// Type Email{parent to child}
		driver.findElement(By.xpath("(//div[@class='x-form-element'])[22]/input")).sendKeys("vijay");
		// Click Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// Capture first resulting lead{Maximum take parent to child for first resulting
		// lead}
		WebElement findElement2 = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		String text = findElement2.getText();
		System.out.println(text);
		Thread.sleep(2000);
		// Click First resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		// Click duplicate lead
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a")).click();
		// verify title has duplicate lead
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("it has duplicate");
		} else {
			System.out.println("it does not have duplicate lead");
		}
		// Click create lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//

	}

}
