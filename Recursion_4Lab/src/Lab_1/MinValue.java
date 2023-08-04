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
public class MinValue {
    public static double min(double[] a, int n)
    {
        if(n==1) return a[0]; 
        else return min(a,n-1) < a[n-1] ? min(a, n-1) : a[n-1]; 
    }
    
    public static void main(String[] args){
        double[] a={1,5,9,7,2,10,19}; 
        System.out.println(min(a,7));
    }
}
