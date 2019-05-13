package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StartingPage {
    private WebDriver driver;
    private By loanAmount_tb;
    private By loanPurpose_dd;
    private By checkRate_btn;

    public StartingPage(WebDriver driver) {
        this.driver = driver;
        loanAmount_tb = By.name("desiredAmount");
        loanPurpose_dd = By.cssSelector("select.iHtznt");
        checkRate_btn = By.cssSelector("button");
    }

    public void checkRate(String loanAmount, String loanPurpose) {
        this.setLoanAmount(loanAmount);
        this.selectLoanPurpose(loanPurpose);
        this.checkRate();
    }

    public WebElement getLoanAmountTextBox() {
        return this.driver.findElement(loanAmount_tb);
    }

    public Select getLoanPurposeDropDown() {
        return new Select(this.driver.findElement(loanPurpose_dd));
    }

    public WebElement getCheckRateButton() {
        return this.driver.findElement(checkRate_btn);
    }

    public void setLoanAmount(String loanAmount) {
        this.getLoanAmountTextBox().sendKeys(loanAmount);
    }

    public void selectLoanPurpose(String loanPurpose) {
        this.getLoanPurposeDropDown().selectByValue(loanPurpose);
    }

    public void checkRate() {
        this.getCheckRateButton().click();
    }

    public By getLoanAumountBy(){
        return this.loanAmount_tb;
    }

}