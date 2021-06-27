package org.fb;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP laptop\\janani\\Locators\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		WebElement txtSerach = driver.findElement(By.name("q"));
		txtSerach.sendKeys("Mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[text()='SAMSUNG']")).click();
		txtSerach.clear();
		txtSerach.sendKeys("Samsung Galaxy f41", Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F41 (Fusion Black, 64 GB)']")).click();	
			    String parent = driver.getWindowHandle();
		    Set<String> s = driver.getWindowHandles();
		      for (String s1 : s) {
		        if (!(parent.equals(s1))) {
		            driver.switchTo().window(s1);
		        }
		    }
		      String amount = driver.findElement(By.xpath("//div[text()='₹15,999']")).getText();
		      System.out.println(amount); 
		      System.out.println();
		      String highlight = driver.findElement(By.xpath("//div[@class='_2cM9lP']")).getText();
		      System.out.println(highlight);
		      System.out.println();
		      String descrip = driver.findElement(By.xpath("//div[@class='_3nkT-2']")).getText();
		        System.out.println(descrip);
		
	}

}
