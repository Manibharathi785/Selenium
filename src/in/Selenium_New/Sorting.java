package in.Selenium_New;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sorting/#Simple%20List");
		driver.manage().window().maximize();

		WebElement simpleList = driver.findElement(By.xpath("//li[@id='Simple List']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,-1000);");
		js.executeScript("arguments[0].scrollIntoView();", simpleList);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		simpleList.click();

		List<WebElement> items = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		WebElement from = items.get(5);
		WebElement to = items.get(0);
		Actions act = new Actions(driver);
		act.dragAndDrop(from, to);
//		act.clickAndHold(from).moveToElement(to).release().build().perform();

	}

}
