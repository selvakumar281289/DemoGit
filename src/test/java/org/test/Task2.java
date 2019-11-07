package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvakumar\\eclipse-workspace\\DomainProject\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobile.airfrance.fr/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement agr = driver.findElement(By.xpath("//*[@id=\"gdpr_popin\"]/section/div/div[3]/button"));
		agr.click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement dots = driver.findElement(By.xpath("//div[@class='bmw-picto-menu']"));
		dots.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement lintext = driver.findElement(By.xpath("//a[contains(text(),'Purchase')]"));
		lintext.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//input[@id='idDepartureTrip1']"));
		from.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement seleciti = driver.findElement(By.xpath("//*[@id=\"idDepartureTrip1Container\"]/div[1]/span[1]"));
		seleciti.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement desciti = driver.findElement(By.xpath("//*[@id=\"idArrivalTrip1Container\"]/div[3]/span[2]"));
		  desciti.click();
	
		
	}

}
