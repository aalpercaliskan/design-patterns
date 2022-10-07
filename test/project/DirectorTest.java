/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alper
 */

public class DirectorTest {
    
    public DirectorTest() {
        
    }

    /**
     * Test of addWorker method, of class Director.
     */
    @Test
    public void testAddWorker() {
        
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);

        Director d7 = new Director("Alper Çalışkan", 1000);
        d5.addWorker(d7);
        
        //Sedat Tunc adlı direktöre ait altında çalışan dizisinin doğru 
        //şekilde oluşturulup oluşturulmadığı test edlimiştir
        Worker[] expected = {e3,d7};
        Worker[] actual = d5.getArrWorker();
        Assert.assertArrayEquals(expected, actual);
        
    }

    /**
     * Test of getWorkerWithFirstName method, of class Director.
     */
    @Test
    public void testGetWorkerWithFirstName() {
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);
        
        //Bora Kuzey isimli çalışanın doğru şekilde bulunup bulunmadığı test edilmiştir
        Worker expected = e3;
        Worker actual = d1.getWorkerWithFirstName("Bora");
        assertEquals(expected, actual);
    }

    /**
     * Test of getWorkerWithFullName method, of class Director.
     */
    @Test
    public void testGetWorkerWithFullName() {
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);
        
        //Ugur Guclu isimli çalışanın doğru şekilde bulunup bulunmadığı test edilmiştir
        Worker expected = d4;
        Worker actual = d1.getWorkerWithFullName("Ugur Guclu");
        assertEquals(expected, actual);
    }

    /**
     * Test of printInfo method, of class Director.
     */
    @Test
    public void testPrintInfo() {
       //Bu metot ile ilgili test yazılmamıştır 
    }

    /**
     * Test of getCost method, of class Director.
     */
    @Test
    public void testGetCost() {
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);
        
        //Mustafa Turksever adlı çalışanın maliyetini doğru şekilde bulunup 
        //bulunmadığı test edilmiştir
        int excepted = 24000;
        int actual = d1.getCost();
        assertEquals(excepted, actual);
        
        //Bora Kuzey adlı çalışanın maliyetinin doğru şekilde bulunup 
        //bulunmadığı test edilmiştir
        excepted = 1000;
        actual = e3.getCost();
        assertEquals(excepted, actual);
    }

    /**
     * Test of iterator method, of class Director.
     */
    @Test
    public void testIterator() {
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);
        
        //Bahar Karaoglan adlı çalışanın altında bir çalışan
        //bulunmamaktadır. Bu nedenle hasNext fonksiyonunun
        //false döndürmesi gerekmektedir.
        Iterator iter = d3.iterator();
        Boolean expectedBoolean = false;
        Boolean actualBoolean = iter.hasNext();
        assertEquals(expectedBoolean, actualBoolean);
        
        //Halil Sengonca adlı çalışanın altında bir çalışan
        //bulunmaktadır. Bu nedenle hasNext fonksiyonunun
        //true döndürmesi gerekmektedir.
        iter = d2.iterator();
        expectedBoolean = true;
        actualBoolean = iter.hasNext();
        assertEquals(expectedBoolean, actualBoolean);
        
        //Ugur Guclu adlı çalışanın altındaki ilk çalışan Emre Kosar'dır. 
        //Bu nedenle next fonksiyonunun Emre Kosar isimli çalışana ait nesneyi
        //döndürmesi gereklidir.
        iter = d4.iterator();
        Worker expectedWorker = e1;
        Worker actualWokrer = iter.next();
        assertEquals(expectedWorker, actualWokrer);
        
        //Ugur Guclu adlı çalışanın altındaki ikinci çalışan Ahmet Egeli'dir. 
        //Bu nedenle next fonksiyonu bir daha işletildiğinde Ahmet Egeli isimli 
        //çalışana ait nesneyi döndürmesi gereklidir.
        expectedWorker = e2;
        actualWokrer = iter.next();
        assertEquals(expectedWorker, actualWokrer);
           
    }

    /**
     * Test of getArrWorker method, of class Director.
     */
    @Test
    public void testGetArrWorker() {
        Director d1 = new Director("Mustafa Turksever", 5000);
        
        Director d2 = new Director("Halil Sengonca", 4000);
        d1.addWorker(d2);
        
        Director d3 = new Director("Bahar Karaoglan", 3500);
        d1.addWorker(d3);
        
        Director d4 = new Director("Ugur Guclu", 2000);
        d2.addWorker(d4);
        
        Director d5 = new Director("Sedat Tunc", 2500);
        d2.addWorker(d5);
        
        Director d6 = new Director("Oguz Demir", 3000);
        d2.addWorker(d6);
        
        Employee e1 = new Employee("Emre Kosar", 700);
        d4.addWorker(e1);
        
        Employee e2 = new Employee("Ahmet Egeli", 700);
        d4.addWorker(e2);
        
        Employee e3 = new Employee("Bora Kuzey", 1000);
        d5.addWorker(e3);
        
        Employee e4 = new Employee("Onder Bati", 500);
        d6.addWorker(e4);
        
        Employee e5 = new Employee("Erdem Altin", 500);
        d6.addWorker(e5);
        
        Employee e6 = new Employee("Mehmet Bilir", 600);
        d6.addWorker(e6);
        
        //Halil Sengonca isimli direktörün altındaki çalışanlarını tutan
        //dizide Ugur Guclu, Sedat Tunc ve Oguz Demir direktörlerinin
        //bulunması gereklidir. Aynı zamanda bu direktörlere ait
        //çalışanlar her birinin kendisine ait olan dizisinde mevcuttur
        Worker[] expected = {d4,d5,d6};
        Worker[] actual = d2.getArrWorker();
        assertArrayEquals(expected, actual);
    }

    /**
     * Test of setArrWorker method, of class Director.
     */
    @Test
    public void testSetArrWorker() {
        //Bu metot ile ilgili test yazılmamıştır 
    }
    
}
