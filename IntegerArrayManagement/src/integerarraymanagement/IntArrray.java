/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerarraymanagement;

import utils.Utils;

/**
 *
 * @author Admin
 */
public class IntArrray {

    private final int len;
    private int[] data;

    public IntArrray() {
        this.len = Utils.inputValue("Input  len: ", utils.Utils.min, utils.Utils.max);
        this.data = new int[len];
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void enterValues() {
        System.out.println("Inout array value");
        for (int i = 0; i < this.len; i++) {
            this.data[i] = Utils.inputValue("data[" + i + "]: ", Utils.min, Utils.max);
        }
    }

    public void displayValue() {
        for (int i : data) {
            System.out.println(" " + i);
        }
    }

    public void sort() {
        for (int i = 0; i < this.len - 1; i++) {
            for (int j = i + 1; j < this.len; j++) {
                if (this.data[i] > this.data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        for (int i : data) {
            System.out.println(" " + i);

        }
    }

    public int searchValue(int value) {
        int index = -1;
        return index;
    }
    
}
