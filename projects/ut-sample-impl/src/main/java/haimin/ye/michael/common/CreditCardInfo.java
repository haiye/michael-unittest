package haimin.ye.michael.common;

public class CreditCardInfo {

    private long creditCardNum;
    private String creditCardType; // VISA, CHECKING
    private String creditCardBankName;

    public long getCreditCardNum() {
        return creditCardNum;
    }

    public void setCreditCardNum(long creditCardNum) {
        this.creditCardNum = creditCardNum;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getCreditCardBankName() {
        return creditCardBankName;
    }

    public void setCreditCardBankName(String creditCardBankName) {
        this.creditCardBankName = creditCardBankName;
    }

    @Override
    public String toString() {
        return "CreditCardInfo [creditCardNum=" + creditCardNum + ", creditCardType=" + creditCardType
                + ", creditCardBankName=" + creditCardBankName + "]";
    }

}
