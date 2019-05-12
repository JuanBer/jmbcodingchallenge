package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInformationPage {
    private WebDriver driver;
    private By firstName_tb;
    private By lastName_tb;
    private By homeAddress_tb;
    private By city_tb;
    private By state_tb;
    private By zipCode_tb;
    private By dateOfBirth_tb;
    private By individualIncome_tb;
    private By additionalAnualIncome_tb;
    private By emailAddress_tb;
    private By password_tb;
    private By agreement_cb;
    private By checkRate_btn;

    public PersonalInformationPage(WebDriver driver) {
        this.driver = driver;
        firstName_tb = By.name("borrowerFirstName");
        lastName_tb = By.name("borrowerLastName");
        homeAddress_tb = By.cssSelector("input.geosuggest__input");
        city_tb = By.name("borrowerCity");
        state_tb = By.name("borrowerState");
        zipCode_tb = By.name("borrowerZipCode");
        dateOfBirth_tb = By.name("borrowerDateOfBirth");
        individualIncome_tb = By.name("borrowerIncome");
        additionalAnualIncome_tb = By.name("borrowerAdditionalIncome");
        emailAddress_tb = By.name("username");
        password_tb = By.name("password");
        agreement_cb = By.cssSelector(".sc-kPVwWT");
        checkRate_btn = By.cssSelector("button");
    }

    public void enterPersonalInfoAndCheckRate(String firstName, String lastName, String homeAddress, String city,
            String state, String zipcode, String dateOfBirth, String anualIncome, String additionalIncome, String email,
            String password) {
        this.enterName(firstName);
        this.enterLastName(lastName);
        this.enterHomeAddress(homeAddress);
        this.enterCity(city);
        this.enterState(state);
        this.enterZipCode(zipcode);
        this.enterDateOfBirth(dateOfBirth);
        this.enterAnualIncome(anualIncome);
        this.enterAdditionalIncome(additionalIncome);
        this.enterEmailAddress(email);
        this.enterPassword(password);
        this.checkAgreementCheckbox();
        this.checkRate();

    }

    public WebElement getFirstNameTextBox() {
        return this.driver.findElement(firstName_tb);
    }

    public WebElement getLastNameTextBox() {
        return this.driver.findElement(lastName_tb);
    }

    public WebElement getHomeAddressTextBox() {
        return this.driver.findElement(homeAddress_tb);
    }

    public WebElement getCityTextBox() {
        return this.driver.findElement(city_tb);
    }

    public WebElement getStateTextBox() {
        return this.driver.findElement(state_tb);
    }

    public WebElement getZipCodeTextBox() {
        return this.driver.findElement(zipCode_tb);
    }

    public WebElement getDateOfBirthTextBox() {
        return this.driver.findElement(dateOfBirth_tb);
    }

    public WebElement getIndividualIncomeTextBox() {
        return this.driver.findElement(individualIncome_tb);
    }

    public WebElement getAdditionalAnualIncomeTextBox() {
        return this.driver.findElement(additionalAnualIncome_tb);
    }

    public WebElement getEmailAddressTextBox() {
        return this.driver.findElement(emailAddress_tb);
    }

    public WebElement getPasswordTextBox() {
        return this.driver.findElement(password_tb);
    }

    public WebElement getAgreementCheckbox() {
        return this.driver.findElement(agreement_cb);
    }

    public WebElement getCheckRateButton() {
        return this.driver.findElement(checkRate_btn);
    }

    public void enterName(String name) {
        this.getFirstNameTextBox().sendKeys(name);
    }

    public void enterLastName(String lastName) {
        this.getLastNameTextBox().sendKeys(lastName);
    }

    public void enterHomeAddress(String address) {
        this.getHomeAddressTextBox().sendKeys(address);
    }

    public void enterCity(String city) {
        this.getCityTextBox().sendKeys(city);
    }

    public void enterState(String state) {
        this.getStateTextBox().sendKeys(state);
    }

    public void enterZipCode(String zipcode) {
        this.getZipCodeTextBox().sendKeys(zipcode);
    }

    public void enterDateOfBirth(String dateOfBirth) {
        this.getDateOfBirthTextBox().sendKeys(dateOfBirth);
    }

    public void enterAnualIncome(String anualIncome) {
        this.getIndividualIncomeTextBox().sendKeys(anualIncome);
    }

    public void enterAdditionalIncome(String additionalIncome) {
        this.getAdditionalAnualIncomeTextBox().sendKeys(additionalIncome);
    }

    public void enterEmailAddress(String email) {
        this.getEmailAddressTextBox().sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement element = this.getPasswordTextBox();
        element.sendKeys(password);
        element.sendKeys(Keys.TAB);
    }

    public void checkAgreementCheckbox() {
        this.getAgreementCheckbox().click();
    }

    public void checkRate() {
        this.getCheckRateButton().click();
    }

}
