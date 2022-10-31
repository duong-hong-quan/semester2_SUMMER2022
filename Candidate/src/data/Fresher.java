/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String graduatedUniversity;

    public Fresher(String graduationDate, String graduationRank, String graduatedUniversity, int id, String firstName, String lastName, String birthDate, String address, String phone, String email, String candidateType) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.graduatedUniversity = graduatedUniversity;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getGraduatedUniversity() {
        return graduatedUniversity;
    }

    public void setGraduatedUniversity(String graduatedUniversity) {
        this.graduatedUniversity = graduatedUniversity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

//   public void displayFresher() {
//        System.out.println("Fresher information");
//        System.out.printf("%-8d|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10d|%-10s|%-10s|%-10s|%-10s|\n",
//                id, firstName, lastName, birthDate, address, phone, email, candidateType, graduationDate, graduationRank, graduatedUniversity);
//    }

    @Override
    public String toString() {
        return "Fresher{" + "graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", graduatedUniversity=" + graduatedUniversity + '}';
    }
    
    public void showInformation() {
        System.out.printf("|%-8d|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|",
                                id,firstName,lastName,birthDate,address,phone,email,candidateType,graduationDate,graduationRank,graduatedUniversity);
    }

}
 
  