package haimin.ye.michael.common;

public class FinanceInfo {

    private double balance;
    private String currenyCode;

    private BankInfo bankinfo;
    private CreditCardInfo creditCardInfo;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrenyCode() {
        return currenyCode;
    }

    public void setCurrenyCode(String currenyCode) {
        this.currenyCode = currenyCode;
    }

    public BankInfo getBankinfo() {
        return bankinfo;
    }

    public void setBankinfo(BankInfo bankinfo) {
        this.bankinfo = bankinfo;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    @Override
    public String toString() {
        return "FinanceInfo [balance=" + balance + ", currenyCode=" + currenyCode + ", bankinfo=" + bankinfo
                + ", creditCardInfo=" + creditCardInfo + "]";
    }

}
