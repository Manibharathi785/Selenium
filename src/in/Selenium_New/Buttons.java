package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");

		WebElement positionBox = driver.findElement(By.id("j_idt88:j_idt94"));
		Point boxLocation = positionBox.getLocation();
		int xPoint = boxLocation.getX();
		int yPoint = boxLocation.getY();
		System.out.println("Position of Box = " + xPoint + " " + yPoint);

		WebElement boxColor = driver.findElement(By.id("j_idt88:j_idt96"));
		String cssValue = boxColor.getCssValue("background-color");
		System.out.println("background colour is : " + cssValue);

		WebElement boxSize = driver.findElement(By.id("j_idt88:j_idt98"));
		Dimension size = boxSize.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Size of Box : Height = " + height + " , Width = " + width);

		WebElement confirmTitle = driver.findElement(By.id("j_idt88:j_idt90"));
		confirmTitle.click();

	}

}
