/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maze_ver2;

import java.io.IOException;

/**
 *
 * @author DELL
 */
public class MyMaze01 {
   public static void main(String[] args) throws IOException
   {
       String filename="maze01.txt"; 
       Maze_V2 maze= new Maze_V2('E','M','0','1'); 
       maze.loadFromFile(filename); 
       maze.print();
       maze.solve(); 
       if(maze.succeeded) {
           System.out.println("Result path:"); 
           System.out.println(maze.getPath());
       } else System.out.println("Failed!");
   }
}
