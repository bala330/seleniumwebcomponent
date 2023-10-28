package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calcender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement box = driver.findElement(By.id("datepicker"));
		box.click();

		WebElement datepicker = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		datepicker.click();
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'22')]"));
		date.click();
		String datetext = date.getText();
		System.out.println("Selected the date is : " + datetext);

		driver.quit();
	}

}
