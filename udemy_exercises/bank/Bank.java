import java.util.ArrayList;

public class Bank {
  private ArrayList<Branch> branches;
  private String name;

  public Bank(String name) {
    this.name = name;
    this.branches = new ArrayList<Branch>();
  }

  public void addBranch(String branchName) {
    this.branches.add(new Branch(branchName));
  }

  public boolean addCustomer(String branchName, String customerName, double initialAmount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.newCustomer(customerName, initialAmount);
    }
    return false;
  }

  public boolean addCustomerTrans(String branchName, String customerName, double amount) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.addCustomerTransaction(customerName, amount);
    }
    return false;
  }

  private Branch findBranch(String name) {
    for (int i = 0; i < this.branches.size(); i++) {
      Branch branch = this.branches.get(i);
      if (branch.getName().equals(name)) {
        return branch;
      }
    }
    return null;
  }

  public boolean listCustomers(String branchName, boolean showTransactions) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      System.out.println("The Customers for branch " + branch.getName() + "-");
      ArrayList<Customer> branchCustomers = branch.getCustomers();
      for (Customer i : branchCustomers) {
        Customer eachCustomer = i;
        System.out.println("Customer: " + eachCustomer.getName());
        if (showTransactions) {
          ArrayList<Double> transactions = eachCustomer.getTransactions();
          System.out.println("Transactions: ");
          for (Double j : transactions) {
            System.out.println("$" + j);
          }
        }
      }
      return true;
    }
    return false;
  }
}

/*
**Banking w/ Java Classes**
   - **Bank class**
      - List of Branches
      - Add a new branch
      - Add a customer to that branch with initial transaction
      - Add a transaction for an existing customer for that branch
      - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     
*/