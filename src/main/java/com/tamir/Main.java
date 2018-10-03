package com.tamir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	private static final Object Keys = ;

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	WebElement element = driver.findElement(By.ById.id("lst-ib"));
	element.sendKeys("sdbsdmvnbdsmvbd mbnmnb");
	element.sendKeys(Keys.ENTER);
    }
}
