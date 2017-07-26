package arraylistchallenge;


public class Contact {

    protected String name;
    protected String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Name: " + this.name + ", Phone Number: " + this.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
