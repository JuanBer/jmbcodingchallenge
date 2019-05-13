package support;

public class LoanApplication {
    private BorrowerInformation borrower;
    private String loanAmount;
    private String loanPurpose;
    private String loanApplicationPassword;
    private String loanAmountResult;
    private String loanMonthlyPayment;
    private String loanTerm;
    private String interestRate;
    private String anualPercentageRate;

    public LoanApplication() {
        this.borrower = new BorrowerInformation();
        this.loanAmount = "2000";
        this.loanPurpose = "OTHER";
        this.loanApplicationPassword = "Test2468";
    }


    public LoanApplication(BorrowerInformation borrower, String loanAmount, String loanPurpose, String loanApplicationPassword, String loanAmountResult, String loanMonthlyPayment, String loanTerm, String interestRate, String anualPercentageRate) {
        this.borrower = borrower;
        this.loanAmount = loanAmount;
        this.loanPurpose = loanPurpose;
        this.loanApplicationPassword = loanApplicationPassword;
        this.loanAmountResult = loanAmountResult;
        this.loanMonthlyPayment = loanMonthlyPayment;
        this.loanTerm = loanTerm;
        this.interestRate = interestRate;
        this.anualPercentageRate = anualPercentageRate;
    }

    public BorrowerInformation getBorrower() {
        return this.borrower;
    }

    public void setBorrower(BorrowerInformation borrower) {
        this.borrower = borrower;
    }

    public String getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanPurpose() {
        return this.loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public String getLoanApplicationPassword() {
        return this.loanApplicationPassword;
    }

    public void setLoanApplicationPassword(String loanApplicationPassword) {
        this.loanApplicationPassword = loanApplicationPassword;
    }

    public String getLoanAmountResult() {
        return this.loanAmountResult;
    }

    public void setLoanAmountResult(String loanAmountResult) {
        this.loanAmountResult = loanAmountResult;
    }

    public String getLoanMonthlyPayment() {
        return this.loanMonthlyPayment;
    }

    public void setLoanMonthlyPayment(String loanMonthlyPayment) {
        this.loanMonthlyPayment = loanMonthlyPayment;
    }

    public String getLoanTerm() {
        return this.loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getAnualPercentageRate() {
        return this.anualPercentageRate;
    }

    public void setAnualPercentageRate(String anualPercentageRate) {
        this.anualPercentageRate = anualPercentageRate;
    }

    public LoanApplication borrower(BorrowerInformation borrower) {
        this.borrower = borrower;
        return this;
    }

    public LoanApplication loanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    public LoanApplication loanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
        return this;
    }

    public LoanApplication loanApplicationPassword(String loanApplicationPassword) {
        this.loanApplicationPassword = loanApplicationPassword;
        return this;
    }

    public LoanApplication loanAmountResult(String loanAmountResult) {
        this.loanAmountResult = loanAmountResult;
        return this;
    }

    public LoanApplication loanMonthlyPayment(String loanMonthlyPayment) {
        this.loanMonthlyPayment = loanMonthlyPayment;
        return this;
    }

    public LoanApplication loanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }

    public LoanApplication interestRate(String interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public LoanApplication anualPercentageRate(String anualPercentageRate) {
        this.anualPercentageRate = anualPercentageRate;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " borrower='" + getBorrower() + "'" +
            ", loanAmount='" + getLoanAmount() + "'" +
            ", loanPurpose='" + getLoanPurpose() + "'" +
            ", loanApplicationPassword='" + getLoanApplicationPassword() + "'" +
            ", loanAmountResult='" + getLoanAmountResult() + "'" +
            ", loanMonthlyPayment='" + getLoanMonthlyPayment() + "'" +
            ", loanTerm='" + getLoanTerm() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            ", anualPercentageRate='" + getAnualPercentageRate() + "'" +
            "}";
    }
   
    
}