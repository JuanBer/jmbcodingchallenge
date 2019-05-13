package pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPage {
    private WebDriver driver;
    private By loanAmount;
    private By monthlyPayment;
    private By loanTerm;
    private By interestRate;
    private By annualPercentageRate;
    private By menu;
    private By logOut;
    final private String regEx = "\\d+(\\.\\d{1,2})?";
    final private Pattern pattern = Pattern.compile(regEx);

    public OfferPage(WebDriver driver) {
        this.driver = driver;
        loanAmount = By.cssSelector("[data-auto='userLoanAmount']");
        monthlyPayment = By.cssSelector("[data-auto='defaultMonthlyPayment']");
        loanTerm = By.cssSelector("[data-auto='defaultLoanTerm']");
        interestRate = By.cssSelector("[data-auto='defaultLoanInterestRate']");
        annualPercentageRate = By.cssSelector("[data-auto='defaultMoreInfoAPR'] > div");
        menu = By.className("header-nav__toggle");
        logOut = By.cssSelector(".header-nav-menu__item:nth-of-type(2) .header-nav-menu__link");
    }

    public WebElement getLoanAmount() {
        return this.driver.findElement(loanAmount);
    }

    public WebElement getMonthlyPayment() {
        return this.driver.findElement(monthlyPayment);
    }

    public WebElement getLoanTerm() {
        return this.driver.findElement(loanTerm);
    }

    public WebElement getInterestRate() {
        return this.driver.findElement(interestRate);
    }

    public WebElement getAPR() {
        return this.driver.findElement(annualPercentageRate);
    }

    public WebElement getLogOut() {
        return this.driver.findElement(logOut);
    }

    public WebElement getMenu() {
        return this.driver.findElement(menu);
    }

    public void loggingOut() {
        this.getMenu().click();
        this.getLogOut().click();
    }

    public String getLoanAmountValue() {
        return this.getLoanAmount().getText();
    }

    public String getLoanMonthlyPaymentValue() {
        String aux = this.getMonthlyPayment().getText();
        Matcher matcher = pattern.matcher(aux);
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "Not found";
        }
    }

    public String getInterestRateValue() {
        String aux = this.getInterestRate().getText();
        Matcher matcher = pattern.matcher(aux);
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "Not found";
        }
    }

    public String getLoanTermValue() {
        String aux = this.getLoanTerm().getText();
        Matcher matcher = pattern.matcher(aux);
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "Not found";
        }
    }

    public String getAPRValue() {
        String aux = this.getAPR().getText();
        Matcher matcher = pattern.matcher(aux);
        if (matcher.find()) {
            return matcher.group(0);
        } else {
            return "Not found";
        }
    }

    public By getLoanAmountBy(){
        return this.loanAmount;
    }

}