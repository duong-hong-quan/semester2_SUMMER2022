/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot9;

import util.Utils;

/**
 *
 * @author Admin
 */
public class Experience extends Candidate {

    private int yearOfExperience;
    private String skill;

    public Experience() {

    }

    public Experience(int yearOfExperience, String skill, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.yearOfExperience = yearOfExperience;
        this.skill = skill;
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

    void createExperience() {
        System.out.println("create experience");
        this.createCandidate();

        yearOfExperience = Utils.inputValue("Input Year of Experience", 1, 100);
        skill = Utils.inputValue("input Skill: ");

    }

    void updateExperience() {
        System.out.println("Update Experience");
        this.updateCandidate();
        yearOfExperience = Utils.updateValue("update year of experience ", 1, 100, yearOfExperience);
        skill = Utils.updateValue("update skill", skill);

    }

    void displayExperience() {
        System.out.println("Experience information");
        this.displayCandidate();
        System.out.println(", yearOfExperience=" + yearOfExperience + ", skill=" + skill + "}");

    }

    void deleteExperience() {

    }
   
}
