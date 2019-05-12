package support;

import java.util.Random;

public class BorrowerInformation {
    private String firtName;
    private String lastName;
    private String anualIncome;
    private String additionalIncome;
    private String homeAddress;
    private String city;
    private String state;
    private String zipCode;
    private String dateOfBirth;
    private String email;

    public BorrowerInformation(String firtName, String lastName, String anualIncome, String additionalIncome,
            String homeAddress, String city, String state, String zipCode, String dateOfBirth, String email) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.anualIncome = anualIncome;
        this.additionalIncome = additionalIncome;
        this.homeAddress = homeAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public BorrowerInformation() {
        Random randomNumber = new Random();
        Integer n = randomNumber.nextInt(1000);
        this.firtName = "John";
        this.lastName = "Doe";
        this.anualIncome = "100000";
        this.additionalIncome = "5000";
        this.homeAddress = "40 Boardman Place";
        this.city = "San Francisco";
        this.state = "CA";
        this.zipCode = "94103";
        this.dateOfBirth = "01051980";
        this.email = "juanbertoni".concat(n.toString()).concat("@upgrade-challenge.com");
    }

    public String getFirtName() {
        return this.firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAnualIncome() {
        return this.anualIncome;
    }

    public void setAnualIncome(String anualIncome) {
        this.anualIncome = anualIncome;
    }

    public String getAdditionalIncome() {
        return this.additionalIncome;
    }

    public void setAdditionalIncome(String additionalIncome) {
        this.additionalIncome = additionalIncome;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BorrowerInformation firtName(String firtName) {
        this.firtName = firtName;
        return this;
    }

    public BorrowerInformation lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BorrowerInformation anualIncome(String anualIncome) {
        this.anualIncome = anualIncome;
        return this;
    }

    public BorrowerInformation additionalIncome(String additionalIncome) {
        this.additionalIncome = additionalIncome;
        return this;
    }

    public BorrowerInformation homeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
        return this;
    }

    public BorrowerInformation city(String city) {
        this.city = city;
        return this;
    }

    public BorrowerInformation state(String state) {
        this.state = state;
        return this;
    }

    public BorrowerInformation zipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public BorrowerInformation dateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public BorrowerInformation email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " firtName='" + getFirtName() + "'" + ", lastName='" + getLastName() + "'" + ", anualIncome='"
                + getAnualIncome() + "'" + ", additionalIncome='" + getAdditionalIncome() + "'" + ", homeAddress='"
                + getHomeAddress() + "'" + ", city='" + getCity() + "'" + ", , state='" + getState() + "'"
                + ", zipCode='" + getZipCode() + "'" + ", dateOfBirth='" + getDateOfBirth() + "'" + ", email='"
                + getEmail() + "'" + "}";
    }

}