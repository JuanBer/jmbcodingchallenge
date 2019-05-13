package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By emailAddress_tb;
    private By password_tb;
    private By signIn_btn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.emailAddress_tb = By.name("username");
        this.password_tb = By.name("password");
        this.signIn_btn = By.cssSelector("button");
    }

    public WebElement getEmailAddressTextBox() {
        return this.driver.findElement(emailAddress_tb);
    }

    public WebElement getPasswordTextBox() {
        return this.driver.findElement(password_tb);
    }

    public WebElement getSignInButton() {
        return this.driver.findElement(signIn_btn);
    }

    public void setEmailAddress(String email) {
        this.getEmailAddressTextBox().sendKeys(email);
    }

    public void setPassword(String password) {
        this.getPasswordTextBox().sendKeys(password);
    }

    public void clickSignInButton() {
        this.getSignInButton().click();
    }

    public By emailAddressTextBoxBy(){
        return this.emailAddress_tb;
    }

}