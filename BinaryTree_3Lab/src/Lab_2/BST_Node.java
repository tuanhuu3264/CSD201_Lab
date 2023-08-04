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
public class BST_Node {
    Comparable data; 
    BST_Node left, right=null; 
    public BST_Node(Comparable data){
        this.data=data; 
        left=right=null;
    }
}
