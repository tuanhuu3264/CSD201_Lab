/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4_ll_Clocks.tools;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu extends ArrayList<String> {
    static Scanner sc = new Scanner(System.in); 
    public Menu(){
        super(); 
    }
    public int getChoice(){
        int i=1; 
        for(String option: this){
            System.out.println((i++)+"-"+option);
        }
        System.out.println("Choose: ");
        return Integer.parseInt(sc.nextLine()); 
    }
    
}
