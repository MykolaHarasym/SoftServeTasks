package Task3;

public class Persone {
    private String firstName;
    private String sureName;
    private String mobilePhoneNamber;
    private String mobileAreaCode;
    private HomeInfo hm;
    private OfficeInfo of;

    public Persone(String firstName, String sureName, String mobilePhoneNamber, String mobileAreaCode, HomeInfo hm, OfficeInfo of) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.mobilePhoneNamber = mobilePhoneNamber;
        this.mobileAreaCode = mobileAreaCode;
        this.hm = hm;
        this.of = of;
    }

    public String getMobilePhoneNamber() {
        return mobilePhoneNamber;
    }

    public void setMobilePhoneNamber(String mobilePhoneNamber) {
        this.mobilePhoneNamber = mobilePhoneNamber;
    }

    public String getMobileAreaCode() {
        return mobileAreaCode;
    }

    public void setMobileAreaCode(String mobileAreaCode) {
        this.mobileAreaCode = mobileAreaCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

}
