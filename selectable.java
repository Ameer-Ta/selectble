package com.selectable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Actions actions=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//li[normalize-space()='Item 1']"));
		//actions.clickAndHold(e).perform();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//li[normalize-space()='Item 2']"));
		actions.clickAndHold(e).clickAndHold(e1).perform();
		Thread.sleep(3000);

	}
}






