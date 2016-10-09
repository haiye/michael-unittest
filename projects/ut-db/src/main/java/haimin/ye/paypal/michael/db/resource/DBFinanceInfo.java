package haimin.ye.paypal.michael.db.resource;

public class DBFinanceInfo {

    private long balance;
    private String currenyCode;
    
    private DBBankInfo bankinfo;
    private DBCreditCardInfo creditCardInfo;
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public String getCurrenyCode() {
        return currenyCode;
    }
    public void setCurrenyCode(String currenyCode) {
        this.currenyCode = currenyCode;
    }
    public DBBankInfo getBankinfo() {
        return bankinfo;
    }
    public void setBankinfo(DBBankInfo bankinfo) {
        this.bankinfo = bankinfo;
    }
    public DBCreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }
    public void setCreditCardInfo(DBCreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
    @Override
    public String toString() {
        return "DBFinanceInfo [balance=" + balance + ", currenyCode=" + currenyCode + ", bankinfo=" + bankinfo
                + ", creditCardInfo=" + creditCardInfo + "]";
    }
    
}
