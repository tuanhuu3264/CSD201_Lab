/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3.Demonstraition_2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class ClockList extends TreeSet<Clock> {

    public ClockList() {
        super(Clock.comparator);
    }
    public Clock search(String ID){
        return this.ceiling(new Clock(ID)).ID.equals(ID) ? this.ceiling(new Clock(ID)) : null;
    }
    public void output(){
        Iterator it=this.iterator(); 
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
     public void AddNew()
    {   Clock st=new Clock();
        Scanner ic=new Scanner(System.in); 
        System.out.print("ID: ");
        st.setID(ic.nextLine()); 
        System.out.print("Manu: ");
        st.setManufacturer(ic.reset().nextLine());
        System.out.print("Price: ");
        st.setPrice(ic.reset().nextInt());
        this.add(st);
    }
    public void Search()
    {   if(this.isEmpty()) {
        System.out.println("Empty Tree");
        return;
    }
        Scanner ic=new Scanner(System.in);
        System.out.print("ID: ");
        String id= ic.nextLine();
        Clock pr= search(id); 
        if(pr==null) System.out.println("Have no clock id: "+id);
        else {
            System.out.println("The result: "+pr.toString());
        }
        
    }
    
    public void Delete()
    {
        if(this.isEmpty()) {
            System.out.println("Empty Tree");
            return;
        }
        Scanner ic=new Scanner(System.in);
        System.out.print("ID: ");
        String id = ic.nextLine();
        this.remove(search(id)); 
    }
    public void Update()
    {
         if(this.isEmpty()) {
            System.out.println("Empty Tree");
            return;
        }
         Scanner ic=new Scanner(System.in);
        System.out.print("ID: ");
        String id= ic.nextLine();
        Clock st=search(id); 
        if(st==null) System.out.println("Have no clock id: "+id);
        else { 
        System.out.print("Manu: ");
        st.setManufacturer(ic.reset().nextLine());
        System.out.print("Price: ");
        st.setPrice(ic.reset().nextInt());        }
    }
    
}
