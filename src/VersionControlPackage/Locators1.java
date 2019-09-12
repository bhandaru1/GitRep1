package VersionControlPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Email");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Password");
		driver.findElement(By.cssSelector("#u_0_2")).click();

		/*
		 * driver.findElement(By.id("email")).sendKeys("Enter Email ID");
		 * driver.findElement(By.name("pass")).sendKeys("Enter Password");
		 * driver.findElement(By.linkText("Forgot account?")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.id("u_0_e")).sendKeys("Enter First Name");
		 * driver.findElement(By.name("lastname")).sendKeys("Enter Last Name");
		 * driver.findElement(By.id("u_0_j")).sendKeys("Enter Mobile or Email");
		 * driver.findElement(By.id("u_0_q")).sendKeys("New Password");
		 */

	}

}
