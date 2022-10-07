/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package project;

/**
 *
 * @author alper
 */

//Sadece direktörün atındaki çalışanları dolaşmak için gerekli olan metotlar yazılmıştır
public interface Iterator {
    public boolean hasNext(); //dizide sonraki elemanın olup olmadığına bakar
    public Worker next(); //dizideki elemanı döndürür ve bir sonraki elemanı işaret eder
}
