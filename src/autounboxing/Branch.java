package autounboxing;

import java.util.ArrayList;

public class Branch {

    protected String name;
    protected ArrayList<Customer> customers;

    Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " is the branch!";
    }

    public Customer getCustomers() {
        for (Customer customer: customers) {
            return customer;
        };
        return null;
    }

    public boolean newCustomer(String custName, double value) {
        this.customers.add(new Customer(custName, value));
        return true;
    }

    public Customer findCustomer(String custName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (custName.equals(this.customers.get(i).name)) {
                return this.customers.get(i);
            }
        }
        System.out.println("That customer doesn't exist");
        return null;
    }

    public boolean customerTransaction(String custName, double value) {
        if (findCustomer(custName) != null) {
            Customer targetCustomer = findCustomer(custName);
            targetCustomer.addTransaction(value);
            return true;
        }
        return false;
    }

    public boolean showCustomerTransactions(String custName) {
        Customer targetCustomer = findCustomer(custName);
        if (targetCustomer != null) {
            for (int i = 0; i < targetCustomer.transactions.size(); i++) {
                System.out.println(targetCustomer.transactions.get(i));
            }
            return true;
        }
        return false;
    }

    public String getCustomerNames() {
        for (Customer customer: customers) {
            return customer.name;
        };
        return null;
    }

}
