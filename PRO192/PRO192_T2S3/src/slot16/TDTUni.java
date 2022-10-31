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
public class TDTUni extends ITSchool {

    public TDTUni() {
        this.setName("Ton Duc Thang");
    }

    @Override
    public void teachBasic() {
        System.out.println("Basic: Python");
    }

    @Override
    public void teachAdvance() {
        System.out.println("Advance: CSD");
    }

    @Override
    public void teachSpecial() {
        System.out.println("Special: Deep Learning");
    }

    @Override
    public void showInfo() {
        System.out.println("This is " + this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    }

}
