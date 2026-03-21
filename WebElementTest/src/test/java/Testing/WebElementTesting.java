package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.amazon.com");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 17");
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone 17");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 17");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.quit();


		
		

	}

}
