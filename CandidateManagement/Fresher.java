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
public class Fresher extends Candidate{

    private String graduationDate;
    private String rank;
    private String educationName;

    

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
    
    
    public void createFresher(){
        this.createCandidate();
        graduationDate= Utils.inputValue("input Graduation date:");
        rank= Utils.inputValue("input rank:");
        educationName= Utils.inputValue("input Graduation Name:");
        
        
    }
    public void updateFresher(){
        this.updateCandidate();
        graduationDate= Utils.updateValue("input Graduation date:",graduationDate);
        rank= Utils.updateValue("input rank:",rank);
        educationName= Utils.updateValue("input Graduation Name:",educationName);
        
    }
    public void displayFresher(){
        this.displayCandidate();
        System.out.print(", graduationDate=" + graduationDate + ", rank=" + rank + ", educationName=" + educationName + '}');
        
    }

    public void deleteExperience() {

    }

    public void searchExperience() {

    }

}
