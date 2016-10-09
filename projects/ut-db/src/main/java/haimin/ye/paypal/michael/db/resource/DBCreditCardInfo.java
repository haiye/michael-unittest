package haimin.ye.paypal.michael.db.resource;

import java.math.BigInteger;

public class DBCreditCardInfo {

    private BigInteger creditCardNum;
    private String creditCardType; //VISA, CHECKING
    private String creditCardBankName;
    public BigInteger getCreditCardNum() {
        return creditCardNum;
    }
    public void setCreditCardNum(BigInteger creditCardNum) {
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
