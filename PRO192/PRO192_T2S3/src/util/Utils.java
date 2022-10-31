/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 *
 * @author hd
 */
public class Utils {

    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int inputValue(String welcome, int min, int max) {
        int number = 0;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome + "[" + min + ", " + max + "]");
                number = Integer.parseInt(sc.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.print(welcome + "[" + min + ", " + max + "]");
            }
        } while (cont || number > max || number < min);
        return number;
    }

    public static int updateValue(String welcome, int min, int max, int oldValue) {
        int number = 0;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome + "[" + min + ", " + max + "]");
                String str = sc.nextLine();
                if (str.isEmpty()) {
                    number = oldValue;
                    cont = false;
                } else {
                    number = Integer.parseInt(str);
                    cont = false;
                }
            } catch (Exception e) {
                System.out.print(welcome + "[" + min + ", " + max + "]");
            }
        } while (cont || number > max || number < min);
        return number;
    }

    public static String inputValue(String welcome) {
        String str = "";
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    cont = false;
                }
            } catch (Exception e) {
                System.out.print(welcome);
            }
        } while (cont);
        return str;
    }

    public static String updateValue(String welcome, String oldValue) {
        String str = "";
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(welcome);
                str = sc.nextLine();
                if (str.isEmpty()) {
                    str = oldValue;
                    cont = false;
                } else {
                    cont = false;
                }
            } catch (Exception e) {
                System.out.print(welcome);
            }
        } while (cont);
        return str;
    }

    public static void showMenu() {
        System.out.println("Integer Array Management:");
        System.out.println("1. Enter values");
        System.out.println("2. Display Value");
        System.out.println("3. Sort array");
        System.out.println("4. Search value");
        System.out.println("5. Quit");
    }

    public static void showCandidateMenu() {
        System.out.println("Candidate Management:");
        System.out.println("1. Create Candidate");
        System.out.println("2. Update Candidate");
        System.out.println("3. Delete Candidate");
        System.out.println("4. Search Candidate by name");
        System.out.println("5. Sort base ID");
        System.out.println("6. Display Candidate");
        System.out.println("7. Quit");
    }

    public static void showCandidateType() {
        System.out.println("Candidate Type:");
        System.out.println("1. Experience Candidate");
        System.out.println("2. Fresher Candidate");
        System.out.println("3. Intern Candidate");

    }

    public static void showStudentMenu() {
        System.out.println("Student Management:");
        System.out.println("1. Create Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Search Student by name");
        System.out.println("5. Display Student");
        System.out.println("6. Quit");
    }

}
