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
public class Department {
     private int id;
    private String name;
    private DepartmentType type;
    private ArrayList<Product> productlist = new ArrayList<>();
    private ArrayList<Employee> emplist = new ArrayList<>();

    public Department() {
    }

    public Department(int id, String name, DepartmentType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + ", type=" + type + ", productlist=" + productlist + ", emplist=" + emplist + '}';
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

    public DepartmentType getType() {
        return type;
    }

    public void setType(DepartmentType type) {
        this.type = type;
    }

    public ArrayList<Product> getProductlist() {
        return productlist;
    }

    public void setProductlist(ArrayList<Product> productlist) {
        this.productlist = productlist;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }
    
    
}
