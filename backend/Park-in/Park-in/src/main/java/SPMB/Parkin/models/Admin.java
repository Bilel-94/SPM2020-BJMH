package SPMB.Parkin.models;

public class Admin {

    private String firstName;
    private String lastName;
    private String ssn;
    private String email;
    private String phone;


    /*-------Constructor------*/
    public Admin() {

    }

    /*------- ACCESSORY METHODS ---------*/
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

}
