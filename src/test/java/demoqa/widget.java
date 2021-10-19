package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class widget {
	
	WebDriver driver;
	@BeforeSuite
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.bajpai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/widgets");
		driver.manage().window().maximize();
	}
	
	@Test(description= "Accordian Test")
	public void accordianTest() {
		driver.get("https://demoqa.com/accordian");
			if(!driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(1) > div.collapse.show")).isDisplayed()){
				loremIpsum();
			}
		driver.findElement(By.xpath("//*[@id=\"accordianContainer\"]/div/div[2]/div[2]")).click();

//		if(!driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(2) > div.collapse.show")).isDisplayed()){
//				menu2();
//			}
//
//			if(!driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(3) > div.collapse.show")).isDisplayed()){
//				menu3();
//			}

	}
	public void loremIpsum(){
		driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(1) > div.collapse.show")).click();
	}

	public void menu2(){
		driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(2) > div.collapse.show")).click();
	}

	public void menu3(){
		driver.findElement(By.cssSelector("#accordianContainer > div > div:nth-child(3) > div.collapse.show")).click();
	}

}
