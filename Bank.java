import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    //  Add a new branch
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch added: " + branchName);
            return true;
        }
        System.out.println("Branch already exists: " + branchName);
        return false;
    }

    //  Add a new customer to a branch
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }
        System.out.println("Branch not found: " + branchName);
        return false;
    }

    // Add transaction to an existing customer
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }
        System.out.println("Branch not found: " + branchName);
        return false;
    }

    // Find a branch by name
    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }
        return null;
    }

    // List customers and their transactions
    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("\nCustomer details for branch: " + branch.getName());
            System.out.println("---------------------------------");

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer customer = branchCustomers.get(i);
                System.out.println("[" + (i + 1) + "] Customer: " + customer.getName());

                if (showTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("   [" + (j + 1) + "] Amount: $" + transactions.get(j));
                    }
                }
                System.out.println("---------------------------------");
            }
            return true;
        }

        System.out.println("Branch not found: " + branchName);
        return false;
    }
}
