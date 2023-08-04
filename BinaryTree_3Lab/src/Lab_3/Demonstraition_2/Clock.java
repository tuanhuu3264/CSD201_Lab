/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3.Demonstraition_2;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Clock {
    String ID=""; 
    String manufacturer=""; 
    int price=0;

    public Clock(String ID, String manu, int price) {
        this.ID=ID; 
        this.manufacturer=manu; 
        this.price=price;
    }
    Scanner sc= new Scanner(System.in);
    public static Comparator comparator = new Comparator(){
        @Override
        public int compare(Object o1, Object o2) {
            return ((Clock)o1).ID.compareTo(((Clock)o2).ID);
        }
        
    };

    Clock(String ID) {
        this.ID=ID;
    }

    Clock() {
        
    }
    public String toString(){
        return ID+", "+manufacturer+", "+price; 
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
}
