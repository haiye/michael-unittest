package haimin.ye.paypal.michael.rest.client.resource;



public class CardAccount {
    private String id;
    private String nickName;
    private String cardNumberEncrypted;
    private String cardNumberHmac;
    private String lastNCharsCardNumber;
    private String bankIdentificationNumberHmac;
    private Integer bankIdentificationNumberLength;
    
    private String addressId;
    private String currencyCode;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getCardNumberEncrypted() {
        return cardNumberEncrypted;
    }
    public void setCardNumberEncrypted(String cardNumberEncrypted) {
        this.cardNumberEncrypted = cardNumberEncrypted;
    }
    public String getCardNumberHmac() {
        return cardNumberHmac;
    }
    public void setCardNumberHmac(String cardNumberHmac) {
        this.cardNumberHmac = cardNumberHmac;
    }
    public String getLastNCharsCardNumber() {
        return lastNCharsCardNumber;
    }
    public void setLastNCharsCardNumber(String lastNCharsCardNumber) {
        this.lastNCharsCardNumber = lastNCharsCardNumber;
    }
    public String getBankIdentificationNumberHmac() {
        return bankIdentificationNumberHmac;
    }
    public void setBankIdentificationNumberHmac(String bankIdentificationNumberHmac) {
        this.bankIdentificationNumberHmac = bankIdentificationNumberHmac;
    }
    public Integer getBankIdentificationNumberLength() {
        return bankIdentificationNumberLength;
    }
    public void setBankIdentificationNumberLength(Integer bankIdentificationNumberLength) {
        this.bankIdentificationNumberLength = bankIdentificationNumberLength;
    }
    public String getAddressId() {
        return addressId;
    }
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    @Override
    public String toString() {
        return "CardAccount [id=" + id + ", nickName=" + nickName + ", cardNumberEncrypted=" + cardNumberEncrypted
                + ", cardNumberHmac=" + cardNumberHmac + ", lastNCharsCardNumber=" + lastNCharsCardNumber
                + ", bankIdentificationNumberHmac=" + bankIdentificationNumberHmac
                + ", bankIdentificationNumberLength=" + bankIdentificationNumberLength + ", addressId=" + addressId
                + ", currencyCode=" + currencyCode + "]";
    }


}
