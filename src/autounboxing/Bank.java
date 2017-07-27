package autounboxing;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public void addBranch(String name) {
        Branch branch = new Branch(name);
        branches.add(branch);
    }

    public void addCustomerToBranch(Customer customer, double transaction) {
        //via an initial transaction

    }

    public void addTransaction() {

    }

    public void showCustomers() {

    }

    public void showBranches() {
        for (int i = 0; i < branches.size(); i++) {
            branches.get(i).toString();
        }
    }
}
