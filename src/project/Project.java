/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
/**
 *
 * @author alper
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Parser parser = new TxtParser("girdi.txt");
        Worker root = parser.setDataAndGetRoot();
        
        try{
            Worker w = root.getWorkerWithFullName("Mustafa Turksever");
            System.out.println("Cost(Mustafa Turksever): " + w.getCost());
            System.out.println("list of employees(Mustafa Turksever):");
            w.printInfo();
            System.out.println("\n");
        
            w = root.getWorkerWithFullName("Oguz Demir");
            System.out.println("Cost(Oguz Demir): " + w.getCost());
            System.out.println("list of employees(Oguz Demir):");
            w.printInfo();
            System.out.println("\n");
        
            w = root.getWorkerWithFullName("Ahmet Egeli");
            System.out.println("Cost(Ahmet Egeli): " + w.getCost()); 
        }
        catch(NullPointerException e){
            System.out.println("There is no worker in wanted name");
        }
             
    }
    
}
