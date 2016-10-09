package haimin.ye.michael.common;

public class AddressInfo {

    private String city;
    private String countryCode;
    private String addrLine1;
    private String addrLine2;
    private long postCode;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public long getPostCode() {
        return postCode;
    }

    public void setPostCode(long postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "AddressInfo [city=" + city + ", countryCode=" + countryCode + ", addrLine1=" + addrLine1
                + ", addrLine2=" + addrLine2 + ", postCode=" + postCode + "]";
    }

}
