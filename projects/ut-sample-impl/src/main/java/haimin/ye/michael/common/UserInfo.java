package haimin.ye.michael.common;

public class UserInfo {

    private String firstName;
    private String lastName;

    private AddressInfo addressInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    @Override
    public String toString() {
        return "UserInfo [firstName=" + firstName + ", lastName=" + lastName + ", addressInfo=" + addressInfo + "]";
    }

}
