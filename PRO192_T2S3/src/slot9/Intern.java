/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot9;

import java.util.Scanner;
import util.Utils;

/**
 *
 * @author Admin
 */
public class Intern extends Candidate {

    private String major;
    private int semester;
    private String universityName;

    public Intern() {

    }

    public Intern(String major, int semester, String universityName, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
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

    void createIntern() {
        System.out.println("Intern information");
        Scanner sc = new Scanner(System.in);
        this.createCandidate();

        major = Utils.inputValue("Input major: ");
        semester = Utils.inputValue("Input semester", 1, 9);
        universityName = Utils.inputValue("Input University Name: ");

    }

    void updateIntern() {
        Scanner sc = new Scanner(System.in);
        this.updateCandidate();

        major = Utils.updateValue("Update major", major);
        semester = Utils.updateValue("Update semester", 1, 9, semester);
        universityName = Utils.updateValue("Update university name: ", universityName);

    }

    public void displayIntern() {
        System.out.println("Intern information");
        this.displayCandidate();
        System.out.println(", major=" + major + ", semester=" + semester + ", universityName=" + universityName + "}");

    }

    @Override
    public String toString() {
        return "Intern{" + "major=" + major + ", semester=" + semester + ", universityName=" + universityName + '}';
    }
}
