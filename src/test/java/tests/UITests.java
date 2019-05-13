package tests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.OfferPage;
import pages.PersonalInformationPage;
import pages.StartingPage;
import support.LoanApplication;

public class UITests {
    private WebDriver driver;
    private LoanApplication loanApplication = new LoanApplication();
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        StartingPage startingPage;
        PersonalInformationPage personalInformationPage;
        OfferPage offerPage;
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.credify.tech/phone/nonDMFunnel");
        driver.manage().window().maximize();
        startingPage = new StartingPage(driver);
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(startingPage.getLoanAumountBy()));
        startingPage.checkRate(this.loanApplication.getLoanAmount(), this.loanApplication.getLoanPurpose());
        personalInformationPage = new PersonalInformationPage(driver);
        personalInformationPage.enterPersonalInfoAndCheckRate(
                        this.loanApplication.getBorrower().getFirtName(),
                        this.loanApplication.getBorrower().getLastName(),
                        this.loanApplication.getBorrower().getHomeAddress(),
                        this.loanApplication.getBorrower().getCity(), 
                        this.loanApplication.getBorrower().getState(),
                        this.loanApplication.getBorrower().getZipCode(), 
                        this.loanApplication.getBorrower().getDateOfBirth(),
                        this.loanApplication.getBorrower().getAnualIncome(), 
                        this.loanApplication.getBorrower().getAdditionalIncome(),
                        this.loanApplication.getBorrower().getEmail(), 
                        this.loanApplication.getLoanApplicationPassword());
        offerPage = new OfferPage(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(offerPage.getLoanAmountBy()));
        this.loanApplication.setLoanAmountResult(offerPage.getLoanAmountValue());
        this.loanApplication.setLoanMonthlyPayment(offerPage.getLoanMonthlyPaymentValue());
        this.loanApplication.setLoanTerm(offerPage.getLoanTermValue());
        this.loanApplication.setInterestRate(offerPage.getInterestRateValue());
        this.loanApplication.setAnualPercentageRate(offerPage.getAPRValue());
        Actions action = new Actions(driver);
        action.click(offerPage.getMenu()).perform();
        action.click(offerPage.getLogOut()).perform();
    }

    @Test
    public void pruebaUno() {
        LoginPage loginPageTest;
        OfferPage offerPageTest;
        driver.get("https://www.credify.tech/portal/login");
        loginPageTest = new LoginPage(this.driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(loginPageTest.emailAddressTextBoxBy()));
        loginPageTest.setEmailAddress(this.loanApplication.getBorrower().getEmail());
        loginPageTest.setPassword(this.loanApplication.getLoanApplicationPassword());
        loginPageTest.clickSignInButton();
        offerPageTest = new OfferPage(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(offerPageTest.getLoanAmountBy()));
        assertTrue(driver.getCurrentUrl().contains("/offer-page"));
        assertTrue(offerPageTest.getLoanAmountValue().equals(this.loanApplication.getLoanAmountResult()));
        assertTrue(offerPageTest.getLoanTermValue().equals(this.loanApplication.getLoanTerm()));
        assertTrue(offerPageTest.getAPRValue().equals(this.loanApplication.getAnualPercentageRate()));
        assertTrue(offerPageTest.getLoanMonthlyPaymentValue().equals(this.loanApplication.getLoanMonthlyPayment()));
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}