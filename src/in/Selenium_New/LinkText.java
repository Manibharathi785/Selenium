package in.Selenium_New;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement dashboard = driver.findElement(By.linkText("Go to Dashboard"));
		dashboard.click();
		driver.navigate().back();

		WebElement withoutClick = driver.findElement(By.partialLinkText("without clicking me"));
		String value = withoutClick.getAttribute("href");
		System.out.println("This link is going to " + value);

		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		if (driver.getTitle().contains("404")) {
			System.out.println("The link is broken");
		}
		driver.navigate().back();

		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int totalSize = totalLinks.size();
		System.out.println("Total links = " + totalSize);

//		List<WebElement> linksInThisLayout = driver.findElements(By.tagName("a"));
//		int layoutSize = linksInThisLayout.size();
//		System.out.println("Links in this layout = " + layoutSize);

	}

}
