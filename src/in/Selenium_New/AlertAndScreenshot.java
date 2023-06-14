package in.Selenium_New;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement click1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		click1.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		WebElement click4 = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		click4.click();
		Thread.sleep(6000);
		Alert alert4 = driver.switchTo().alert();
		alert4.dismiss();
		Thread.sleep(2000);

//		WebElement click2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		click2.click();
//		Thread.sleep(2000);
//		Alert alert2 = driver.switchTo().alert();
//		alert2.dismiss();
//		Thread.sleep(2000);
//
//		WebElement click3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
//		click3.click();
//		Alert alert3 = driver.switchTo().alert();
//		alert3.sendKeys("");

		driver.navigate().to("https://www.google.co.in/maps/@13.0449408,80.19968,12z");
		driver.manage().window().maximize();

		Thread.sleep(5000);

		WebElement findElement = driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		findElement.sendKeys("Greens Tech Vadapalani");

		Thread.sleep(5000);

		WebElement findElement1 = driver.findElement(By.xpath("//div[@class='DgCNMb']"));
		findElement1.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Screenshots\\Map.png");
		FileUtils.copyFile(src, des);

	}

}
