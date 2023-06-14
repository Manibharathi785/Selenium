package in.Selenium_New;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndJSExecutor {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.contextClick(mobiles).perform();
		Thread.sleep(3000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement todaysDeal = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		js.executeScript("arguments[0].scrollIntoView();", todaysDeal);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-5000);");
		Thread.sleep(3000);
		WebElement sell = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		js.executeScript("arguments[0].click();", sell);
		Thread.sleep(3000);

		Set<String> multiple = driver.getWindowHandles();
		for (String allWindow : multiple) {
			driver.switchTo().window(allWindow);
		}

		WebElement bestSellers = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		act.contextClick(bestSellers).perform();

		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allWindows = driver.getWindowHandles();
		for (String windows : allWindows) {
			driver.switchTo().window(windows);
		}
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}

//		Thread.sleep(2000);
//		driver.close();
//		Thread.sleep(2000);
//		driver.quit();

	}

}
