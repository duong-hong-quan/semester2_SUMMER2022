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
public class Candidate {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String birthDate;
    protected String address;
    protected String phone;
    protected String email;
    protected String candidateType;

    public Candidate(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, String candidateType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }
     void createCandidate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextInt();

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
        candidateType = sc.nextLine();
    }

    void updateCandidate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update id: ");
        id = sc.nextInt();

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
        candidateType = sc.nextLine();
    }
    
}
