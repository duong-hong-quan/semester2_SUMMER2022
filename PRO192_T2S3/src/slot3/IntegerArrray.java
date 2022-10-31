/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot3;

import java.util.Scanner;
import util.Utils;

/**
 *
 * @author Admin
 */
public class IntegerArrray {

    int size;
    int[] element = new int[5];

    public void inputSize() {
       
       // size = Utils.inputInt(1, 10);
    }

    public void inputElement() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element: ");
        for (int i = 0; i < size; i++) {
            System.out.print("element: " + i +" ");
            element[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void display() {
        System.out.print("\nArray information: \n");
        for (int i : element) {
            System.out.print(" " + i);
        }

    }

    public int findSmallest() {
        int smallest = element[0];
        for (int i : element) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public float caculateAVG() {
        float total = 0;
        for (int i : element) {
            total += i;
        }
        return total / size;
    }
}
