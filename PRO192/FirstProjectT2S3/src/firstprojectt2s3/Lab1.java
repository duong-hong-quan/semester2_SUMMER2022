/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstprojectt2s3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        String id = sc.nextLine();
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input first number: ");
        int fNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Input second number: ");
        int SNumber = Integer.parseInt(sc.nextLine());

        System.out.println("id= " + id + " " + " name: " + name);
        System.out.println("sum of " + fNumber + " and " + SNumber + "= " + (fNumber + SNumber));
    }
}
