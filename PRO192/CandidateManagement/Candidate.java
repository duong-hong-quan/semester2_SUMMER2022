/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;

import util.Utils;

/**
 *
 * @author hd
 */
public class Candidate {
    private String id;
    private String firstName;
    private  String lastName;
    private  String birthDate;
    private String address;
    private String phone;
    private String email;
    private String type;

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

    public void createCandidate(){
        id= Utils.inputValue("input ID: ");
        firstName= Utils.inputValue("input First Name: ");
        lastName= Utils.inputValue("input Last Name: ");
        birthDate= Utils.inputValue("input BirthDay: ");
        address= Utils.inputValue("input Address: ");
        phone= Utils.inputValue("input Phone: ");
        email= Utils.inputValue("input Email: ");
        type= Utils.inputValue("input Type: ");
    }
    public void updateCandidate(){
        id= Utils.updateValue("update ID: ",this.id);
        firstName= Utils.updateValue("update First Name: ",firstName);
        lastName= Utils.updateValue("update Last Name: ",lastName);
        birthDate= Utils.updateValue("update BirthDay: ",birthDate);
        address= Utils.updateValue("update Address: ", address);
        phone= Utils.updateValue("update Phone: ",phone);
        email= Utils.updateValue("update Email: ",email);
        type= Utils.updateValue("update Type: ",type);
        
    }
    public void displayCandidate(){
        System.out.println(" {"+ "id=" + id + ", firstName=" + firstName + 
                ", lastName=" + lastName + ", birthDate=" + birthDate + 
                ", address=" + address + ", phone=" + phone + ", email=" + 
                email + ", type=" + type);
    }
    public void deleteExperience(){
        
    }
    public void searchExperience(){
        
    }
    
}
