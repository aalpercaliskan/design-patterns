/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alper
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }

    /**
     * Test of printInfo method, of class Employee.
     */
    @Test
    public void testPrintInfo() {
       //Bu metot ile ilgili test yazılmamıştır 
    }

    /**
     * Test of getCost method, of class Employee.
     */
    @Test
    public void testGetCost() {
        //Employee'nin altında çalışan olmadığı için
        //kendi maliyeti döndürülmelidir
        Employee e = new Employee("E", 1000);
        int expected = 1000;
        int actual = e.getCost();
        assertEquals(expected, actual);
    }

    /**
     * Test of getWorkerWithFirstName method, of class Employee.
     */
    @Test
    public void testGetWorkerWithFirstName() {
        Employee e = new Employee("Alper Çalışkan", 1000);
        Worker expected = e;
        Worker actual = e.getWorkerWithFirstName("Alper");
        assertEquals(expected, actual);
    }

    /**
     * Test of getWorkerWithFullName method, of class Employee.
     */
    @Test
    public void testGetWorkerWithFullName() {
        Employee e = new Employee("Alper Çalışkan", 1000);
        Worker expected = e;
        Worker actual = e.getWorkerWithFullName("Alper Çalışkan");
        assertEquals(expected, actual);
    }

    /**
     * Test of addWorker method, of class Employee.
     */
    @Test
    public void testAddWorker() {
        //Bu metot ile ilgili test yazılmamıştır 
    }
    
}
