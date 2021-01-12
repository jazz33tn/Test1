import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AnswerTest2 {

@Test
public void scrollDownUp() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
Actions action = new Actions(driver);
driver.get("http://the-internet.herokuapp.com/");
driver.findElement(By.cssSelector(
		"div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(26) > a:nth-child(1)"))
		.click();
Thread.sleep(3000);
action.sendKeys(Keys.PAGE_DOWN).build().perform();
Thread.sleep(3000);
action.sendKeys(Keys.PAGE_DOWN).build().perform();
Thread.sleep(3000);
action.sendKeys(Keys.PAGE_UP).build().perform();
Thread.sleep(3000);
driver.close();
}
}
