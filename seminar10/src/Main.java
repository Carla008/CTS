import java.util.ArrayList;

class BankAccount {
    private double amount;
    private boolean blocked;
    private String currency;
    private String ibanCode;

    public BankAccount() {
        this.amount = 0;
        this.blocked = false;
        this.currency = "";
        this.ibanCode = "";
    }

    public BankAccount(String ibanCode, String currency, double amount,boolean blocked) {
        this.ibanCode = ibanCode;
        this.currency = currency;
        this.amount = amount;
        this.blocked=blocked;
    }

    public void block() {
        this.blocked = true;
    }

    public void unblock() {
        this.blocked = false;
    }

    public String getIbanCode() {
        return ibanCode;
    }

    public void setIbanCode(String ibanCode) {
        this.ibanCode = ibanCode;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
class Client {
    private String id;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Client() {
        this.id = "";
        this.name = "";
        this.accounts = new ArrayList<>();
    }

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Bank {
    private String name;
    private String address;
    private String swiftCode;
    private ArrayList<Client> clients;

    public Bank() {
        this.name = "";
        this.address = "";
        this.swiftCode = "";
        this.clients = new ArrayList<>();
    }

    public Bank(String name, String address, String swiftCode) {
        this.name = name;
        this.address = address;
        this.swiftCode = swiftCode;
        this.clients = new ArrayList<>();
    }
    public void addClient(Client client) {
        clients.add(client);
    }
    public Client getClientByCNP(String cnp) {
        for (Client client : clients) {
            if (client.getId().equals(cnp)) {
                return client;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class BankTest {
    private Bank bank;

    public BankTest() {
        bank = new Bank();
    }

    public void setName(String name) {
        bank.setName(name);
    }

    public void setSwiftCode(String swiftCode) {
        bank.setSwiftCode(swiftCode);
    }

    public void setAddress(String address) {
        bank.setAddress(address);
    }

    public void setUp() {
        // Set up test data
        Client client1 = new Client("123456789", "John Doe");
        Client client2 = new Client("987654321", "Jane Doe");

        BankAccount account1 = new BankAccount("DE1234567890", "EUR", 1000,false);
        BankAccount account2 = new BankAccount("DE0987654321", "EUR", 2000,true);

        client1.addAccount(account1);
        client2.addAccount(account2);

        bank.addClient(client1);
        bank.addClient(client2);
    }

    public void tearDown() {
        bank = new Bank();
    }
    public Bank getBank() {
        return bank;
    }
}
public class Main {
    public static void main(String[] args) {
        BankTest bankTest = new BankTest();
        bankTest.setUp();
        Bank bank = bankTest.getBank();
        Client client = bank.getClientByCNP("123456789");
        if (client != null) {
            System.out.println("Client name: " + client.getName());
            System.out.println("Client ID: " + client.getId());
        } else {
            System.out.println("Client not found.");
        }
        bankTest.tearDown();
    }
}