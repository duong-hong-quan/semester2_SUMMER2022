/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot28;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Product implements Serializable{
    private String id;
    private String name;
    private int size;
    private double price;

    public Product() {
    }

    public Product(String id, String name, int size, double price) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  id + "," +  name + "," + size+"," + price;
    }
    
}
