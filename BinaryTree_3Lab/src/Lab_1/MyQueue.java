/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_1;

import java.util.LinkedList;


/**
 *
 * @author DELL
 */
public class MyQueue {
    LinkedList<BST_Node> L;

    public MyQueue() {
        L= new LinkedList();
    }
    public boolean isEmpty(){
        return L.isEmpty(); 
    }
    public void enqueue(BST_Node node){
        L.add(node);
    }
    public BST_Node dequeue(){
        return L.removeFirst();
    }
}
