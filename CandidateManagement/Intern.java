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
public class Intern extends Candidate {

    private String major;
    private String semester;
    private String eduactionName;

    public Intern() {
    }

    public Intern(String major, String semester, String eduactionName) {
        this.major = major;
        this.semester = semester;
        this.eduactionName = eduactionName;
    }

    public Intern(String major, String semester, String eduactionName, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.major = major;
        this.semester = semester;
        this.eduactionName = eduactionName;
    }
    
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEduactionName() {
        return eduactionName;
    }

    public void setEduactionName(String eduactionName) {
        this.eduactionName = eduactionName;
    }

    public void createIntern() {
        this.createCandidate();
        major = Utils.inputValue("input Major: ");
        eduactionName = Utils.inputValue("input Education name: ");
        semester = Utils.inputValue("input Semeter: ");

    }

    public void updateIntern() {
        this.updateCandidate();
        major = Utils.updateValue("update Major: ", major);
        eduactionName = Utils.updateValue("update Education name: ", eduactionName);
        semester = Utils.updateValue("update Semeter: ", semester);
    }

    public void displayIntern() {
        this.displayCandidate();
        System.out.println(", major=" + major + ", semester=" + semester + ", eduactionName=" + eduactionName + '}');

    }

    public void deleteExperience() {

    }

    public void searchExperience() {

    }

}
