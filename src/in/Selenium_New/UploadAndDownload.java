package in.Selenium_New;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndDownload {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mani Bharathi\\Eclipse Data\\Selenium_New\\Chrome 114\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0rursnra3ubknu9ge9an35mbt286856.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement advancedUpload = driver.findElement(By.xpath("//span[@id='j_idt97:j_idt98_label']"));
		advancedUpload.click();

//		WebElement basicUpload = driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89']"));
//		basicUpload.click();

		String path = "F:\\Mani Bharathi\\Documents\\29 Kb";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		StringSelection pathTransfer = new StringSelection(path);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pathTransfer, null);

		Robot rbt = new Robot(); 
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);

		// Download

//		WebElement downloadButton = driver.findElement(By.id("j_idt93:j_idt95"));
//		downloadButton.click();
//
//		File filePath = new File("C:\\Users\\HP\\Downloads");
//		File[] listOfFiles = filePath.listFiles();
//		for (File file : listOfFiles) {
//			file.getName().equalsIgnoreCase("Testleaf Logo.png");
//			break;
//		}

	}

}
