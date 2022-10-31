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
public class Experience extends Candidate {

    private int yearOfExperience;
    private String skill;

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

    void createExperience() {
        Scanner sc = new Scanner(System.in);
        this.createCandidate();

        System.out.print("Input year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Input skill: ");
        skill = sc.nextLine();

    }

    void updateExperience() {
        Scanner sc = new Scanner(System.in);
        this.updateCandidate();

        System.out.print("Update year of experience: ");
        yearOfExperience = Integer.parseInt(sc.nextLine());

        System.out.print("Update skill: ");
        skill = sc.nextLine();
    }

    void displayExperience() {
        System.out.println("Experience information");
        System.out.printf("%-8ss|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10d|%-10s|\n",
                id, firstName, lastName, birthDate, address, phone, email, type, yearOfExperience, skill);

    }

    void deleteExperience() {

    }
}
