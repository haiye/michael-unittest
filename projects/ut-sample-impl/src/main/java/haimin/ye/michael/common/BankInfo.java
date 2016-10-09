package haimin.ye.michael.common;

public class BankInfo {

    String bankName;
    long bankNum;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getBankNum() {
        return bankNum;
    }

    public void setBankNum(long bankNum) {
        this.bankNum = bankNum;
    }

    @Override
    public String toString() {
        return "BankInfo [bankName=" + bankName + ", bankNum=" + bankNum + "]";
    }

}
