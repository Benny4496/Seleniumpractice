package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@class='x6s0dn4 x9f619 x78zum5 x1s65kcs x1wsgfga x1pi30zi x1swvt13']//label")).click();
		
		//driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']")).sendKeys("thrissur");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/input")).sendKeys("thrissur");
		Thread.sleep(2000);
		driver.quit();
	}

}
