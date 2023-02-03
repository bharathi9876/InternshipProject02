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
public class DriverStore {
    public static void main(String args[]){
        Store s1 = new Store(1, "Rams", "111 Larraway dr.", 987654);
        Store s2 = new Store(2, "Wires", "101 Lockwood dr", 87253);
        Store s3 = new Store(3, "Tims", "324 Devon", 78654);
        Department d1 = new Department(1, "Retail", DepartmentType.Retail);
        Department d2 = new Department(2, "CS", DepartmentType.Customerservice);
        Department d3 = new Department(3, "HR", DepartmentType.HumanResource);
        Product p1 = new Product(1, "Toy", 5, 2, ProductType.Toy);
        Product p2 = new Product(2, "Electronics", 300, 1, ProductType.Electronics);
        Product p3 = new Product(3, "Book", 30, 3, ProductType.Book);
        Product p4 = new Product(4, "Cloths", 20, 6, ProductType.Cloths);
        Employee e1 = new Employee(1, "Ram", 65476, "ram@abc.com", EmployeeType.Fulltime);
        Employee e2 = new Employee(2, "Bob", 23456, "bob@gmail.com", EmployeeType.Parttime);

        d1.getEmplist().add(e2);
        d2.getEmplist().add(e1);
        d3.getEmplist().add(e2);
        d1.getProductlist().add(p1);
        d2.getProductlist().add(p2);
        d3.getProductlist().add(p3);
        d2.getProductlist().add(p4);

        s1.getDepartlist().add(d1);
        System.out.println(s1);
        s2.getDepartlist().add(d2);
        System.out.println(s2);
        s3.getDepartlist().add(d3);
        System.out.println(s3);
    }

    public static ArrayList adddepartment() {
        ArrayList<Department> depart = new ArrayList<>();
        Department d1 = new Department(1, "Retail", DepartmentType.Retail);
        Department d2 = new Department(2, "CS", DepartmentType.Customerservice);
        Department d3 = new Department(3, "HR", DepartmentType.HumanResource);
        depart.add(d1);
        depart.add(d2);
        depart.add(d3);
        return depart;
    
    }
}
