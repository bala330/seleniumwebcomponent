package org.in;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
		driver.navigate().to("https://www.guvi.in/");
		WebElement signup = driver.findElement(By.xpath("(//a[contains(text(),'Sign up')])[1]"));
		signup.click();
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("raj");
		WebElement lastname = driver.findElement(By.xpath("(//input[@placeholder='Enter name'])[2]"));
		lastname.sendKeys("s");
		WebElement email = driver.findElement(By.cssSelector("input#emailInput"));
		email.sendKeys("rajra35@gmail.com");
		WebElement pass = driver.findElement(By.id("passwordInput"));
		pass.sendKeys("rajugs23@");
		WebElement mobile = driver.findElement(By.name("mobileNumberInput"));
		mobile.sendKeys("9655913338");
		WebElement signbutton = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		signbutton.click();

		WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Successfully Registered')]"));
		String successfully = title.getText();
		String expectedresult = "Successfully Registered";
		if (successfully.equals(expectedresult)) {
			System.out.println("It has succesfully registered");

		} else {
			System.out.println("It has not succesfully registered");

		}
		driver.navigate().back();
		driver.navigate().back();
		WebElement login = driver.findElement(By.xpath("(//a[contains(text(),'Login')])[1]"));
		login.click();
		WebElement emailid = driver.findElement(By.id("login_email"));
		emailid.sendKeys("rajra35@gmail.com");
		WebElement password = driver.findElement(By.id("login_password"));
		password.sendKeys("rajugs23@");
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		loginbtn.click();
		WebElement btn = driver.findElement(By.id("sendmail"));
		btn.click();
		WebElement mail = driver.findElement(By.xpath("//p[contains(text(),'Please check your mail')]"));
		String actualmail = mail.getText();
		String expectedmail = "Please check your mail";
		if (actualmail.equals(expectedmail)) {
			System.out.println("It has succesfully login");

		} else {
			System.out.println("It has not succesfully login");

		}
		driver.quit();
	}

}
