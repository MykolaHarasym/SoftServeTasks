package Task3;

public class OfficeInfo {
    private String officeAddress;
    private String officeAreaCode;
    private String officePhoneNamber;

    public OfficeInfo(String officeAddress, String officeAreaCode, String officePhoneNamber) {
        this.officeAddress = officeAddress;
        this.officeAreaCode = officeAreaCode;
        this.officePhoneNamber = officePhoneNamber;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficePhoneNamber() {
        return officePhoneNamber;
    }

    public void setOfficePhoneNamber(String officePhoneNamber) {
        this.officePhoneNamber = officePhoneNamber;
    }

    @Override
    public String toString() {
        return "OfficeInfo{" +
                "officeAddress='" + officeAddress + '\'' +
                ", officeAreaCode='" + officeAreaCode + '\'' +
                ", officePhoneNamber='" + officePhoneNamber + '\'' +
                '}';
    }
}
