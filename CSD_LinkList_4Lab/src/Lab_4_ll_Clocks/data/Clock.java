/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4_ll_Clocks.data;

/**
 *
 * @author DELL
 */
public class Clock implements Comparable<Clock>{
    String ID; 
    int guarantee; 
    double price; 
    public Clock(String ID, int guarantee, double price)
    {
        this.ID=ID;
        this.guarantee=guarantee; 
        this.price=price;
    }
    public Clock(String ID){
        this.ID=ID; 
    }
    @Override
    public int compareTo(Clock o) {
       double d= this.price-o.price; 
       return d>0?1:d<0?-1:ID.compareTo(o.ID); 
    }
    
    public boolean equals(Object obj){
        Clock clk=(Clock)obj; 
        return this.ID.equals(clk.ID); 
    }
    public String toString(){
        return ID+", "+guarantee+", "+price; 
    }
    public void setGuarantee(int guarantee){
        if(guarantee>-0) this.guarantee=guarantee; 
    }
    public void setPrice(double price){
        if(price>=0) this.price=price; 
    }
    
}
