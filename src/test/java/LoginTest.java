import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;


public class LoginTest {
        public static void main(String[] args) throws InterruptedException{
            System.setProperty("webdriver.chrome.driver", "/home/wina/appium-desktop/node_modules/appium-chromedriver/chromedriver/linux/chromedriver_64");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, 10);

            driver.get("http://automationpractice.com/index.php");
            wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Faded Short Sleeve T-shirts")));
            driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
            driver.findElement(By.name("Submit")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("layer_cart")).isDisplayed();
            driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cart_product")));
            driver.findElement(By.linkText("Proceed to checkout")).click();
            driver.findElement(By.name("email_create")).sendKeys("llkmjkmpo@gmail.com");
            driver.findElement(By.name("SubmitCreate")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("uniform-id_gender2")));
            driver.findElement(By.id("uniform-id_gender2")).click();
            driver.findElement(By.id("customer_firstname")).sendKeys("wina");
            driver.findElement(By.id("customer_lastname")).sendKeys("hariningtyas");
            driver.findElement(By.id("passwd")).sendKeys("wwwww");
            Select day = new Select(driver.findElement(By.id("days")));
            day.selectByValue("1");
            Select month = new Select(driver.findElement(By.id("months")));
            month.selectByValue("1");
            Select years = new Select(driver.findElement(By.id("years")));
            years.selectByValue("1995");
            driver.findElement(By.id("company")).sendKeys("BL");
            driver.findElement(By.id("address1")).sendKeys("jakarta");
            driver.findElement(By.id("city")).sendKeys("jakarta");
            Select state = new Select(driver.findElement(By.id("id_state")));
            state.selectByValue("1");
            driver.findElement(By.id("postcode")).sendKeys("17510");
            driver.findElement(By.id("phone_mobile")).sendKeys("082210346652");
            driver.findElement(By.id("submitAccount")).click();
            driver.findElement(By.name("processAddress")).click();
            driver.findElement(By.id("uniform-cgv")).click();
            driver.findElement(By.name("processCarrier")).click();
            driver.findElement(By.className("bankwire")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
            //driver.findElement(By.cssSelector("//strong[contains(text(),'Your order on My Store is complete.')]"));
            Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]")).isDisplayed());
            driver.close();
        }

}
