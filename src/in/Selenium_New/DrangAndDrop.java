package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrangAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node01dgzwca4jam7qlqia9fn7ag4c275006.node0");
		driver.manage().window().maximize();

		WebElement draggable = driver.findElement(By.id("form:drag"));
		WebElement droppable = driver.findElement(By.id("form:drop"));

		Actions act = new Actions(driver);
//		act.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		act.dragAndDrop(draggable, droppable).build().perform();

	}

}
