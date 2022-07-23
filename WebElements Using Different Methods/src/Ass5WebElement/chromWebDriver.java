package Ass5WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chromWebDriver {
	public WebDriver driver;

	@Test
	public void chrom() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// Navigate to a Amazon website - Sign-in Page
		driver.navigate()
				.to("https://www.amazon.com/ap/" + "signin?openid.pape.max_auth_age=0&openid.return_to="
						+ "https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid."
						+ "identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
						+ "0%2Fidentifier_select&openid.assoc_handle=usflex&openid."
						+ "mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs."
						+ "openid.net%2Fauth%2F2.0%2Fidentifier_select&openid."
						+ "ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		// Maximize current window
		driver.manage().window().maximize();

		
		// Find Element By id
		driver.findElement(By.id("ap_email")).sendKeys("mawaddah");
		Thread.sleep(2000); // Delay execution for 2 seconds

		// Find Element By class Name
		driver.findElement(By.className("a-expander-prompt")).click();
		Thread.sleep(2000);// Delay execution for 2 seconds

		// Find Element By Link Text
		driver.findElement(By.linkText("Create your Amazon account")).click();
		Thread.sleep(2000);// Delay execution for 2 seconds

		// Find Element By Partial Link Text
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(2000);// Delay execution for 2 seconds

		// Close the browser
		driver.quit();
	}
}
