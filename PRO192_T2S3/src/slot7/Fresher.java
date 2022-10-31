/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot7;

import slot6.*;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fresher extends Candidate {

    private int yearOfExperience;
    private String skill;
    private String graduationDate;
    private String graduationRank;
    private String Edudcation;

    public Fresher(int yearOfExperience, String skill, String graduationDate, String graduationRank, String Edudcation, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.skill = skill;
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.Edudcation = Edudcation;
    }

   

    void createFresher() {
        Scanner sc = new Scanner(System.in);
        this.createCandidate();

        System.out.print("Input year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Input skill: ");
        skill = sc.nextLine();

        System.out.print("Input graduation date: ");
        graduationDate = sc.nextLine();

        System.out.print("Input graduation rank: ");
        graduationRank = sc.nextLine();

        System.out.print("Input Education: ");
        Edudcation = sc.nextLine();

    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
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

    public String getEdudcation() {
        return Edudcation;
    }

    public void setEdudcation(String Edudcation) {
        this.Edudcation = Edudcation;
    }

    void updateFresher() {
        Scanner sc = new Scanner(System.in);
        this.updateCandidate();
        System.out.print("Update year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Update skill: ");
        skill = sc.nextLine();

        System.out.print("Update graduation date: ");
        graduationDate = sc.nextLine();

        System.out.print("Update graduation rank: ");
        graduationRank = sc.nextLine();

        System.out.print("Update Education: ");
        Edudcation = sc.nextLine();
    }

    void displayFresher() {
        System.out.println("Fresher information");
        System.out.printf("%-8s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10d|%-10s|%-10s|%-10s|%-10s|\n",
                id, firstName, lastName, birthDate, address, phone, email, type, yearOfExperience, skill, graduationDate, graduationRank, Edudcation);
    }

    void searchFresher() {

    }
}
