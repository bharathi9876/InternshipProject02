/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject2;

/**
 *
 * @author giril
 */
public class Employee {
     private int id;
    private String name;
    private int phone;
    private String email;
    private EmployeeType type;

    public Employee() {
    }

    public Employee(int id, String name, int phone, String email, EmployeeType type) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", type=" + type + '}';
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }
    
    
}
