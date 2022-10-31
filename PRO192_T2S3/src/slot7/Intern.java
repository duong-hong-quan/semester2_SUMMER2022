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
public class Intern extends Candidate {

    private int yearOfExperience;
    private String skill;
    private String major;
    private int semester;
    private String universityName;

    public Intern(int yearOfExperience, String skill, String major, int semester, String universityName, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.skill = skill;
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

  
    

    void createIntern() {
        Scanner sc = new Scanner(System.in);
        this.createCandidate();

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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    void updateIntern() {
        Scanner sc = new Scanner(System.in);
        this.updateCandidate();

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
                id, firstName, lastName, birthDate, address, phone, email, type, yearOfExperience, skill, major, semester, universityName);
    }
}
