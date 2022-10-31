/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot9;





/**
 *
 * @author hd
 */
public class UsingCandidate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Experience ex= new Experience();
        System.out.println("xxxxxx: "+ ex.toString());
        ex.displayExperience();
        ex.createExperience();
        ex.displayExperience();
        ex.updateExperience();
        ex.displayExperience();
    }
    
}
