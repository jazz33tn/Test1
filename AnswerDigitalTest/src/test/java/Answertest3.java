import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Answertest3 {
	
	@Test
	
	public void assertkey() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector(
				"div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(31) > a:nth-child(1)"))
				.click();
		WebElement el1 = driver.findElement(By.cssSelector("#target"));
				el1.sendKeys("F");
		Thread.sleep(5000);
	WebElement el2 = driver.findElement(By.cssSelector("#result"));
		el2.getText();
		Assert.assertEquals(el1, el2);
}
}
