package com.selectable1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Downloads\\chromedriverwin\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement e=driver.findElement(By.className("class='ui-selectable'"));
		Select a=new Select(e);
		a.selectByIndex(1);
		a.selectByIndex(2);
		a.selectByIndex(4);
		Thread.sleep(3000);
		a.deselectByIndex(0);
	}

}
