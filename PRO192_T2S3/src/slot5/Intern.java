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
public class Intern {

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
    String major;
    int semester;
    String universityName;

    void createIntern() {
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

        System.out.print("Input graduation date: ");
        major = sc.nextLine();

        System.out.print("Input graduation rank: ");
        semester = Integer.parseInt(sc.nextLine());

        System.out.print("Input Education: ");
        universityName = sc.nextLine();

    }
     void updateIntern() {
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

        System.out.print("Update graduation date: ");
        major = sc.nextLine();

        System.out.print("Update graduation rank: ");
        semester = Integer.parseInt(sc.nextLine());

        System.out.print("Update Education: ");
        universityName = sc.nextLine();
          
    }
     
    public void displayIntern() {
        System.out.println("Intern information");
        System.out.printf("%-8ss|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10d|%-10s|%-10s|%-10d|%-10s",
               id, firstName, lastName,birthDate, address, phone, email, type, yearOfExperience, skill, major, semester, universityName );
    }
}
