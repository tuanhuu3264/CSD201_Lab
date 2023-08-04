/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk_que;

import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author DELL
 */
public class PrefixEvaluator {
    public static boolean isOperator(String S){
        return (S.equals("+")||S.equals("-")||S.equals("*")||S.equals("/")); 
    }
    
    public static double evaluate(String op, double n1, double n2){
        if(op.equals("+")) return n1+n2; 
        if(op.equals("-")) return n1-n2;
        if(op.equals("*")) return n1*n2;
        if(op.equals("/")) {
            if(n2==0) throw new RuntimeException("Divide by 0!"); 
            return n1/n2; 
        }
        throw new RuntimeException("Operation is not supported!"); 
        
    }
    public static double evaluatePost(String exp){
        double result=0; 
        StringTokenizer stk= new StringTokenizer(exp, "() ");
        Stack<Double> stack = new Stack();
        double n1 , n2; 
        while(stk.hasMoreElements()){
            String part= stk.nextToken(); 
            if(!isOperator(part)) stack.push(Double.parseDouble(part)); 
            else {
                n2=stack.pop(); 
                n1=stack.pop(); 
                result =evaluate(part, n1, n2); 
                stack.push(result); 
            }
            
        }
        return result;
    }
    public static String PreToPost(String exp)
    {    exp=exp.replace('(',' ');
         exp=exp.replace(')', ' ');
         Stack<String> stack = new Stack<String>(); 
    String[] result = exp.split("[\\s]+");
    int l = result.length; 
    for(int i = l-1; i >= 0; i--){ 
        if(isOperator(result[i])){ 
  
            String op1 = stack.peek(); 
            stack.pop();
            String op2 = stack.peek(); 
            stack.pop(); 
  
            String temp = op1 + " " + op2 + " " + result[i]; 
  
            stack.push(temp); 
        } 
        else{ 
            stack.push(result[i]); 
        } 
    } 
  
    return stack.peek(); 
    }
    public static double evaluatePre(String exp)
    {
        return evaluatePost(PreToPost(exp));
    }

        
    
    public static void main(String[] args){

        String exp="+ - *(2)(2)/(16)(8)(5)";
        System.out.println(evaluatePre(exp));
    
    }
}
