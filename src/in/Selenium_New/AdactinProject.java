package in.Selenium_New;

import java.io.File;


import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinProject {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("sampleproject");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("Mani@adactin785");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();

		WebElement location = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s1 = new Select(location);
		List<WebElement> options = s1.getOptions();
		Thread.sleep(2000);
		for (WebElement placeOptions : options) {
			System.out.println(placeOptions.getText());
		}
		System.out.println("============");
		s1.selectByValue("Los Angeles");
		WebElement hotels = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		Select s2 = new Select(hotels);
		s2.selectByIndex(1);
		WebElement rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s3 = new Select(rooms);
		List<WebElement> options2 = s3.getOptions();
		for (WebElement roomsOptions : options2) {
			System.out.println(roomsOptions.getText());
		}
		System.out.println("=============");
		s3.selectByVisibleText("Super Deluxe");
		WebElement roomsCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s4 = new Select(roomsCount);
		s4.selectByIndex(1);
		WebElement checkIn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		checkIn.sendKeys("12/03/2023");
		WebElement checkOut = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		checkOut.sendKeys("15/03/2023");
		WebElement adultsCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		Select s5 = new Select(adultsCount);
		s5.selectByValue("2");
		WebElement childCount = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		Select s6 = new Select(childCount);
		s6.selectByIndex(1);
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();

		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		WebElement confirmHotel = driver.findElement(By.id("continue"));
		confirmHotel.click();

		WebElement fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		fname.sendKeys("Ahamed");
		WebElement lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lname.sendKeys("Alikhan");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys("No.9/A, 2nd Cross Street, Murugesan Nagar, Thiruninravur.");
		WebElement cardNo = driver.findElement(By.name("cc_num"));
		cardNo.sendKeys("1234 1234 1234 1234");
		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(cardType);
		s7.getOptions();
		s7.selectByIndex(1);
		WebElement expMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8 = new Select(expMonth);
		s8.selectByVisibleText("May");
		WebElement expYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(expYear);
		s9.selectByIndex(4);
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.sendKeys("987");
		WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		book.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Screenshots\\Adactin.png");
		FileUtils.copyFile(from, to);
//		FileHandler.copy(from, to);

		driver.quit();

	}

}
