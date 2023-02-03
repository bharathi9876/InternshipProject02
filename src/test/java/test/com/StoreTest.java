/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import com.mycompany.utility.internproject2.Book;
import com.mycompany.utility.internproject2.Department;
import com.mycompany.utility.internproject2.DepartmentType;
import com.mycompany.utility.internproject2.DriverStore;
import static com.mycompany.utility.internproject2.DriverStore.adddepartment;
import com.mycompany.utility.internproject2.Electronics;
import com.mycompany.utility.internproject2.Employee;
import com.mycompany.utility.internproject2.EmployeeType;
import com.mycompany.utility.internproject2.FullTimeEmp;
import com.mycompany.utility.internproject2.PartTimeEmp;
import com.mycompany.utility.internproject2.Product;
import com.mycompany.utility.internproject2.ProductType;
import com.mycompany.utility.internproject2.Store;
import com.mycompany.utility.internproject2.Toy;
import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author giril
 */
public class StoreTest {
    
    public StoreTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    @Test
    public void testStorehasDepartment() {
        Store s = new Store();
        Store s1 = new Store(1, "A Store", "123 Devon", 98642);       
        s.setId(1);
        s.setName("kim");
        s.setAddress("111 laaraway dr");
        s.setDepartlist(adddepartment());
        s.setPhone(54432);
        Department d = new Department(1, "Tim", DepartmentType.Retail);
        Department d1 = new Department(2, "CS", DepartmentType.Customerservice);
        Department d2 = new Department(3, "HR", DepartmentType.HumanResource);
        //Department d = new Department(1, "Tim", DepartmentType.Retail);
        s.getDepartlist().add(d);
        s.getDepartlist().add(d1);
        s.getDepartlist().add(d2);
        s.setDepartlist(DriverStore.adddepartment());
         //assertEquals(d, s.getDepartlist().get(0));
         //assertEquals(d, s.getDepartlist().get(1));
        assertEquals(false, s.getDepartlist().isEmpty());
        assertEquals(1, s.getDepartlist().get(0).getId());
         assertEquals(DepartmentType.Retail, s.getDepartlist().get(0).getType());
         assertEquals("CS", s.getDepartlist().get(1).getName());
         assertEquals(3, s.getDepartlist().get(2).getId());
         assertEquals(1, s.getId());
         assertEquals("kim", s.getName());
         assertEquals("111 laaraway dr", s.getAddress());
         assertEquals(54432, s.getPhone());
         System.out.println("string="+s.toString());
    }

  @Test
    public void testDepartmentProducts() {
        Department d=new Department();
        Department d1=new Department(2, "Retail", DepartmentType.Retail);
        d1.setId(2);
        d1.setName("Retail");
        d1.setType(DepartmentType.Retail);
        ArrayList<Employee> emplist=null;
        d1.setEmplist(emplist);
        ArrayList<Product> productlist = null;       
        d1.setProductlist(productlist);
        Product p=new Product();             
        p.setId(1);
        p.setName("Toy");
        p.setQty(5);
        p.setPrice(20);
        p.setType(ProductType.Toy);
        d.getProductlist().add(p);       
        assertEquals(p, d.getProductlist().get(0));
        assertEquals(false, d.getProductlist().isEmpty());  
        System.out.println("string="+d.toString());
        assertEquals("Department{id=0, name=null, type=null, productlist=[Product{id=1, name=Toy, price=20, qty=5, type=Toy}], emplist=[]}", d.toString());
    }
   @Test
    public void testDepartmentEmp (){
        Department d=new Department();
        Employee e=new Employee(1, "Kim", 12345, "kim@gmail.com", EmployeeType.Fulltime);
        d.getEmplist().add(e);
        //assertEquals(e, d.getEmplist().get(0));
        assertEquals("Kim", d.getEmplist().get(0).getName());
    }
   @Test
    public void testproductprice(){
        Product p1=new Product();
        p1.setId(1);
        p1.setName("Qin");
        p1.setPrice(100);
        p1.setQty(10);
        p1.setType(ProductType.Electronics);
         Product p2=new Product(1, "Waz", 200, 7, ProductType.Toy);
        assertEquals(100,p1.getPrice());
        assertEquals("Qin", p1.getName());
        assertEquals(1, p1.getId());
        assertEquals(10, p1.getQty());
        assertEquals(ProductType.Electronics, p1.getType());
        System.out.println("string="+p1.toString());
        
    }
    @Test
    public void testempmail (){
        Employee e1=new Employee();
         //Employee e=new Employee(1, "kavin", 87554, "kavin@gmail.com", EmployeeType.Parttime);
        e1.setId(01);
        e1.setName("Kal");
        e1.setPhone(34526);
        e1.setType(EmployeeType.Fulltime);
        e1.setEmail("kal@abc.com");
        assertEquals("kal@abc.com",e1.getEmail());
        assertEquals( EmployeeType.Fulltime, e1.getType());
        assertEquals(01, e1.getId());
        assertEquals("Kal", e1.getName());
        assertEquals(34526, e1.getPhone());
        System.out.println("string="+e1.toString());
    }
    @Test
    public void testbook(){
        Book b1=new Book();
        //Book b2=new Book("book", 02, "light", 50, 10, ProductType.Book);
        Book b=new Book();
        Book b3=new Book("book", 02, "light", 50, 10, ProductType.Book);
        b1.setId(1);
        b1.setName("abc book");
        b1.setPrice(12);
        b1.setQty(2);
        b1.setType(ProductType.Book);
        b1.setProtype("type");
        assertEquals( ProductType.Book, b1.getType());
        assertEquals("type", b1.getProtype());
        assertEquals(1, b1.getId());
        assertEquals("abc book", b1.getName());
        assertEquals(12, b1.getPrice());
        assertEquals(2, b1.getQty());  
        System.out.println("string="+b1.toString());
    }
  @Test
  public void fullTimeEmp(){
      FullTimeEmp f= new FullTimeEmp();
      FullTimeEmp f1= new FullTimeEmp("type", 1, "Mi", 64324, "mi@azx.com", EmployeeType.Fulltime);
      f.setId(1);
      f.setEmptype("type");
      f.setName("yom");
      f.setEmail("yom@gmail.com");
      f.setType(EmployeeType.Fulltime);
      f.setPhone(46532);
      assertEquals("type", f.getEmptype());
      assertEquals(1, f.getId());
      assertEquals("yom", f.getName());
      assertEquals(46532, f.getPhone());
      assertEquals("yom@gmail.com", f.getEmail());
      assertEquals(EmployeeType.Fulltime, f.getType());
      System.out.println("string="+f.toString());
  }
    @Test
    public void testpartimeemp(){
        PartTimeEmp p=new PartTimeEmp();
         PartTimeEmp p1=new PartTimeEmp("type", 1, "Kavin", 87659, "kavin@gmail.com", EmployeeType.Parttime);
        p.setEmptype("type");
        p.setId(1);
        p.setName("Rim");
        p.setPhone(87655);
        p.setEmail("rim@abc.com");
        p.setType(EmployeeType.Parttime);
        assertEquals("type", p.getEmptype());
        assertEquals(1, p.getId());
        assertEquals("Rim", p.getName());
        assertEquals(87655, p.getPhone());
        assertEquals("rim@abc.com", p.getEmail());
        assertEquals(EmployeeType.Parttime, p.getType());
        System.out.println("string="+p.toString());
    }
   @Test
    public void testelectronics(){
        Electronics e=new Electronics();
        Electronics e1=new Electronics("type", 1, "car", 20000, 1, ProductType.Electronics);
        
        e.setProtype("type");
        e.setId(1);
        e.setName( "TV");
        e.setQty(1);
        e.setPrice(2000);
        e.setType(ProductType.Electronics);
        assertEquals("type", e.getProtype());
        assertEquals(1, e.getId());
        assertEquals("TV", e.getName());
        assertEquals(2000, e.getPrice());
        assertEquals(1, e.getQty());
        assertEquals( ProductType.Electronics, e.getType());
        System.out.println("string="+e.toString());
    }
    @Test
    public void testtoy(){
        Toy t=new Toy();
        Toy t1=new Toy("type", 2, "Rim", 40, 2, ProductType.Toy);
        t.setId(1);
        t.setProtype("type");
        t.setName("car");
        t.setQty(10);
        t.setPrice(50);
        t.setType(ProductType.Toy);
        String toyname="Bus";
        assertEquals("type", t.getProtype());
        assertEquals(1, t.getId());
        assertEquals("car", t.getName());
        assertEquals(50, t.getPrice());
        assertEquals(10, t.getQty());
        assertEquals(ProductType.Toy, t.getType());
        System.out.println("string="+t.toString());
    }
}
