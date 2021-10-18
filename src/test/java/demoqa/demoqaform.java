package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class demoqaform {
	static WebDriver driver;
	@BeforeSuite
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav.bajpai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	
	@Test(description = "Name Test")
	public void name_email_Test() throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys("Vaibhav");
		driver.findElement(By.id("lastName")).sendKeys("Bajpai");
		driver.findElement(By.id("userEmail")).sendKeys("demo@gmail.com");
		driver.findElement(By.cssSelector("#userNumber")).sendKeys("9898989898");
//		driver.findElement(By.cssSelector("#dateOfBirthInput")).clear();
//		driver.findElement(By.cssSelector("#dateOfBirth > div.react-datepicker__tab-loop > div.react-datepicker-popper > div > div > div.react-datepicker__month-container > div.react-datepicker__header > div.react-datepicker__header__dropdown.react-datepicker__header__dropdown--select > div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--select > select")).sendKeys("18 Nov 2001");
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3")).sendKeys("Test Automation");
		
//		driver.findElement(By.cssSelector("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label")).click();
        driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\vaibhav.bajpai\\Downloads\\sample.png");
        
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Kanpur UP");
		
        WebElement dropdown = driver.findElement(By.cssSelector("#state > div > div.css-1hwfws3 > div.css-1wa3eu0-placeholder"));
        Select sc = new Select(dropdown);
        sc.selectByValue("2");

        
        WebElement dropdown2 = driver.findElement(By.cssSelector("#city > div > div.css-1hwfws3 > div.css-1g6gooi"));
        Select sc1 = new Select(dropdown2);
        sc1.selectByValue("2");
        
        driver.findElement(By.cssSelector("#submit")).click();

        
	}
	
//	@Test(description = "Email Test")
//	public void genderTest() {
//		driver.findElement(By.cssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")).click();
//		driver.findElement(By.cssSelector("#userNumber")).sendKeys("9898989898");
//		
//		WebElement input = driver.findElement(By.id("dateOfBirthInput"));
//		input.sendKeys(Keys.DELETE);
//		input.sendKeys("07 Nov 2018");
//		input.sendKeys(Keys.TAB);
//		
//	}
	
//	@Test(description = "")
	
}
