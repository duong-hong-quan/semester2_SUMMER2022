/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerarraymanagement;

/**
 *
 * @author Admin
 */


import utils.Utils;

public class UsingIntArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IntArrray intArr = new IntArrray();
        boolean cont = true;
        do {
            Utils.showMenu();
            int select =  Utils.inputValue("Select menu", 1, 5);
            switch(select) {
                case 1:
                    intArr.enterValues();
                    break;
                case 2:
                    intArr.displayValue();
                    break;
                case 3:
                    intArr.sort();
                    break;
                case 4:
                    int value = Utils.inputValue("Search value", Utils.min, Utils.max);
                    int index =  intArr.searchValue(value);
                    System.out.println("Found at :" +index);

                    break;
                case 5:
                    String quit = Utils.inputValue("Do you want to quit (Y/N):");
                    if (quit.equalsIgnoreCase("y")) {
                        cont = false;
                    }
                    break;
            }
            
        } while (cont);
        
        
    }
  
}
