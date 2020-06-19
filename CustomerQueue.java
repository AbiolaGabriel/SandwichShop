import java.util.*;
/**
 * Write a description of class CustomerQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CustomerQueue extends PriorityQueue<Customer> implements Customers<Customer>{
    public CustomerQueue(){
        super();
    }

    public CustomerQueue(ArrayList<Customer> arr){
        super(arr);
    }

    @Override
    public boolean add(Customer c){        
        return super.add(c);
    }


    @Override
    public Customer pop(){
        return super.poll();
    }

    @Override
    public boolean isEmpty(){
        if(super.size() == 0){
            return true;
        }
        return false;
    }

}
