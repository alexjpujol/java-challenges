package autounboxing;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            Branch branch = new Branch(branchName);
            this.branches.add(branch);
            System.out.println("Branch added.");
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch targetBranch = this.branches.get(i);
            if (branchName.equals(targetBranch.name)) {
                return targetBranch;
            }
        }
        return null;
    }


    public boolean addCustomerToBranch(String custName, double transaction, String branchName) {
        //via an initial transaction
        Branch targetBranch = findBranch(branchName);
        if(targetBranch != null) {
            System.out.println(custName + " added to branch " + branchName + " with a " + transaction + " transaction value");
            return targetBranch.newCustomer(custName, transaction);
        }
        System.out.println("That branch doesn't exist!");
        return false;
    }

    public boolean addCustomerTransaction(String custName, String branchName, double value) {
        Branch targetBranch = findBranch(branchName);
        if(targetBranch != null) {
            targetBranch.customerTransaction(custName, value);
            System.out.println(custName + " recorded a transaction of " + value);
            return targetBranch.customerTransaction(custName, value);
        }
        return false;
    }

    public boolean showCustomers(String branchName) {

        Branch targetBranch = findBranch(branchName);
        if (targetBranch != null) {
            System.out.println(targetBranch.getCustomerNames());
            return true;
        }
        System.out.println("That branch doesn't exist!");
        return false;
    }

    public boolean showCustTransactions(String branchName, String custName) {
        Branch targetBranch = findBranch(branchName);
        if (targetBranch != null) {
            if (targetBranch.findCustomer(custName) != null) {
                targetBranch.showCustomerTransactions(custName);
                return true;
            }
            return false;
        }
        System.out.println("Branch doesn't exist! showCustTransactions()");
        return false;
    }

    public void showBranches() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println(this.branches.get(i).name);
        }
    }
}
