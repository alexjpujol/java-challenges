package autounboxing;

import java.util.ArrayList;


public class Customer {

    protected String name;
    protected ArrayList<Double> transactions;

    Customer(String name) {
        this.name = name;
    }

    Customer(String name, double transaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.transactions.add(transaction);
    }

    public void showTransactions() {
        for (int i = 0; i < transactions.size(); i++) {
            double value = transactions.get(i);
            System.out.println(value);
        }
    }

    public String toString() {
        return this.name + " is my name!";
    }

    public void addTransaction(double value) {
        this.transactions.add(value);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
