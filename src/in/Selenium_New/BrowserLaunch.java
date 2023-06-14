package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/login/");

		Thread.sleep(3000);

		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);

		driver.navigate().forward();

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		Thread.sleep(3000);

		driver.get("https://www.facebook.com/login/");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abc@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("Mani@123");

		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();

	}

}
