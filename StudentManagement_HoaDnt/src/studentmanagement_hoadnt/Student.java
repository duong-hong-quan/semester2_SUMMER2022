/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement_hoadnt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class Student extends ArrayList<Student> implements Serializable {

    private String id;
    private String name;
    private String semester;
    private String course;

    private List<Student> sList;
    private StudentDao studentDao;

    public Student() {
        studentDao = new StudentDao();
        sList = studentDao.read();
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Student) obj).getId());
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", semester=" + semester + ", course=" + course + '}';
    }

    public boolean create() {
        boolean check = false;
        try {
            this.id = util.Utils.inputValue("Input ID: ");
            this.name = util.Utils.inputValue("Input Name: ");
            this.semester = util.Utils.inputValue("Input semester: ");
            this.course = util.Utils.inputValue("Input course: ");
            Student st = new Student(id, name, semester, course);
            sList.add(st);
            studentDao.write(sList);
        } catch (Exception e) {
        }
        return check;
    }

    public boolean update() {
        boolean check = false;
        try {
            this.name = util.Utils.updateValue("Update Name", this.name);
            this.semester = util.Utils.updateValue("Update semester", this.semester);
            this.course = util.Utils.updateValue("Update course", this.course);

        } catch (Exception e) {

        }
        studentDao.write(sList);

        return check;
    }

    public void showInfor() {
        System.out.println(this.toString());
    }

    public void writeTextToFile(String path, List<Student> sList) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file, true);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            fw.write(this.toString());

            fw.write("\n");

        } catch (Exception e) {

        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }

    public void writeTextToUpdateFile(String path, List<Student> sList) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            fw.write(this.toString());

            fw.write("\n");

        } catch (Exception e) {

        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }

    public boolean loadFromFile(String filename) throws FileNotFoundException {
        try {
            File f = new File(filename);
            if (!f.exists()) {
                System.out.println("The file doesn't exist");

                return false;
            }
            try (FileReader fr = new FileReader(f)) {
                try (BufferedReader br = new BufferedReader(fr)) {
                    String info;
                    while ((info = br.readLine()) != null) {
                        StringTokenizer stk = new StringTokenizer(info, ",");
                        String id = stk.nextToken().trim().toUpperCase();
                        String name = stk.nextToken().trim().toUpperCase();
                        String semester = stk.nextToken().trim().toUpperCase();
                        String course = stk.nextToken().trim().toUpperCase();

                        this.add(new Student(id, name, semester, course));

                    }
                    br.close();
                }
                fr.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return true;
    }

    public void removeLine(String lineContent) throws IOException {
        File file = new File("ouput.txt");
        File temp = new File("_temp_");
        try (PrintWriter out = new PrintWriter(new FileWriter(temp))) {
            Files.lines(file.toPath())
                    .filter(line -> !line.contains(lineContent))
                    .forEach(out::println);
            out.flush();
        }
        temp.renameTo(file);
    }

    public boolean saveToFile(String filename, List<Student> sList) {
        if (sList.isEmpty()) {
            System.out.println("The list is empty");
            return false;
        }
        try {
            File f = new File(filename);
            try (FileWriter fw = new FileWriter(f); PrintWriter pw = new PrintWriter(fw)) {
                this.forEach((x) -> pw.println(x.toString()));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return true;
    }

    public List<Student> getStudentList() {
        return sList;
    }

    public void setStudentList(List<Student> sList) {
        this.sList = sList;
    }

}
