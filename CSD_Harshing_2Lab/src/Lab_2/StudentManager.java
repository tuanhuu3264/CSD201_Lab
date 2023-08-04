/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

/**
 *
 * @author DELL
 */
public class StudentManager {
    public static void main(String[] args){
        final String filename="student.txt"; 
        Menu mnu= new Menu(); 
        mnu.add("Add a new Student");
        mnu.add("Search a Student"); 
        mnu.add("Remove a Student"); 
        mnu.add("Update a Student"); 
        mnu.add("Print Student List");
        mnu.add("Save Student List"); 
        mnu.add("Quit");
        int choice;
        StudentList L = new StudentList();
        L.loadFromFile(filename); 
        do{
            System.out.println("STUDENT MANAGER");
            choice=mnu.getUserChoice();
            switch(choice) {
                case 1: L.addStudent(); break; 
                case 2: L.searchStudent(); break;
                case 3: L.removeStudent(); break; 
                case 4: L.updateStudent(); break; 
                case 5: L.print(); break; 
                case 6: L.saveToFile(filename); break;
            }
        } while(choice>=1&&choice<=6);
    }
    
}
