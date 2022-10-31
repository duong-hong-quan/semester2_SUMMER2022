package sample.controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hoa Doan
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import sample.dto.I_List;
import sample.dto.Product;
import sample.utils.Utils;

public class ProductList extends ArrayList<Product> implements I_List {

    Scanner sc = new Scanner(System.in);

    @Override
    public int find(String code) {
        int index = -1;
        index = this.indexOf(new Product(code));
        return index;
    }

    @Override
    public void add() {
        boolean check = true;
        String code = "";
        do {
            code = Utils.getString("Input code: ");
            int index = this.find(code);
            if (index == -1) {
                check = false;
            }
        } while (check);
        String name = Utils.getString("Input name: ");
        int price = Utils.getInt("Input price: ", Utils.MIN, Utils.MAX);
        int size = Utils.getInt("Input size: ", Utils.MIN, Utils.MAX);
        this.add(new Product(code, name, size, price));
    }

    @Override
    public void remove() {
        String code = Utils.getString("input remove code: ");
        boolean confirmRemove = Utils.confirmYesNo("Are you sure(y/n)? ");
        if (confirmRemove) {
            this.remove(new Product(code));
        }
    }

    @Override
    public void update() {
        String code = Utils.getString("input update code: ");
        int index = this.find(code);
        if(index < 0 || index > this.size()) {
            return ;
        }
        String newName = Utils.getString("Input newName: ", this.get(index).getName());
        this.get(index).setName(newName);
        int newPrice = Utils.getInt("Input newPrice: ", Utils.MIN, Utils.MAX, this.get(index).getPrice());
        this.get(index).setPrice(newPrice);
        int newSize = Utils.getInt("Input newSize: ", Utils.MIN, Utils.MAX, this.get(index).getSize());
        this.get(index).setSize(newSize);

    }

    @Override
    public void sort() {
        Collections.sort(this);
    }

    @Override
    public void output() {
        System.out.println(this.toString());
    }

}
