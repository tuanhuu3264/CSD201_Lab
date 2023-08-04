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
public class SumArrray {
    public static double sum(double[] a, int n){
       if(n==0) return 0; else  return sum(a,n-1)+a[n-1]; 
    }
    public static void main(String[] args){
        double[] a={1.5, 2, 4,5,2,6.5,7};
        System.out.println(sum(a,a.length));
    }
}
