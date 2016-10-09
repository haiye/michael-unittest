package haimin.ye.paypal.michael.db.resource;

import java.math.BigInteger;

public class DBBankInfo {

    String bankName;
    BigInteger bankNum;
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public BigInteger getBankNum() {
        return bankNum;
    }
    public void setBankNum(BigInteger bankNum) {
        this.bankNum = bankNum;
    }
    @Override
    public String toString() {
        return "BankInfo [bankName=" + bankName + ", bankNum=" + bankNum + "]";
    }
    
    
}
