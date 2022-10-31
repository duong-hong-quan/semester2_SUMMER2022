/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package candidate;

import data.Fresher;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Stage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      createFresher();
    }

    public static void createFresher() {
        int id;
        String firstName;
        String lastName;
        String birthDate;
        String address;
        String phone;
        String email;
        String candidateType;
        String graduationDate;
        String graduationRank;
        String graduatedUniversity;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input id: ");
        id = Integer.parseInt(sc.nextLine());

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

        System.out.print("Input graduation date: ");
        graduationDate = sc.nextLine();

        System.out.print("Input graduation rank: ");
        graduationRank = sc.nextLine();

        System.out.print("Input Education: ");
        graduatedUniversity = sc.nextLine();

        Fresher x = new Fresher(graduationDate, graduationRank, graduatedUniversity, 0, firstName, lastName, birthDate, address, phone, email, candidateType);
        x.showInformation();
    
        
    
    }

}
