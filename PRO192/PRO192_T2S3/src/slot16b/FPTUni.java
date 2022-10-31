/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot16b;

/**
 *
 * @author Admin
 */
public class FPTUni implements ITSchool {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FPTUni() {
        this.setName("FPT");
    }

    @Override
    public void teachBasic() {
        System.out.println("Basic C");
    }

    @Override
    public void teachAdvance() {
        System.out.println("Advance:OOP");
    }

    @Override
    public void teachSpecial() {
        System.out.println("Special: Web application");
    }

    @Override
    public void showInfo() {
        System.out.println("This is " + this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();
    }

}
