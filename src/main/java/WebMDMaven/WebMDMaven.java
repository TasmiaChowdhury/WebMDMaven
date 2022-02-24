package WebMDMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebMDMaven {

	public static void main(String[] args) {
		// Find A Doctor feature Check 
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://www.webmd.com/"); 
		driver.manage().window().maximize(); 
		
		WebElement findADoctor = driver.findElement(By.xpath("//*[@id=\"ContentPane1\"]/nav/div[1]/div[2]/ul[1]/li[3]/a"));
		findADoctor.click();
		
		
		WebElement searchDoc = driver.findElement(By.xpath("//*[@id=\"searchkeywords_desktop\"]"));
		WebElement zipCode = driver.findElement(By.xpath("//*[@id=\"searchlocation_desktop\"]"));
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"serp-block-form\"]/div/div/div[4]/div/div/button"));

		//pass the data input 
		searchDoc.sendKeys("eye doctor");
		zipCode.sendKeys("11001");
		submitButton.click();
		
		
	}

}
