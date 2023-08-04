/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze_ver2;

/**
 *
 * @author DELL
 */
public class Cell_V2 {
    int col, row; 
    char value; 
    boolean blocked= false; 
    boolean visited= false; 
    Cell_V2 previous= null; 
    public Cell_V2(int row, int col, char value)
    {
        this.row=row; 
        this.col=col; 
        this.value=value; 
    }
    public void setBlock()
    {
        this.blocked=true; 
    }
    public boolean canBeVisited(){
        return !this.blocked&&!this.visited;
    }
    @Override
    public String toString(){
        return "("+row+", "+col+", "+value+")";
    }
}
