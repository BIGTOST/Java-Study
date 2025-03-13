package java_object_oriented_programming.challenges.reduce_complexity_with_polymorphism;

public class Contacts {
    private String name;
    private PhoneNumber phone;
    private String email;

    public Contacts(){

    }

    public Contacts(String name,PhoneNumber phone) {
        this.phone = phone;
        this.name = name;
    }

    public Contacts(String name, PhoneNumber phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contacts{" +
                " name='" + name + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(PhoneNumber phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
