import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    @Given("Register")
    public void register() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kornel\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kixeja7360@mailnest.net");
        driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Adrian");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Testowy");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Abcd12345");
        //data
        new Select(driver.findElement(By.xpath("//select[@id='days']"))).selectByValue("1");
        new Select(driver.findElement(By.xpath("//select[@id='months']"))).selectByVisibleText("March ");
        new Select(driver.findElement(By.xpath("//select[@id='years']"))).selectByValue("1993");
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        driver.findElement(By.xpath("//input[@id='optin']")).click();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).clear();
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Adrianek");
        //driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Testowy");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("test");
        new Select(driver.findElement(By.xpath("//select[@id='id_state']"))).selectByVisibleText("Alaska");
        driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
        new Select(driver.findElement(By.xpath("//select[@id='id_country']"))).selectByVisibleText("United States");
        driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("123123123");
        driver.findElement(By.xpath("//span[normalize-space()='Register']")).click();

    }
}
