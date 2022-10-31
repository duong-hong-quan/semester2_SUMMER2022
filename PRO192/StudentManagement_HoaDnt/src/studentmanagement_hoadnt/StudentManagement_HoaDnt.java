/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement_hoadnt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import util.Utils;

/**
 *
 * @author Admin
 */
public class StudentManagement_HoaDnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        List<Student> sList = new ArrayList<>();

        String id = "";
        boolean cont = true;
        int index = -1;

        do {
            Utils.showStudentMenu();
            int select = Utils.inputValue("Select your menu", 1, 6);
            switch (select) {
                case 1:

                    Student st = new Student();
                    st.create();

                    if (!sList.contains(st)) {
                        sList.add(st);

                    }

                    break;

                case 2:
                    //ƯPDATE
                    boolean isExisted = false;
                    id = Utils.inputValue("Input update ID: ");
                    index = sList.indexOf(new Student(id));
                    int size = sList.size();
                    for (int i = 0; i < size; i++) {
                        if (sList.get(i).getId() == id) {
                            sList.get(i).update();

                        }

                        if (!isExisted) {
                            System.out.printf("id = %d not existed.\n", id);
                        } else {
                            
                        }
                    }

                    break;

                case 3:
                    //DELETE

                    id = Utils.inputValue("Input remove ID: ");
                    index = sList.indexOf(new Student(id));
                    if (index > -1) {

                        sList.remove(index);

                    }

                    break;

                case 4:
                    //SEARCH
                    String name = Utils.inputValue("Input search name");
                    for (int i = 0;
                            i < sList.size();
                            i++) {
                        if (sList.get(i).getName().contains(name)) {
                            sList.get(i).showInfor();
                        }

                    }
                    break;

                case 5:
                    for (int i = 0;
                            i < sList.size();
                            i++) {
                        sList.get(i).showInfor();
                    }

                    break;

                case 6:
                    String quit = Utils.inputValue("Do you want to quit (Y/N) ?");

                    if (quit.equalsIgnoreCase(
                            "y")) {
                        cont = false;

                    }

                    break;
            }

        } while (cont);

    }

}
