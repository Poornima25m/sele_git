import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.SQLOutput;

public class leafGroundWebPage {

    @BeforeTest
    //Set chrome browser
    public static void defineBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vpvis\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

    }

    @Test
    public void openLetCode(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in");
        driver.findElement(By.id("testing")).click();
        browserWait(1000);
        driver.quit();
    }

    @Test
    public void buttonElement(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.findElement(By.id("fullName")).sendKeys("Poornima Murugan");
        driver.findElement(By.id("join")).sendKeys(" person", Keys.TAB);
        System.out.println(driver.findElement(By.id("getMe")).getAttribute("value"));
        driver.findElement(By.id("clearMe")).clear();
        System.out.println(driver.findElement(By.id("noEdit")).isEnabled());
        System.out.println(driver.findElement(By.id("dontwrite")).getAttribute("readonly"));
        browserWait(2000);
        driver.quit();
    }

    private static void browserWait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
