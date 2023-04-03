public class Account {
    private String accountNumber;
    private Customer customer;
    private double balance;
    private boolean hasSalary;
    private boolean hasCard;
    private boolean hasInternetBanking;

    private Account(AccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.customer = builder.customer;
        this.balance = builder.balance;
        this.hasSalary = builder.hasSalary;
        this.hasCard = builder.hasCard;
        this.hasInternetBanking = builder.hasInternetBanking;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public boolean hasSalary() {
        return hasSalary;
    }

    public boolean hasCard() {
        return hasCard;
    }

    public boolean hasInternetBanking() {
        return hasInternetBanking;
    }

    // Account builder class
    public static class AccountBuilder {
        private String accountNumber;
        private Customer customer;
        private double balance;
        private boolean hasSalary;
        private boolean hasCard;
        private boolean hasInternetBanking;

        public AccountBuilder(String accountNumber, Customer customer, double balance) {
            this.accountNumber = accountNumber;
            this.customer = customer;
            this.balance = balance;
        }

        public AccountBuilder setHasSalary(boolean hasSalary) {
            this.hasSalary = hasSalary;
            return this;
        }

        public AccountBuilder setHasCard(boolean hasCard) {
            this.hasCard = hasCard;
            return this;
        }

        public AccountBuilder setHasInternetBanking(boolean hasInternetBanking) {
            this.hasInternetBanking = hasInternetBanking;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
