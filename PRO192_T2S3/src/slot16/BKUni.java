/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot16;

/**
 *
 * @author Admin
 */
public class BKUni extends ITSchool {

    public BKUni() {
        this.setName("BACH KHOA");

    }

    @Override
    public void teachBasic() {
        System.out.println("Basic C++");
    }

    @Override
    public void teachAdvance() {
        System.out.println("Advance: DATA SCIENCE");
    }

    @Override
    public void teachSpecial() {
        System.out.println("Special: DATA MINING");
    }

    @Override
    public void showInfo() {
        System.out.println("This is " + this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    }
}
