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
        loanAmount_tb = By.className("sc-eNQAEJ iNqEDq");
        loanPurpose_dd = By.cssSelector("option");
        checkRate_btn = By.cssSelector(".sc-brqgnP");
    }

    public void checkRate(String loanAmount, String loanPurpose) {
        this.getLoanAmountTextBox().sendKeys(loanAmount);
        this.getLoanPurposeDropDown().selectByValue(loanPurpose);
        this.getCheckRateButton().click();
    }

    private WebElement getLoanAmountTextBox() {
        return this.driver.findElement(loanAmount_tb);
    }

    private Select getLoanPurposeDropDown() {
        return new Select(this.driver.findElement(loanPurpose_dd));
    }

    private WebElement getCheckRateButton() {
        return this.driver.findElement(checkRate_btn);
    }

}