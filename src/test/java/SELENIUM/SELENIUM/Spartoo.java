package SELENIUM.SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Spartoo {
	
	WebDriver driver = new ChromeDriver();
	
	
	
	
	@BeforeTest
	public void siteLaunch()
	{
		driver.get("https://www.spartoo.eu/securelogin.php?from=compte");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//div[@class='cookies_info']/div/div[3]/button[text()='Accept all and close']")).click();
		driver.findElement(By.xpath("//i[@class='icon-annuler']")).click();
	}
	
	@Test(dataProvider = "userName")
	public void siginUserName(String name) throws InterruptedException
	{
		System.out.println(name);
		driver.findElement(By.id("loginForm_emailAddress")).sendKeys(name);
		Thread.sleep(1000);
		driver.findElement(By.id("loginForm_emailAddress")).clear();
	}
	
	@DataProvider(name = "userName")
	public Object userName()
	{
		Object [] o = {"chinniahvenkatesh@gmail.com","arun","dhoni"};
		return o;
	}

}
