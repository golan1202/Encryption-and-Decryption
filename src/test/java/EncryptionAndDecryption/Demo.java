package EncryptionAndDecryption;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("ravi.kiran1@gmail.com");
		
		String decryptedPassword = decryptingPassword("cmtpcmFu");
		
		driver.findElement(By.id("input-password")).sendKeys(decryptedPassword);
		
		driver.findElement(By.cssSelector("input[type='submit'][value='Login']")).click();
		
	}
	
	public static String decryptingPassword(String encryptedPassword) {
		
		byte[] decryptedBytePassword = Base64.getDecoder().decode(encryptedPassword);
		
		String decryptedStringPassword = new String(decryptedBytePassword);
		
		return decryptedStringPassword;
		
		
	}
	

}