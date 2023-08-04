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
public class BST_Node {
    AquariumFish fish; 
    BST_Node left=null, right=null;

    public BST_Node(AquariumFish fish) {
        this.fish = fish;
        left=right=null;
    }
    
}
