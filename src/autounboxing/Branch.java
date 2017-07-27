package autounboxing;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    Branch(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name + " is the branch!";
    }

}
