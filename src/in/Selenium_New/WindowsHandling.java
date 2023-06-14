package in.Selenium_New;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0lidtzdg295ucgniajuq6rvmu274891.node0");

		String oldTab = driver.getWindowHandle();
		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		Set<String> allTabs = driver.getWindowHandles();
		for (String newTab : allTabs) {
			driver.switchTo().window(newTab);
		}
		driver.close();

		driver.switchTo().window(oldTab);
//		driver.switchTo().defaultContent();	// Used only in frames
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement multiple = driver.findElement(By.id("j_idt88:j_idt91"));
		multiple.click();

		int size = driver.getWindowHandles().size();
		System.out.println("Total Windows = " + size);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.quit();

//		Set<String> allWindows = driver.getWindowHandles();
//		for (String allWindowsHandle : allWindows) {
//
//			if (!allWindowsHandle.equalsIgnoreCase(oldTab)) {
//				driver.switchTo().window(allWindowsHandle);
//				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//				driver.close();
//			}
//
//		}

	}

}
