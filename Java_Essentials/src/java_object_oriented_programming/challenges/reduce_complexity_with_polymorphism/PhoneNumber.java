package java_object_oriented_programming.challenges.reduce_complexity_with_polymorphism;

public class PhoneNumber
{
    private String countryCode;
    private String phoneNumber;



    public PhoneNumber(String phoneNumber) {
        if(phoneNumber.length()>10) {
            this.countryCode = phoneNumber.substring(0, phoneNumber.length()-10);
            this.phoneNumber = phoneNumber.substring(phoneNumber.length()-10);
        }
        else {
            this.countryCode = "1";
            this.phoneNumber = phoneNumber;
        }
    }

    public PhoneNumber(String countryCode, String phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode='" + countryCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
