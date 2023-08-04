/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3.Demonstraition_2;


/**
 *
 * @author DELL
 */
public class ClockManager1 {
    public static void main(String[] args){
        ClockList list = new ClockList(); 
        list.add(new Clock("SE123","Coca",10)); 
        list.add(new Clock("SE222","Sprite",9));
        list.add(new Clock("SE345","Revire",8)); 
        do{
            int choice=Menu.Menu(); 
            switch(choice)
            {
                case 1: 
                       list.AddNew();
                       break;
                case 2: 
                       list.Search();
                       break;
                case 3: 
                       list.Update();
                       break;
                case 4: 
                       list.Delete();
                       break;
                case 5: 
                       list.output(); 
                       break;
                default: 
                       System.exit(0);
            }
            
        } while(true);
        
       
    }
    
}
