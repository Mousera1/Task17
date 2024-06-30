package seleniumjava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Actions action = new Actions(driver);
		WebElement signInButton = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		action.moveToElement(signInButton).build().perform();
		//signInButton.click();
	    WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'login')]"));
        loginButton.click();
        Thread.sleep(3000);
        driver.switchTo().frame("loginIframe"); 
        Thread.sleep(3000);
        
        WebElement mobileInput = driver.findElement(By.id("userName"));  
        mobileInput.sendKeys("9442630232");
        WebElement continuebutton = driver.findElement(By.id("checkUser"));
        continuebutton.click(); 
        
        Thread.sleep(3000);
        
        
        //once the code is given manually inside the website the Login page opens.
        

	}

}
