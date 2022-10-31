/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ReadWriterFile {
    
    public static void main(String[] args) {
        String fileName = "output.txt";
//        String fileName = "output.bin";
        try {
            File file = new File(fileName);
            boolean check = file.exists();
            if (check == false) {
                file.createNewFile();
                
            }
//            writeTextToFile(fileName);
//            readTextFromFile(fileName);
            writeObjectToFile(fileName);
            readObjectFromFile(fileName);
        } catch (Exception e) {
        }
        
    }
    
    public static void writeTextToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fw = new FileWriter(file);
        try {
            Product product = new Product("P01", "Thịt bò nướng đá", 5, 10);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P02", "Đá bào", 5, 10);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P03", "Phở thập cẩm", 5, 10);
            fw.write(product.toString());
            fw.write("\n");
            product = new Product("P04", "Bò giò heo", 5, 10);
            fw.write(product.toString());
            fw.write("\n");
            
        } catch (Exception e) {
            
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
        
    }
    
    public static void readTextFromFile(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        try {
            String line = "";
            List listProduct = new ArrayList();
            while ((line = br.readLine()) != null) {
                String tmp[] = line.split(",");
                String id = tmp[0];
                String name = tmp[1];
                int size = Integer.parseInt(tmp[2]);
                double price = Double.parseDouble(tmp[3]);
                listProduct.add(new Product(id, name, size, price));
            }
            System.out.println(listProduct);
        } catch (Exception e) {
            
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }
    
    public static void writeObjectToFile(String path) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try {
            oos.writeObject(new Product("P01", "Thịt bò nướng đá", 5, 10));
            oos.writeObject(new Product("P02", "Đá bào", 5, 10));
            
            oos.writeObject(new Product("P03", "Phở thập cẩm", 5, 10));
            
            oos.writeObject(new Product("P01", "Thịt bò nướng đá", 5, 10));
            
        } catch (Exception e) {
        } finally {
            if (oos != null) {
                oos.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
    
    public static void readObjectFromFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            List listProduct = new ArrayList();
            while (fis.available() > 0) {
                Product product = (Product) ois.readObject();
                listProduct.add(product);
            }
            System.out.println(listProduct);
        } catch (Exception e) {
        } finally {
            if (ois != null) {
                ois.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        
    }
    
}
