package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://localhost:4040/opencart/upload/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void teardown() {
       // driver.quit();
    }
        // Fonction de génération
    public String randomString() {
        String generatedAlphanumericToString = RandomStringUtils.randomAlphabetic(5);
        return generatedAlphanumericToString;
    }

    public String randomNumber() {
        String generatedNumericToString = RandomStringUtils.randomNumeric(10);
        return generatedNumericToString;
    }

    public String randomAlphaNumeric() {
        String str = RandomStringUtils.randomAlphabetic(4);
        String num= RandomStringUtils.randomNumeric(4);
        return (str +"@"+ num);
    }
}
