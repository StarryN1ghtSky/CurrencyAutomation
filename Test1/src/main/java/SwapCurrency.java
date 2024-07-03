import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwapCurrency {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\chromedriver.exe");

        // Specify Chrome binary location
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\A\\Desktop\\chrome-win64\\chrome.exe");

        // Create WebDriver instance with configured options
        WebDriver driver = new ChromeDriver(options);

        // Navigate to XE website
        driver.get("https://www.xe.com/");

        // Scenario 3: Perform currency swapping
        WebElement amountField = driver.findElement(By.id("amount"));
        amountField.sendKeys("100");

        // Locate "from" currency field using XPath
        WebElement fromCurrencyField = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[3]/div[2]/div/input"));
        fromCurrencyField.sendKeys("CAD");
        Thread.sleep(3000);
        fromCurrencyField.sendKeys(Keys.ENTER);

        // Locate "to" currency field using XPath
        WebElement toCurrencyField = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[8]/div[2]/div/input"));
        toCurrencyField.sendKeys("AUD");
        Thread.sleep(3000);
        toCurrencyField.sendKeys(Keys.ENTER);

        // Submit the conversion
        WebElement enterKey = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
        enterKey.click();
        Thread.sleep(3000);

        // Swap the currencies
        WebElement swapKey = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[6]/button"));
        swapKey.click();
    }
}
