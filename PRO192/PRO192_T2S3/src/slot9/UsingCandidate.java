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
public class UsingCandidate {

    public static void main(String[] args) {

  //     Experience s1 = new Experience();
    //   System.out.println("xxxxxx: " +s1.toString());
//        s1.displayExperience();
//        s1.createExperience();
//        s1.displayExperience();
//        s1.updateExperience();
//        s1.displayExperience();
//
//        Fresher s2 = new Fresher();
//        s2.createFresher();
//        s2.displayFresher();
//        s2.updateFresher();
//        s2.displayFresher();
//
//        Intern s3 = new Intern();
//        s3.createIntern();
//        s3.displayIntern();
//        s3.updateIntern();
//        s3.displayIntern();
        int choice;
        Intern s3 = new Intern();
        Fresher s2 = new Fresher();
        Experience s1 = new Experience();

        do {
            System.out.println("---------------------");
            System.out.println("1- Create Intern     ");
            System.out.println("2- Update Intern     ");
            System.out.println("3- Display Intern    ");
            System.out.println("4- Create Fresher    ");
            System.out.println("5- Update Fresher    ");
            System.out.println("6- Display Fresher   ");
            System.out.println("7- Create Experience ");
            System.out.println("8- Update Experience ");
            System.out.println("9- Display Experience");
            System.out.println("10-Exit              ");
            System.out.println("---------------------");
            choice = Utils.inputValue("Input your choice", 1, 10);
            switch (choice) {
                case 1:
                    s3.createIntern();
                    break;
                case 2:
                    s3.updateIntern();
                    break;
                case 3:
                    s3.displayIntern();
                    break;
                case 4:
                    s2.createFresher();
                    break;
                case 5:
                    s2.updateFresher();
                    break;
                case 6:
                    s2.displayFresher();
                    break;
                case 7:
                    s1.createExperience();
                    break;
                case 8:
                    s1.updateExperience();
                    break;
                case 9:
                    s1.displayExperience();
                    break;
                
                    
            }
        } while (choice != 10);

    }
}
