package autounboxing;

public class RunIt {

    public static void main(String[] args) {
        Bank chase = new Bank("Chase");
        chase.addBranch("2nd Ave");
        chase.showBranches();
        chase.addCustomerToBranch("Juanito", 5.0, "2nd Ave");
        chase.showCustomers("2nd Ave");
        chase.addCustomerTransaction("Juanito", "2nd Ave", 1000);
        chase.showCustTransactions("2nd Ave", "Juanito");

    }
}
