public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Bank");

        //  Add branches
        bank.addBranch("Chennai");
        bank.addBranch("Mumbai");

        //  Add customers with initial deposit
        bank.addCustomer("Chennai", "Alice", 1000.0);
        bank.addCustomer("Chennai", "Bob", 2000.0);
        bank.addCustomer("Mumbai", "Charlie", 1500.0);

        //  Add transactions
        bank.addCustomerTransaction("Chennai", "Alice", 500.0);
        bank.addCustomerTransaction("Chennai", "Bob", -200.0);
        bank.addCustomerTransaction("Mumbai", "Charlie", 300.0);

        // List customers with transactions
        bank.listCustomers("Chennai", true);
        bank.listCustomers("Mumbai", true);
    }
}
