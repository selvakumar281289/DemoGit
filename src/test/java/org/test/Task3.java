package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar\\eclipse-workspace\\DomainProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://air-swift.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement dp = driver.findElement(By.xpath("//div[@class='select-selected sel1']"));
		dp.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement cit = driver.findElement(By.xpath("//*[@id=\"round-trip\"]/ul/li[1]/div/div[2]/div[4]"));
		cit.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement rt = driver.findElement(By.xpath("//div[@class='select-selected sel2']"));
		rt.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement rtcit = driver.findElement(By.xpath("//*[@id=\"round-trip\"]/ul/li[2]/div/div[2]/div"));
		rtcit.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebElement indate = driver.findElement(By.xpath("(//input[@name='DepartureDate1'])[1]"));
		indate.sendKeys("09-11-2019");
		
		WebElement outdate = driver.findElement(By.xpath("(//input[@name='DepartureDate2'])[1]"));
		outdate.sendKeys("10-11-2019");
		
		
		
}
}