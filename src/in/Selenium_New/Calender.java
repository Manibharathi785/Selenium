package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();

		WebElement enabledBox = driver.findElement(By.id("datepicker2"));
		enabledBox.sendKeys("05/10/2023" + Keys.ENTER);

		WebElement openCalender = driver.findElement(By.xpath("//img[@class='imgdp']"));
		openCalender.click();

		WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.visibilityOf(next));
		next.click();

		WebElement date12 = driver.findElement(By.xpath("//a[text()='12']"));
		date12.click();
	}

}
