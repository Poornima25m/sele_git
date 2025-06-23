import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

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

    private static void browserWait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
