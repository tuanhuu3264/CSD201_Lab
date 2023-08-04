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
public class BST {
    BST_Node root; 
    int noOfNodes=0; 

    public BST() {
        this.root = null;
    }
    public BST_Node add_recur(BST_Node curref, Comparable data)
    {
        if(curref==null){
            curref=new BST_Node(data); 
            noOfNodes++;
        } 
        else { if(data.compareTo(curref.data)<0)
            curref.left=add_recur(curref.left,data);
        else curref.right=add_recur(curref.right,data);
        }
        return curref;
    }
    
    public void add_recur(Comparable data){
        root=add_recur(root, data); 
    }
    public void add_recur(Comparable... group){
        for(Comparable data:group) add_recur(data); 
    }
    public void add_Array(Comparable[] group){
        for(Comparable data: group ) add_recur(data);
    }
    private void printAligned(BST_Node p, int Space)
    {
        if(p!=null){
            for(int i=0;i<Space;i++) System.out.print(" ");
            System.out.println(p.data);
            printAligned(p.left,Space+3); 
            printAligned(p.right,Space+3); 
        }
    }
    public void printAligned()
    {
        if(root==null) System.out.println("Empty Tree");
        else printAligned(root,0);
    }
    public void rotateRight(BST_Node Gr, BST_Node Par, BST_Node Ch){
        if(Par==root) root=Ch; 
                else Gr.right=Ch; 
        Par.left=Ch.right; 
        Ch.right=Par;
             
    }
    public void rotateLeft(BST_Node Gr, BST_Node Par, BST_Node Ch) 
    { 
        if(Par==root && Gr==null) root=Ch; 
                else Gr.right=Ch; 
        Par.right=Ch.left; 
        Ch.left=Par;
    }
    
    public void createBackbone(){
        BST_Node Gr=null, Par=root, leftChild; 
        while(Par!=null){
            while(Par.left!=null){
                leftChild=Par.left;
                rotateRight(Gr,Par,leftChild); 
                Par=leftChild; 
            }
            Gr=(Gr==null)? root: Gr.right;
            Par=Par.right;
                
        }
    }
    private double log2(double x){
         return Math.log(x)/Math.log(2);
    }
    private int heightPefectBalancedTree(int noOfNodes){
        return (int)log2(noOfNodes+1); 
    }
    private int sizeOfPefectBalancedTree(int H){
        return (int)(Math.pow(2, H)-1);
    }
    void createBalancedTree(){
        int H=this.heightPefectBalancedTree(noOfNodes); 
        int pefectSize=this.sizeOfPefectBalancedTree(H); 
        int extraNodes= noOfNodes-pefectSize; 
        BST_Node Gr=null, Par=root, rightChild= Par.right;
        for(int i=0; i<extraNodes;i++){
            rotateLeft(Gr,Par,rightChild); 
            Gr=rightChild; 
            Par=Gr.right; 
            if(Par!=null) rightChild=Par.right; 
            else rightChild=null;
        }
        Gr=root; 
        while(pefectSize>1){
              pefectSize /=2; 
              Gr=null; Par=root;rightChild= Par.right;
        for(int i=0; i<extraNodes;i++){
            if(rightChild!=null){
            rotateLeft(Gr,Par,rightChild); 
            Gr=rightChild; 
            Par=Gr.right; 
            if(Par!=null) rightChild=Par.right; 
            else rightChild=null;
        }
        }
    }
}
    public void DSW_Balanced(){
        if(root!=null){
            this.createBackbone();
            this.createBalancedTree();
        }
    }
}
