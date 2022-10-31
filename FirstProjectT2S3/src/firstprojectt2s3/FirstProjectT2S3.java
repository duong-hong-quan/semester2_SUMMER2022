/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprojectt2s3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FirstProjectT2S3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world !");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input len: ");
        int len = sc.nextInt();
        int inArray[] = new int[len];
        System.out.print("input value: ");
        for (int i = 0; i < len; i++) {
            System.out.print("inArray[" + i + "]: ");
            inArray[i] = sc.nextInt();
        }
        for (int i : inArray) {
            System.out.print(" " + i);
        }
        System.out.println("\ngood bye !");
 }   
    public static void doSomething() {
    
}
}