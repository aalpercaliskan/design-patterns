/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author alper
 */
public abstract class Worker {
    private String name;
    private int salary;
 
    public Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    
    public abstract void printInfo();
    public abstract int getCost();
    public abstract Worker getWorkerWithFirstName(String name);
    public abstract Worker getWorkerWithFullName(String name);
    public abstract void addWorker(Worker worker);
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
