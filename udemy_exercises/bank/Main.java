public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Dallas");
        bank.addBranch("Chicago");

        bank.addCustomer("Dallas", "Jim", 200);
        bank.addCustomer("Dallas", "Jimmy", 200.99);
        bank.addCustomer("Dallas", "Jimbo", 2200);

        bank.addCustomer("Chicago", "Rufus", 2000);
        bank.addCustomer("Chicago", "James", 200.0);
        bank.addCustomer("Chicago", "Rudolph", 2000.45);

        bank.addCustomerTrans("Dallas", "Jim", 2000);
        bank.addCustomerTrans("Dallas", "Jim", 50);
        bank.addCustomerTrans("Dallas", "Jim", -100);

        bank.addCustomerTrans("Dallas", "Jimmy", 50.88);
        bank.addCustomerTrans("Dallas", "Jimmy", -100.13);

        bank.listCustomers("Dallas", true);
        bank.listCustomers("Chicago", false);

    }
}