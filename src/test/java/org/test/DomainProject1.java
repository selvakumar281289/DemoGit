package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomainProject1 {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar\\eclipse-workspace\\DomainProject\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flynovoair.com/");
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement selection = driver.findElement(By.xpath("//select[@name='PA']"));
	selection.click();
	
	Robot r=new Robot();
	
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement fro = driver.findElement(By.xpath("//select[@name='DC']"));
	fro.sendKeys("KOLKATA");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement to = driver.findElement(By.xpath("//select[@name='AC']"));
	to.sendKeys("DHAKA");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement startdate = driver.findElement(By.xpath("//input[@id='from-date']"));
	startdate.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement pickdate = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[2]/td[5]"));
	pickdate.click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement btn = driver.findElement(By.xpath("//input[@class='btn-search']"));
	btn.click();
	
	WebElement fligname = driver.findElement(By.xpath("(//td[@class='flight'])[1]"));
	
	String text = fligname.getText();
	System.out.println(text);
	
	System.out.println("HELLO");
	
	
}
}
