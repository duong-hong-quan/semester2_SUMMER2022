/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot3;

/**
 *
 * @author Admin
 */
public class UsingArray {

    public static void main(String[] args) {
        IntegerArrray arr = new IntegerArrray();
        arr.inputSize();
        arr.inputElement();
        arr.display();
        System.out.println("Smallest: " +arr.findSmallest());
        System.out.println("AVG: " + arr.caculateAVG());
    }
}
