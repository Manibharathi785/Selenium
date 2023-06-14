package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipAndAutoComplete {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/messages.xhtml;jsessionid=node01dgzwca4jam7qlqia9fn7ag4c275006.node0");

		WebElement nameBox = driver.findElement(By.id("j_idt100:firstname"));
		String value = nameBox.getAttribute("title");
		System.out.println("Attribute Value = " + value);

	}

}
