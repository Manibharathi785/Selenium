package in.Selenium_New;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/grid.xhtml");

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int totalColumns = columns.size();
		System.out.println("Total columns = " + totalColumns);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int totalrows = rows.size();
		System.out.println("Total Rows = " + totalrows);

//		driver.findElement(By.xpath("//td[normalize-space()='Blue Band']//following::td[3]"));
		WebElement name = driver.findElement(By.xpath("//tr[3]//td[3]"));
		String category = name.getText();
		System.out.println("Category = " + category);

		List<WebElement> allPrices = driver.findElements(By.xpath("//td[5]"));

		List<Float> floatPrices = new ArrayList<Float>();

		for (WebElement allPricesSeparate : allPrices) {
			String replacedPrices = allPricesSeparate.getText().replace("$", "");
			float parseInt = Float.parseFloat(replacedPrices);
			floatPrices.add(parseInt);
		}
		System.out.println("List of Prices = " + floatPrices);

		float smallValue = Collections.min(floatPrices);
		System.out.println("Smallest Price = $" + smallValue);

	}

}
