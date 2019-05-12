package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.OfferPage;
import pages.PersonalInformationPage;
import pages.StartingPage;
import support.LoanApplication;

public class UITests {
    private WebDriver driver;
    private LoanApplication loanApplication;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.credify.tech/phone/nonDMFunnel");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void pruebaUno() {
        this.loanApplication = new LoanApplication();
        StartingPage startingPage = new StartingPage(driver);
        startingPage.checkRate(loanApplication.getLoanAmount(), loanApplication.getLoanPurpose());
        PersonalInformationPage personalInfoPage = new PersonalInformationPage(driver);
        personalInfoPage.enterPersonalInfoAndCheckRate(loanApplication.getBorrower().getFirtName(), 
                                                       loanApplication.getBorrower().getLastName(),
                                                       loanApplication.getBorrower().getHomeAddress(),
                                                       loanApplication.getBorrower().getCity(),
                                                       loanApplication.getBorrower().getState(),
                                                       loanApplication.getBorrower().getZipCode(),
                                                       loanApplication.getBorrower().getDateOfBirth(),
                                                       loanApplication.getBorrower().getAnualIncome(),
                                                       loanApplication.getBorrower().getAdditionalIncome(),
                                                       loanApplication.getBorrower().getEmail(),
                                                       loanApplication.getApplicationPassword());
        OfferPage offerPage = new OfferPage(driver);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        offerPage.loggingOut();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}