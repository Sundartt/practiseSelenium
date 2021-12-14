package dec14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		// Find xpath for whole table
		WebElement findElement = driver.findElement(By.xpath("//table[@id='table_id']"));
		// Find number of rows
		List<WebElement> row = findElement.findElements(By.tagName("tr"));
		// Print the row size
		int size = row.size();
		System.out.println(size);
		// print third row
		WebElement printingThirdRow = row.get(2);
		String printingThirdRowText = printingThirdRow.getText();
		System.out.println("Third row text:" + "" + printingThirdRowText);
		// Find number of columns
		List<WebElement> columns = printingThirdRow.findElements(By.tagName("td"));
		// print number of columns
		int size2 = columns.size();
		System.out.println(size2);
		for (int i = 0; i < row.size(); i++) {
			WebElement webElement = row.get(i);
			List<WebElement> eachRomOfFirstColumns = webElement.findElements(By.tagName("td"));
			WebElement wholecolumnPrinting = eachRomOfFirstColumns.get(3);
			String columnText = wholecolumnPrinting.getText();
			System.out.println(columnText);
		}

	}

}
