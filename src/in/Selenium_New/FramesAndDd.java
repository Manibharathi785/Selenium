package in.Selenium_New;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesAndDd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);

		WebElement findElement = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(findElement);

		WebElement findElement2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		findElement2.sendKeys("Lionel Messi");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		WebElement findElement3 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		findElement3.click();

		WebElement findElement5 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(findElement5);

		WebElement findElement6 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(findElement6);

		WebElement findElement4 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		findElement4.sendKeys("Virgil van Dijk");

		driver.switchTo().defaultContent();

		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int size = totalFrames.size();
		System.out.println("Total Frames = " + size);

		driver.navigate().to("http://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement findElement7 = driver.findElement(By.id("oldSelectMenu"));

		Select s = new Select(findElement7);
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);

		WebElement findElement8 = driver.findElement(By.xpath("//select[@id='cars']"));
		Select n = new Select(findElement8);
		boolean multiple = n.isMultiple();
		System.out.println(multiple);
		System.out.println("=========");
		n.getOptions();
		n.selectByValue("volvo");
		Thread.sleep(2000);
		n.selectByVisibleText("Saab");
		Thread.sleep(2000);
		n.selectByIndex(2);
		Thread.sleep(2000);

		List<WebElement> all = n.getAllSelectedOptions();
		for (WebElement allCars : all) {
			System.out.println(allCars.getText());
		}

		n.deselectAll();
		Thread.sleep(2000);
		n.selectByIndex(3);

	}

}
