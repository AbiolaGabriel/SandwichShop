import java.util.*;
/**
 * Write a description of class CustomerArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerArray implements Customers<Customer>{
    private ArrayList<Customer> [] arr;
    private int currentTime = 0;
    public CustomerArray(int length){
        this.arr = new ArrayList[length];
        for(int i = 0; i<length; i++){
            this.arr[i] = new ArrayList<Customer>();
        }
    }

    @Override
    public boolean add(Customer c){
        return this.arr[c.getArrival()].add(c);
    }

    @Override
    public boolean isEmpty(){
        int count = 0;
        for(ArrayList i: this.arr){
            if(i.size() == 0){
                count++;
            }
        }
        if(count == this.arr.length){
            return true;
        }
        return false;
    }

    @Override
    public Customer pop(){
        if(this.arr[this.currentTime].size() == 0){
            this.currentTime++;
            return null;
        }
        Customer temp = this.arr[this.currentTime].get(0);
        this.arr[this.currentTime].remove(0);
        return temp;
    }
}
