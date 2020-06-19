import java.util.*;
/**
 * Write a description of class Shop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shop{
    int startTime;
    Customers c;
    public Shop(Customers<Customer> c, int startTime, int size){
        if(c instanceof CustomerQueue){
            this.c = new CustomerQueue();
            boolean running = true;
            //ArrayList<Customer> y = new ArrayList();
            //Customers<Customer> a = new CustomerQueue();
            //CustomerArray b = new CustomerArray(180);
            int count = 0;
            int arrival = 0;
            int orderingTime = 0;
            int giveUpTime = 0;
            while(running){
                arrival = (int)(Math.random() * ((179-0)+1))+0;
                orderingTime = (int)(Math.random() * ((5-2)+1))+2;
                giveUpTime = (int)(Math.random() * ((30-5)+1))+5;
                //Customer c = new Customer(index, b, count*5);
                c.add(new Customer(arrival, orderingTime, giveUpTime));
                //b.add(new Customer(arrival, orderingTime, giveUpTime));
                count++;
                if(count == 100){
                    running = false;
                }
            }
        }
        else if(c instanceof CustomerArray){
            this.c = new CustomerArray(size);
            boolean running = true;
            //ArrayList<Customer> y = new ArrayList();
            //Customers<Customer> a = new CustomerQueue();
            //CustomerArray b = new CustomerArray(180);
            int count = 0;
            int arrival = 0;
            int orderingTime = 0;
            int giveUpTime = 0;
            while(running){
                arrival = (int)(Math.random() * ((179-0)+1))+0;
                orderingTime = (int)(Math.random() * ((5-2)+1))+2;
                giveUpTime = (int)(Math.random() * ((30-5)+1))+5;
                //Customer c = new Customer(index, b, count*5);
                c.add(new Customer(arrival, orderingTime, giveUpTime));
                //b.add(new Customer(arrival, orderingTime, giveUpTime));
                count++;
                if(count == 100){
                    running = false;
                }
            }
            this.startTime = startTime;
        }
    }

    //runs CustomerQueue
    public String run(){
        int customerNum = 0;
        String total = "";
        int countServed = 0;
        long avgWait = 0;
        Customer temp = null;
        while(startTime<=180){
            //System.out.println(c.pop());
            //System.out.println(c.isEmpty());
            //total += c.pop();
            temp = (Customer)this.c.pop();
            customerNum++;
            if((temp.getArrival() + temp.getGiveUp()) <= temp.getOrderingTime()){
                countServed++;
                temp.setServed(true);
                temp.setLeft(true);
                avgWait = avgWait + temp.getOrderingTime();
                System.out.println("Customer "+customerNum+" has been served");
            }
            System.out.println("This is customer "+customerNum);
        }
        if(countServed == 0){
            avgWait = 0;
        }
        else{
            avgWait = (avgWait/countServed);
        }
        total = countServed+", "+avgWait;
        return total;
    }

    //runs CustomerArray
    // public String runArr(CustomerArray c){
    // int customerNum = 0;
    // String total = "";
    // int countServed = 0;
    // long avgWait = 0;
    // Customer temp = null;
    // while(startTime<180){
    // //System.out.println(c.pop());
    // //System.out.println(c.isEmpty());
    // //total += c.pop();
    // temp = (Customer)c.pop();
    // customerNum++;
    // if((temp.getArrival() + temp.getGiveUp()) <= temp.getOrderingTime()){
    // countServed++;
    // temp.setServed(true);
    // temp.setLeft(true);
    // avgWait = avgWait + temp.getOrderingTime();
    // System.out.println("Customer "+customerNum+" has been served");
    // }
    // System.out.println("This is customer "+customerNum);
    // }
    // if(countServed == 0){
    // avgWait = 0;
    // }
    // else{
    // avgWait = (avgWait/countServed);
    // }
    // total = countServed+", "+avgWait;
    // return total;
    // }

    public static void main(String [] args){
        //CustomerQueue a = new CustomerQueue();
        boolean running = true;
        //ArrayList<Customer> y = new ArrayList();
        Customers a = new CustomerQueue();
        //CustomerArray b = new CustomerArray(180);
        Shop one = new Shop(a, 0, 100);
        //Shop two = new Shop(b, 0);
        //System.out.println(a.isEmpty());
        System.out.println(one.run());
        //System.out.println(two.run());
        //System.out.println(a.isEmpty());
    }
}

