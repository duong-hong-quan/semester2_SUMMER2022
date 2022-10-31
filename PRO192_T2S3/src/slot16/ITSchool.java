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
public abstract class ITSchool {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   

    public abstract void teachBasic();

    public abstract void teachAdvance();

    public abstract void teachSpecial();

    public void showInfo() {
      System.out.println("This is " +this.getName());
        this.teachBasic();
        this.teachAdvance();
        this.teachSpecial();    
    }
    
    }

   


