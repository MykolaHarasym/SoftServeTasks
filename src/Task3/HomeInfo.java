package Task3;

public class HomeInfo {
    private String homeAddress;
    private String homeAreaCode;
    private String homePhoneNamber;

    public HomeInfo(String homeAddress, String homeAreaCode, String homePhoneNamber) {
        this.homeAddress = homeAddress;
        this.homeAreaCode = homeAreaCode;
        this.homePhoneNamber = homePhoneNamber;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomeAreaCode() {
        return homeAreaCode;
    }

    public void setHomeAreaCode(String homeAreaCode) {
        this.homeAreaCode = homeAreaCode;
    }

    public String getHomePhoneNamber() {
        return homePhoneNamber;
    }

    public void setHomePhoneNamber(String homePhoneNamber) {
        this.homePhoneNamber = homePhoneNamber;
    }

    @Override
    public String toString() {
        return "HomeInfo{" +
                "homeAddress='" + homeAddress + '\'' +
                ", homeAreaCode='" + homeAreaCode + '\'' +
                ", homePhoneNamber='" + homePhoneNamber + '\'' +
                '}';
    }
}
