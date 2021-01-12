import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AnswerTest1 {

WebDriver driver;

@Before

public void initiate() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

driver = new ChromeDriver();
driver.get("http://the-internet.herokuapp.com/login");

}

@Test

public void loginOK() {

driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")).click();

String actualUrl = "http://the-internet.herokuapp.com/secure";

String expectedUrl = driver.getCurrentUrl();

Assert.assertEquals(expectedUrl, actualUrl);

}

@Test

public void loginFailedWrongUn() {

driver.findElement(By.id("username")).sendKeys("tom");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")).click();

String actualUrl = "http://the-internet.herokuapp.com/login";

String expectedUrl = driver.getCurrentUrl();

Assert.assertEquals(expectedUrl, actualUrl);



}
@Test

public void loginFailedWrongPw() {

driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecre");

driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")).click();

String actualUrl = "http://the-internet.herokuapp.com/login";

String expectedUrl = driver.getCurrentUrl();

Assert.assertEquals(expectedUrl, actualUrl);



}

@Test

public void logOut() throws InterruptedException {

driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]")).click();

Thread.sleep(5000);
driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).click();

}

@AfterTest

public void tearDown() {

driver.quit();
driver.close();

}

}