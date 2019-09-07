package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;

	@Test
	public void openMyBlog() {

		System.setProperty("webdriver.chrome.driver",
				"/usr/bin/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.softwaretestingmaterial.com/");
		//driver.manage().window().maximize();
		System.out.println("Hiiiii Testing thiiisss");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}