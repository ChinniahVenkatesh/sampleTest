package SELENIUM.SELENIUM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class networkExample {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void clearCache() throws InterruptedException
	{
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		driver.navigate().to("chrome://settings/clearBrowserData?search=clear");
		
		WebElement clearData = driver.findElement(By.xpath("//settings-ui"));
		clearData.sendKeys(Keys.ENTER);
		System.out.println("BeforeTest");

	}
	
	
	
	@Test
	public void openBrowser()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows().open");
		
	}
	
	@Test(dependsOnMethods = {"getData"},dataProvider = "setData")
	public void test1(String name)
	{
		System.out.println("name"+name);
	}
	
	@Test
	public void getData()
	{
		System.out.println("Methods");
	}
	
	@DataProvider
	public Object setData()
	{
		Object [] c = {"Arun"};
		return c;
	}
	
	@Test
	@Parameters({"browser"})
	public void browser(String name)
	{
		System.out.println(name);
	}

}
