package in.Selenium_New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.imdb.com/");

		WebElement movie = driver.findElement(By.xpath("//input[@id='suggestion-search']"));
		movie.sendKeys("Farzi");

		WebElement search = driver
				.findElement(By.xpath("//button[@class='nav-search__search-submit searchform__submit']"));
		search.click();

		WebElement farzi = driver.findElement(By.xpath("//a[text()='Farzi']"));
		farzi.click();

		WebElement ratings = driver.findElement(By.xpath("//label[@id='imdbHeader-navDrawerOpen']"));
		ratings.click();

		WebElement print = driver.findElement(By.xpath("//span[@class='sc-afe43def-1 fDTGTb']"));
		String output = print.getText();
		System.out.println(output);
	}

}
