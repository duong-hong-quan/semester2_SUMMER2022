/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Experience {

    String id;
    String firstName;
    String lastName;
    String birthDate;
    String address;
    String phone;
    String email;
    String type;
    int yearOfExperience;
    String skill;

    void createExperience() {
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

        System.out.print("Input year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Input skill: ");
        skill = sc.nextLine();

    }

    void updateExperience() {
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

        System.out.print("Update year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Update skill: ");
        skill = sc.nextLine();
    }

    void displayExperience() {
        System.out.println("Experience information");
        System.out.printf("%-8ss|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10d|%-10s|\n",
                                id, firstName, lastName, birthDate, address, phone, email,type, yearOfExperience, skill);
       
    }
    void deleteExperience() {
        
    }
}
