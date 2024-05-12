package com.selectmenu;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectmenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Selectmenu']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[@id='speed-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ui-id-3']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='files-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ui-id-7']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='number-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='number-button']")).click();;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='salutation-button']//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ui-id-30']")).click();
		Thread.sleep(3000);



		
	}

}
