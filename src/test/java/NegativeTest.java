import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NegativeTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/wina/appium-desktop/node_modules/appium-chromedriver/chromedriver/linux/chromedriver_64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.get("http://automationpractice.com/index.php");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("center_column")));
        driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Orange')]")).click();
        Thread.sleep(5000);
        driver.close();
    }
}
