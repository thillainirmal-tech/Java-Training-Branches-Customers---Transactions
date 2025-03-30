import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Add new customer with initial amount
    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialAmount));
            System.out.println("Customer added: " + customerName + " with initial deposit: $" + initialAmount);
            return true;
        }
        System.out.println("Customer already exists: " + customerName);
        return false;
    }

    // Add transaction for an existing customer
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(amount);
            System.out.println("Added transaction for " + customerName + ": $" + amount);
            return true;
        }
        System.out.println("Customer not found: " + customerName);
        return false;
    }

    // Find a customer by name
    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
