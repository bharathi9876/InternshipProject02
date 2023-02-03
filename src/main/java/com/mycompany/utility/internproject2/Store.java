/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject2;

import java.util.ArrayList;

/**
 *
 * @author giril
 */
public class Store {
     private int id;
    private String name;
    private String Address;
    private int phone;
   private ArrayList<Department> departlist=new ArrayList<>();

    public Store() {
    }

    public Store(int id, String name, String Address, int phone) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Store{" + "id=" + id + ", name=" + name + ", Address=" + Address + ", phone=" + phone + ", departlist=" + departlist + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public ArrayList<Department> getDepartlist() {
        return departlist;
    }

    public void setDepartlist(ArrayList<Department> departlist) {
        this.departlist = departlist;
    }
   
   
}
