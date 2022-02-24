package WebMDMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebMDMaven {

	public static void main(String[] args) {
		// this will be our Master Branch 
		
		//System.out.println("This is our Master Branch ");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.webmd.com/"); 
		driver.manage().window().maximize(); 
		
		
	}

}
