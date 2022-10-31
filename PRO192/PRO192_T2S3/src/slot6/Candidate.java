/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot6;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input first name: ");
        firstName = sc.nextLine();

        System.out.print("Input last name: ");
        lastName = sc.nextLine();

        System.out.print("Input birth date: ");
        birthDate = sc.nextLine();

        System.out.print("Input address: ");
        address = sc.nextLine();

        System.out.print("Input phone: ");
        phone = sc.nextLine();

        System.out.print("Input email: ");
        email = sc.nextLine();

        System.out.print("Input type: ");
        type = sc.nextLine();
    }

    void updateCandidate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update id: ");
        id = sc.nextLine();

        System.out.print("Update first name: ");
        firstName = sc.nextLine();

        System.out.print("Update last name: ");
        lastName = sc.nextLine();

        System.out.print("Update birth date: ");
        birthDate = sc.nextLine();

        System.out.print("Update address: ");
        address = sc.nextLine();

        System.out.print("Update phone: ");
        phone = sc.nextLine();

        System.out.print("Update email: ");
        email = sc.nextLine();

        System.out.print("Update type: ");
        type = sc.nextLine();
    }
}
