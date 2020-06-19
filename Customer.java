
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer implements Comparable<Customer>{
    private int arrival, orderingTime, giveUpTime;
    private boolean served, left;
    
    public Customer(int arrival, int orderingTime, int giveUpTime){
        this.arrival = arrival;
        this.orderingTime = orderingTime;
        this.giveUpTime = giveUpTime;
        this.served = false;
        this.left = false;
    }
    
    public int getArrival(){
        return this.arrival;
    }
    
    public int getOrderingTime(){
        return this.orderingTime;
    }
    
    public int getGiveUp(){
        return this.giveUpTime;
    }
    
    public void setServed(boolean x){
        this.served = x;
    }
    
    public void setLeft(boolean x){
        this.left = x;
    }
    
    public int compareTo(Customer c){
        if (this.arrival > c.arrival){
            return 1;
        }
        
        else if(this.arrival < c.arrival){
            return -1;
        }
        return 0;
    }
}
