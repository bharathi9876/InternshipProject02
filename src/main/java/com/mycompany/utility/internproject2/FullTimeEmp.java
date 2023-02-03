/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utility.internproject2;

/**
 *
 * @author giril
 */
public class FullTimeEmp extends Employee {
    private String emptype;

    public FullTimeEmp() {
    }

    

    public FullTimeEmp(String emptype, int id, String name, int phone, String email, EmployeeType type) {
        super(id, name, phone, email, type);
        this.emptype = emptype;
    }

    @Override
    public String toString() {
        return "FullTimeEmp{" + "emptype=" + emptype + '}';
    }

    public String getEmptype() {
        return emptype;
    }

    public void setEmptype(String emptype) {
        this.emptype = emptype;
    }
    
    
}
