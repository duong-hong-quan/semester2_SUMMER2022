package sample.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
public class Product implements Comparable<Object>{
    private String code;
    private String name;
    private int size;
    private int price;

    public Product() {
    }

    public Product(String code) {
        this.code = code;
    }


       @Override
    public int compareTo(Object o) {
                Product p = (Product) o;

        return this.name.compareToIgnoreCase(p.getName());
    }
    

    @Override
    public boolean equals(Object obj) { //so sanh 2 product thong qua code
        return this.code.equals(((Product)obj).getCode());
    }

    @Override
    public String toString() {
        return "\nProduct{" + "code=" + code + ", name=" + name + ", size=" + size + ", price=" + price + '}';
    }
      
    

    public Product(String code, String name, int size, int price) {
        this.code = code;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
   
    
    
    

//     String code="", name="" ;
//     int size=0 , price=0 ;
    // change properties to private.
    // create getter, setter, 
    // Create constructor have parameters( need remove init value of properties
     // override toString

//    @Override
//    public int compareTo(Object o) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 

    

}
