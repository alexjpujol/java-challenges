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
            targetBranch.newCustomer(custName, transaction);
            System.out.println(custName + " added to branch " + branchName + " with a " + transaction + " transaction value");
            return true;
        }
        System.out.println("That branch doesn't exist!");
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

    public void showBranches() {
        for (int i = 0; i < this.branches.size(); i++) {
            System.out.println(this.branches.get(i).name);
        }
    }
}
