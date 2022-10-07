/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author alper
 */
public class Employee extends Worker{
    
    public Employee(String name, int salary){
        super(name,salary);
        
    }
  
    public void printInfo(){
        System.out.println("Name: " + getName() + " Salary: " + getSalary());
    }
    
    public int getCost(){
        return getSalary();
    }
    
    //Sadece isim ile aranan çalışanın bu nesne olup olmadığına bakılır
    public Worker getWorkerWithFirstName(String name){
        if(name.equalsIgnoreCase(this.getName().split(" ")[0])){
            return this;
        }
        return null;
    }
   
    //Ad soyad ile aranan çalışanın bu nesne olup olmadığına bakılır
    public Worker getWorkerWithFullName(String name){
        if(name.equalsIgnoreCase(this.getName())){
            return this;
        }
        return null;
    }
    
    //Employee'nin altına bir çalışan eklenmeye çalışılırsa hata mesajı verilir ve program
    //sonlandırılır
    public void addWorker(Worker worker){
       System.out.println("Can not add worker to "+ getName());
       System.exit(0);
   }
    
}
