
/**
 * Write a description of interface CustomerInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Customers<Customer>{
    boolean add(Customer c);
    boolean isEmpty();
    Customer pop();
}
