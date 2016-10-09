package haimin.ye.paypal.michael.db.resource;

import java.math.BigInteger;

public class DBAddressInfo {

    private String city;
    private String countryCode;
    private String addrLine1;
    private String addrLine2;
    private BigInteger postCode;

    private long actorIP;
    private String province;

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

    public BigInteger getPostCode() {
        return postCode;
    }

    public void setPostCode(BigInteger postCode) {
        this.postCode = postCode;
    }

    public long getActorIP() {
        return actorIP;
    }

    public void setActorIP(long actorIP) {
        this.actorIP = actorIP;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "DBAddressInfo [city=" + city + ", countryCode=" + countryCode + ", addrLine1=" + addrLine1
                + ", addrLine2=" + addrLine2 + ", postCode=" + postCode + ", actorIP=" + actorIP + ", province="
                + province + "]";
    }

}
