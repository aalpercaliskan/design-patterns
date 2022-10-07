/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author alper
 */
public class Director extends Worker{

    //Direktörün altındaki çalışanları tutmak için bir array
    private Worker[] arrWorker = new Worker[0];
    
    public Director(String name, int salary){
        super(name,salary);
    }
    
    //Direktörün altında çalışan yeni bir çalışan ekleneceği zaman direktöre 
    //ait dizinin boyutu bir arttırılır
    private  Worker[] extendArraySize(){
        Worker[] temp = new Worker[this.getArrWorker().length + 1];
        for(int i = 0; i < getArrWorker().length; i++){
            temp[i] = getArrWorker()[i];
        }                
        return temp;
}
    
    //Direktörün altına çalışan eklemeyi sağlar
    public void addWorker(Worker worker){  
        this.setArrWorker(extendArraySize());
        arrWorker[arrWorker.length-1] = worker;    
    }
    
    //Sadece isim ile ilgili çalışanı bulmayı sağlar
    public Worker getWorkerWithFirstName(String name){
        Worker searchedWorker = null;
        Iterator iter = iterator();
        
        //Aranan çalışan bu nesne ise bu nesne döndürülür
        //Aksi halde bu çalışandan başlanarak altındaki çalışanlara tek tek bakılır
        if(name.equalsIgnoreCase(this.getName().split(" ")[0])){
            return this;
        }
        else{  
            while(iter.hasNext()){
                Worker worker = iter.next();
                if(worker.getName().split(" ")[0].equalsIgnoreCase(name)){    
                    searchedWorker = worker;    
                    break;
                } 
                searchedWorker = worker.getWorkerWithFirstName(name);  
                if(searchedWorker != null){
                    return searchedWorker;
                }     
            }     
        }
        return searchedWorker;   
    }
    
    //Ad soyad ile ilgili çalışanı bulmayı sağlar
    public Worker getWorkerWithFullName(String name){
        Worker searchedWorker = null;
        Iterator iter = iterator();
        
        //Aranan çalışan bu nesne ise bu nesne döndürülür
        //Aksi halde bu çalışandan başlanarak altındaki çalışanlara tek tek bakılır
        if(name.equalsIgnoreCase(this.getName())){
            return this;
        }
        else{  
            while(iter.hasNext()){
                Worker worker = iter.next();
                if(worker.getName().equalsIgnoreCase(name)){    
                    searchedWorker = worker;    
                    break;
                }
                searchedWorker = worker.getWorkerWithFullName(name);  
                if(searchedWorker != null){
                    return searchedWorker;
                }     
            }             
        }
        return searchedWorker;          
    }
    
    //Bu çalışan ve altındaki diğer çalışanlar yazdırılır
    public void printInfo(){
        System.out.println("Name: " + getName() + " Salary: " + getSalary());
        Iterator iter = iterator();
        while(iter.hasNext()){
            Worker w = iter.next();
            w.printInfo();    
        }
    }
    
    //Bu çalışanın maliyeti kendisi ve altında çalışanların maliyetleri
    //toplamı kadardır
    public int getCost(){
        int cost = getSalary();
        Iterator iter = iterator();
        while(iter.hasNext()){
            Worker w = iter.next();
            cost += w.getCost();
        }
        return cost;
    }
    
    //Iterator oluşturmak için kullanılır
    public Iterator iterator(){
        return new WorkerIterator();
    }
    
    //Direktörlerin altındaki çalışanları dolaşmak için WorkerItetor sınıfı oluşturulmuştur
    private class WorkerIterator implements Iterator{
        private int current;
        
        public WorkerIterator() {
            current = 0;
        }
        
        public boolean hasNext(){
            return current < arrWorker.length;
        }
        
        public Worker next(){
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return arrWorker[current++];
        }
    }
    
    //Direktöre ait altındaki çalışanları tutan dizi döndürülür
    public Worker[] getArrWorker() {
        return arrWorker;
    }
    
    public void setArrWorker(Worker[] arrWorker) {
        this.arrWorker = arrWorker;
    }
   
    
    
    
    
    
    
    
    
}
