/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3.Demonstraition_1;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author DELL
 */
public class StudentList extends TreeSet<Student> {
    public StudentList(){
        super(); 
    }
    public Student search(String ID){
        return this.ceiling(new Student(ID)).ID.equals(ID) ? this.ceiling(new Student(ID)) : null;
    }
    public void output(){
        Iterator it=this.iterator(); 
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void AddNew()
    {   Student st=new Student();
        Scanner ic=new Scanner(System.in); 
        System.out.print("ID: ");
        st.ID= ic.nextLine(); 
        System.out.print("Name: ");
        st.name= ic.reset().nextLine();
        System.out.print("Mark: ");
        st.mark=ic.reset().nextInt();
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
        Student pr= search(id); 
        if(pr==null) System.out.println("Have no student id: "+id);
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
        String id= ic.nextLine();
        this.remove( search(id)); 
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
        Student b=search(id); 
        if(b==null) System.out.println("Have no student id: "+id);
        else { 
        System.out.print("Name: ");
        b.name= ic.reset().nextLine();
        System.out.print("Mark: ");
        b.mark=ic.reset().nextInt();    
        }
    }
    
}
