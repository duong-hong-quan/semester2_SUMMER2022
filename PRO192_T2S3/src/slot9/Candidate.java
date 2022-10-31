/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot9;

import util.Utils;

/**
 *
 * @author Admin
 */
public class Candidate {

    String id;
    String firstName;
    String lastName;
    String birthDate;
    String address;
    String phone;
    String email;
    String type;

    public Candidate() {

    }

    public Candidate(String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void createCandidate() {
        System.out.println("Input profile");
        id = Utils.inputValue("input ID");
        firstName = Utils.inputValue("input first name");
        lastName = Utils.inputValue("input last name: ");
        birthDate = Utils.inputValue("input birth date: ");
        address = Utils.inputValue("input address: ");
        phone = Utils.inputValue("input phone: ");
        email = Utils.inputValue("input email: ");
        type = Utils.inputValue("input type: ");

    }

    void updateCandidate() {
        System.out.println("Update profile");
        id = Utils.updateValue("Input id", this.id);
        firstName = Utils.updateValue("Input first name: ", firstName);
        lastName = Utils.updateValue("Input last name: ", lastName);
        birthDate = Utils.updateValue("Input birth date: ", birthDate);
        address = Utils.updateValue("Input address : ", address);
        phone = Utils.updateValue("Input phone: ", phone);
        email = Utils.updateValue("Input email: ", email);
        type = Utils.updateValue("Input type: ", type);

    }

    public void displayCandidate() {
        System.out.println("" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email + ", type=" + type + "}");
    }

}
