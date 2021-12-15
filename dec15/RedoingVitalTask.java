package dec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedoingVitalTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Download the chromedriver exe and set its path
		WebDriverManager.chromedriver().setup();
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// Launch the url
		driver.get("http://www.leafground.com/pages/table.html");
		// Maximize the browser
		driver.manage().window().maximize();
		// Find xpath for whole table
		WebElement WholeTablexpath = driver.findElement(By.xpath("//table[@id='table_id']"));
		
		// Find xpath for row(Get the count of number of rows)
		List<WebElement> rowXpath = WholeTablexpath.findElements(By.tagName("tr"));
		// Find size for row
		int rowSize = rowXpath.size();
		System.out.println(rowSize);
		
		// print second row  //from list index starts from 0
		WebElement printingSecondRow = rowXpath.get(1);
		String printingSecondRowText = printingSecondRow.getText();
		System.out.println("second row text:" + "" + printingSecondRowText);
		
		// Find xpath for column(Get the count of number of columns)
		List<WebElement> columnXpath = printingSecondRow.findElements(By.tagName("td"));
		// Find size for column
		int columnSize = columnXpath.size();
		System.out.println(columnSize);
		
		// Get the progress value of learn to interact with Elements
		String text = driver.findElement(By.xpath("//tr[@class='even']/td[2]")).getText();
		System.out.println("value of learn to interact with elements:" + "" + text);
		
		// Check the vital task for least completed progress
		List<Integer> vital = new ArrayList<Integer>();
		for (int i = 2; i <= rowSize; i++) {
			String text2 = driver.findElement(By.xpath("//table[@id='table_id']//tr[" + i + "]/td[2]")).getText();
			String replaceAll = text2.replaceAll("%", "");
			int parseInt = Integer.parseInt(replaceAll);
			vital.add(parseInt);

		}
		Collections.sort(vital);
		System.out.println(vital);

		Integer a = vital.get(0);
		driver.findElement(By.xpath("//td[text()='Learn Locators']/following-sibling::td/input")).click();
		// By.xpath("//td[text()='"+a+"%']/following-sibling::td/input

	}

}
