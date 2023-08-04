/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

/**
 *
 * @author DELL
 */
public class GeometricProgression {
       public static double gp (int n, double a, double d){
        if(n==1) return a; 
        else return gp(--n,a*d,d); 
    }
    public static void main(String[] args){
        System.out.println(gp(6,1.5,2));
    }
}
