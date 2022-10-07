/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author alper
 */
public class TxtParser implements Parser{
    
    private String fileName;
    private Worker root;
    
    public TxtParser(String fileName){
        this.fileName = fileName;
    }
    
    public Worker setDataAndGetRoot(){
        this.setData();
        return getRoot();
    }
    
    public void setData(){
        BufferedReader br;
        String line = null;
        try{
            br = new BufferedReader(new FileReader(getFileName()));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
            
                if(values[0].equals("D")){
                    Worker worker = new Director(values[1],Integer.parseInt(values[2]));
                    String dirName = values[3];
                    if(dirName.equalsIgnoreCase("root")){
                        setRoot(worker);
                    }
                    else{
                        try{
                            Worker w = getRoot().getWorkerWithFirstName(dirName);
                            w.addWorker(worker);
                        }
                        catch(NullPointerException e){
                            System.out.println("There is no director with name " + dirName);
                            System.exit(0);
                        }
                    }                              
                }
                else if(values[0].equals("M")){
                    Worker worker = new Employee(values[1],Integer.parseInt(values[2]));
                    String dirName = values[3];
                    
                    try{
                        Worker w = getRoot().getWorkerWithFirstName(dirName);
                        w.addWorker(worker);
                        }
                    catch(NullPointerException e){
                        System.out.println("There is no director with name " + dirName);
                        System.exit(0);
                    }
                }
            }
        br.close();
        }
        catch (Exception e){
            System.out.println("There is no file with name " + fileName);
            System.exit(0);
        }          
    }
     
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Worker getRoot() {
        return root;
    }

    public void setRoot(Worker root) {
        this.root = root;
    }
}
