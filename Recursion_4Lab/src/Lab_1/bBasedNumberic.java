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
public class bBasedNumberic {
    public static String convert(int n, int base){
        if(n==0) return "0"; 
        return convert(n/base, base) + Character.forDigit(n%base, base); 
    }
    public static void main(String[] args){
        System.out.println("Binary :"+convert(266,2));
        System.out.println("Binary :"+convert(266,10));
        System.out.println("Binary :"+convert(266,8));
        System.out.println("Binary :"+convert(266,16));
    }
}
