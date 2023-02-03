/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject2;

/**
 *
 * @author giril
 */
public class Toy extends Product {
     private String protype;

    public Toy() {
    }

    public Toy(String protype, int id, String name, int price, int qty, ProductType type) {
        super(id, name, price, qty, type);
        this.protype = protype;
    }

    @Override
    public String toString() {
        return "Toy{" + "protype=" + protype + '}';
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }
     
}
