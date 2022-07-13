package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Study {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(600);
		
	//1.Create obj of actions class and pass webDriver obj
		
	    Actions act=new Actions(driver);
	    
	//2.Identify element where where Actions to be perform
	    
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		
	//3.Using Actions class method perform desired operation(context click/right click)
		 //1st Method
		
		//act.moveToElement(rightClickButton).perform();//moved mouse to desired location
		
		//2nd Method
		
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		//3rd Method
		//act.contextClick(rightClickButton).perform();
		
	//Double click using Actions Class
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClickButton).perform();
	}

}
