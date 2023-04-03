import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create bank
        Bank bank = new Bank();

        // Create customers
        Customer john = new Customer("John", "john@example.com");
        Customer mary = new Customer("Mary", "mary@example.com");

        // Add customers to bank
        bank.addCustomer(john);
        bank.addCustomer(mary);

        // Create accounts for John
        Account johnSalaryAccount = new Account.AccountBuilder("123456", john, 5000.0)
                .setHasSalary(true)
                .setHasCard(true)
                .setHasInternetBanking(true)
                .build();

        Account johnSavingsAccount = new Account.AccountBuilder("789012", john, 10000.0)
                .setHasCard(true)
                .build();

        // Create account for Mary
        Account maryCurrentAccount = new Account.AccountBuilder("345678", mary, 8000.0)
                .setHasCard(true)
                .setHasInternetBanking(true)
                .build();

        // Add accounts to customers
        john.addAccount(johnSalaryAccount);
        john.addAccount(johnSavingsAccount);
        mary.addAccount(maryCurrentAccount);

        // Print account information
        for (Customer customer : bank.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
            for (Account account : customer.getAccounts()) {
                System.out.println("  Account number: " + account.getAccountNumber());
                System.out.println("  Balance: " + account.getBalance());
                System.out.println("  Has salary: " + account.hasSalary());
                System.out.println("  Has card: " + account.hasCard());
                System.out.println("  Has internet banking: " + account.hasInternetBanking());
            }
            System.out.println();
        }
    }
}
