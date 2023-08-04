/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class EightQueensProblem {
    public static boolean valid(int D[], int i, int pos){
        if(i==0) return true; 
        for(int j=i-1;j>=0;j--) {
            int dRow= i-j; 
            int dCol=pos-D[j]; 
            if(dCol<0) dCol=-dCol; 
            if(dCol==0 || dRow==dCol) return false; 
            
        }
        return true;
    }
    public static String toString(int D[], int n){
        StringBuilder result= new StringBuilder();
        result.append('['); 
        for(int i=0;i<n;i++){
            result.append('(');
            result.append(i);
            result.append(',');
            result.append(D[i]);
            result.append(')');
            result.append(' ');
        }
        result.append("]"); 
        return result.toString();
    }
    public static int[] copy(int[] D,int n){
        int[] D2 = new int[n]; 
        for(int i=0;i<n;i++) D2[i]=D[i]; 
        return D2;
    }
    public static void backtrack(int i, int D[], int n, ArrayList<int[]> solutions){
        for(int pos=0; pos<8; pos++) {
            if(valid(D,i,pos)) {
                D[i]=pos; 
                if(i==n-1) solutions.add(copy(D,n)); 
                else backtrack(i+1, D, n, solutions); 
            }
        }
    }
    
    public static ArrayList<int[]> backtrack(int n){
        int[] D= new int[n]; 
        ArrayList<int[]> solutions = new ArrayList(); 
        backtrack(0,D,n,solutions); 
        return solutions;
    } 
    public static void printSols(ArrayList<int[]> solutions, int n){
        if(solutions.isEmpty()) System.out.println("No solutions!"); 
        else {
            for(int[] sol:solutions) System.out.println(toString(sol,n)); 
            System.out.println("*********************************");
            System.out.println(solutions.size()+" solutions");
            
        }
    }
    public static void main(String[] args){
        int nQueens=8; 
        ArrayList<int[]> solutions = backtrack(nQueens); 
        printSols(solutions, nQueens);
    }
    
    
    
}
