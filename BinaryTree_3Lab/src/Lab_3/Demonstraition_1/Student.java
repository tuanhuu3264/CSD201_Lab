/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3.Demonstraition_1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student implements Comparable  {
     String ID=""; 
     String name=""; 
     int mark=0; 
     Scanner sc= new Scanner(System.in); 
    public Student(String ID) {
        this.ID=ID; 
    }
    public Student(String ID, String name, int mark){
          this.ID=ID; 
          this.name=name; 
          this.mark=mark; 
    } 

   public  Student() {
        
    }
    @Override
    public int compareTo(Object o) {
        return ID.compareTo(((Student)o).ID);
    }
    @Override
    public String toString(){
        return ID+", "+name+", "+mark;
    }
}
