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
public class Menu {
    public static int Menu(){
        int menu;
        System.out.println("    Student Manager");
        System.out.println("========================");
        System.out.println("1-Add a new student");
        System.out.println("2-Search a student");
        System.out.println("3-Update a student");
        System.out.println("4-Remove a student");
        System.out.println("5-Output all students");
        System.out.println("Other-Quit");
        do{ Scanner me= new Scanner(System.in);
            try{
                System.out.print("Your choice: ");
                menu=me.nextInt(); 
                return menu;
            } catch(Exception e)
            {
                System.out.println(e);
                System.out.println("Please enter again!");
            }
            
        } while(true);
    }
}
