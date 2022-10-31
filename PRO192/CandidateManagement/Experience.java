/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;



import util.Utils;

/**
 *
 * @author hd
 */
public class Experience extends Candidate{
    
    
    private int yearOfExperience;
    private String skill;

    public Experience() {
    }

    public Experience(int yearOfExperience, String skill) {
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
    
    public void createExperience(){
        System.out.println("Create Exeprience:");
        
        this.createCandidate();
        yearOfExperience= Utils.inputValue("Input Year of Experience: ", 1, 100);
        skill= Utils.inputValue("input Skill: ");
        
    }
    public void updateExperience(){
        System.out.println("Update Exeprience:");
        this.updateCandidate();
        yearOfExperience= Utils.updateValue("update Year of Experience: ", 1, 100, yearOfExperience);
        skill= Utils.updateValue("update Skill", skill);
    }
    public void displayExperience(){
        System.out.println("Experience information:");
        this.displayCandidate();
        System.out.print(", yearOfExperience=" + yearOfExperience + ", skill=" + skill+"}" );
    }
    public void deleteExperience(){
        
    }
    public void searchExperience(){
        
    }

    @Override
    public String toString() {
        return "Experience{" + "yearOfExperience=" + yearOfExperience + ", skill=" + skill + '}';
    }
    
    
}
