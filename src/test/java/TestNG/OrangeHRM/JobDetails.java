package TestNG.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JobDetails {

	@SuppressWarnings("deprecation")
	@Test
	public void login(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		System.out.println("Driver Openend and Site opened");
		
		
		
		WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']"));
		usernameField.sendKeys("Admin");
		System.out.println("Login ID Entered");
		
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123");
        System.out.println("Password Entered");
        
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        
        
        loginButton.click();
        
        WebElement myInfoTab = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[6]/a[1]"));
        myInfoTab.click();
        
        WebElement JobTab = driver.findElement(By.xpath("//a[contains(text(),'Job')]"));
        JobTab.click();
        
        WebElement joinedDate = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
        if (joinedDate.getAttribute("readonly") != null || joinedDate.getAttribute("disabled") != null) {
            System.out.println("Joined date field is read-only or disabled.");
        } else {
            System.out.println("Joined date field is editable.");
        }
        
        

}
}
