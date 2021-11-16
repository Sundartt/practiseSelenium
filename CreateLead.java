package nov16;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vijay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vijay");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vijayLL");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("L");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("76");
		driver.findElement(By.name("numberEmployees")).sendKeys("55");
	    driver.findElement(By.className("inputBox")).sendKeys("600122");



		

		

		driver.findElement(By.className("smallSubmit")).click();



		
		
		

		
		
	}
	
}
