/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot16;

import slot16b.*;

/**
 *
 * @author Admin
 */
public class UsingITSchool {

    public static void main(String[] args) {
        ITSchool it[] = new ITSchool[3];
        it[0] = new FPTUni();
        it[1] = new TDTUni();
        it[2] = new BKUni();

        for (ITSchool iTSchool : it) {
            iTSchool.showInfo();
        }
    }
}
