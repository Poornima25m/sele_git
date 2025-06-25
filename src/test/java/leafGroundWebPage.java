import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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

    @Test
    public void navigationCheck(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/button");
        driver.findElement(By.id("testing")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.youtube.com/watch?v=5i7GzxisYrg&list=PLLS0D9-W-1dkcN9ZFFWTcIAawh6kZwahS&index=3");
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
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
