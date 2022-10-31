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
public class Fresher extends Candidate {

    private String graduationDate;
    private String graduationRank;
    private String Edudcation;

    public Fresher() {

    }

    public Fresher(String graduationDate, String graduationRank, String Edudcation, String id, String firstName, String lastName, String birthDate, String address, String phone, String email, String type) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.Edudcation = Edudcation;
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

    void createFresher() {
        System.out.println("Create Fresher");
        this.createCandidate();

        graduationDate = Utils.inputValue("Input graduation date: ");

        graduationRank = Utils.inputValue("Input graduation rank");

        Edudcation = Utils.inputValue("Input your univeristy: ");

    }

    void updateFresher() {
        System.out.println("Update Fresher");
        this.updateCandidate();

        graduationDate = Utils.updateValue("Update graduation date: ", graduationDate);

        graduationRank = Utils.updateValue("Update graduation rank: ", graduationRank);

        Edudcation = Utils.updateValue("Update your university", Edudcation);
    }

    void displayFresher() {
        System.out.println("Fresher information");
        this.displayCandidate();
        System.out.println(" ,graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", Edudcation=" + Edudcation + "}");
    }

    void searchFresher() {

    }
}
