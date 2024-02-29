package TestNG.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void login() {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		System.out.println("Driver Openend and Site opened");

		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='username']"));
		usernameField.sendKeys("Admin");
		System.out.println("Login ID Entered");

		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		passwordField.sendKeys("admin123");
		System.out.println("Password Entered");

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		loginButton.click();
		
		WebElement username1 = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		username1.click();
		System.out.println("Navigated to Myinfo");

	}
}
