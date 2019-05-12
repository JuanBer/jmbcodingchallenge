package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.StartingPage;

public class UITests {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // DesiredCapabilities caps = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.credify.tech/phone/nonDMFunnel");
        driver.manage().window().maximize();
    }

    @Test
    public void pruebaUno() {
        StartingPage startingPage = new StartingPage(driver);
        startingPage.checkRate("2000", "Other");
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}