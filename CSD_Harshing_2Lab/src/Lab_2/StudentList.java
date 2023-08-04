/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class StudentList extends Hashtable<String,Student> {
    Scanner sc= new Scanner(System.in); 
    public StudentList(){
        super(); 
    }
    public boolean loadFromFile(String filename){
        try{
            FileInputStream fi = new FileInputStream(filename);
            InputStreamReader isr=new InputStreamReader(fi);
            BufferedReader br= new BufferedReader(isr);
            String line; 
            while((line=br.readLine())!=null){
                line=line.trim(); 
                String[] ar = line.split("[,]"); 
                if(ar.length==3) {
                    Student st= new Student(ar[0],ar[1],Integer.parseInt(ar[2].trim()));
                    this.put(st.code, st);
                }
            }
            br.close();
            isr.close();
            fi.close();
            return true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean saveToFile(String filename){
        try{
            FileOutputStream fo= new FileOutputStream(filename);
            OutputStreamWriter osw= new OutputStreamWriter(fo); 
            PrintWriter pw= new PrintWriter(osw); 
            Iterator<String> it= this.keySet().iterator();
            while (it.hasNext()){
                String key=it.next(); 
                Student st= this.get(key); 
                pw.println(st);
            }
            pw.close();
            osw.close();
            fo.close();
            return true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return false; 
    }
    public Student search(String code){
        return this.get(code);
    }
    public void addStudent(){
        String code, name; 
        int mark; 
        boolean cont=true;
        do{
          System.out.print("ENTER The Code of new Student: ");
          code=sc.reset().nextLine().trim().toUpperCase(); 
          cont=(search(code)!=null);
          if(cont) System.out.println("The Code is Dupplicated");
        } while(cont);
        System.out.print("ENTER The Name of new Student: ");
          name=sc.reset().nextLine().trim().toUpperCase();
          System.out.print("ENTER The Mark of new Student: ");
          mark=Integer.parseInt(sc.reset().nextLine().trim());
          this.put(code, new Student(code,name,mark));
          System.out.println("New student "+code+" has been added");
    }
    public void searchStudent(){
        String code; 
        if(this.isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        System.out.print("Enter the student need to search: ");
        code=sc.reset().nextLine().toUpperCase().trim(); 
        Student st= this.search(code);
        if(st==null) System.out.println("Have no student "+code);
        else System.out.println(st);
    }
    public void removeStudent(){
        String code; 
        if(this.isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        System.out.print("Enter the student need to remove: ");
        code=sc.reset().nextLine().toUpperCase().trim(); 
        Student st= this.search(code);
        if(st==null) System.out.println("Have no student "+code);
        else {
            this.remove(code); 
            System.out.println("The Student "+code+" has been removed");
    }
    }
    public void updateStudent(){
        String code; 
        if(this.isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        System.out.print("Enter the student need to update: ");
        code=sc.reset().nextLine().toUpperCase().trim(); 
        Student st= this.search(code);
        if(st==null) System.out.println("Have no student "+code);
        else st.update();
    }
    public void print(){
         if(this.isEmpty()) {
            System.out.println("Empty List");
            return;
        }
         ArrayList<Student> list= new ArrayList();
         list.addAll(this.values()); 
         Collections.sort(list);
         for(Student st:list)
             System.out.println(st);
    }
    
}
