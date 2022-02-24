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
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"serp-block-form\"]/div/div/div[4]/div/div/button/span"));

		//pass the data input 
		searchDoc.sendKeys("eye doctor");
		zipCode.sendKeys("");
		submitButton.click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back(); // this will navigate back
		driver.navigate().back();// brings to home page
		
		WebElement findDentist = driver.findElement(By.xpath("//*[@id=\"ContentPane1\"]/nav/div/div[2]/ul[1]/li[4]/a"));
		findDentist.click();
		
		WebElement searchDentist = driver.findElement(By.xpath("//*[@id=\"searchkeywords_desktop\"]"));
		WebElement zipforDentist=driver.findElement(By.xpath("//*[@id=\"searchlocation_desktop\"]"));
		WebElement submitForDentist = driver.findElement(By.xpath("//*[@id=\"serp-block-form\"]/div/div/div[4]/div/div/button"));
		
		searchDentist.sendKeys("");
		zipforDentist.sendKeys("");
		submitForDentist.click();
		System.out.println(driver.getTitle());
		
		
	}

}
