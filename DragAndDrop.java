package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(600);
 //1.find source and destination element
		WebElement sourceElement = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement destinationElement = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[5]"));
//2.create obj of Actions class and pass driver	
		Actions act=new Actions(driver);
		
//3.Using cascade method
		//act.moveToElement(sourceElement).clickAndHold().moveToElement(destinationElement).release().build().perform();
		act.dragAndDrop(sourceElement, destinationElement).perform();
	
	}

}
