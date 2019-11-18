package HomeWork12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

    private WebDriver driver;

    @BeforeTest
    public void initiateDriver() {
        String SYSTEM_CHROME_DRIVER_VARIABLE = "webdriver.chrome.driver";
        String PASS_TO_DRIVER_NAVIGATION = "C:\\Users\\Njuta\\Downloads\\chromedriver_win32\\chromedriver.exe";
        System.setProperty(SYSTEM_CHROME_DRIVER_VARIABLE, PASS_TO_DRIVER_NAVIGATION);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void firstGroupFirstTest() {
        driver.navigate().to("https://disgustingmen.com/art/shintaro-kago-art/");
        Assert.assertTrue(true);
    }

    @Test
    public void firstCroupSecondTest() {
        driver.navigate().to("https://habr.com/ru/");
        Assert.assertTrue(true);

    }

    @Test
    public void firstGroupThirdTest() {
        driver.navigate().to("http://www.quizful.net/post/java-reflection-api");
        Assert.assertTrue(true);
    }

    @Test

    public void firstGroupFourthTest() {
        driver.navigate().to("https://www.youtube.com/");
        Assert.assertTrue(true);
    }
}
