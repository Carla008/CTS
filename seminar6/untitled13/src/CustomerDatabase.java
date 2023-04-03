public class CustomerDatabase {
    private static CustomerDatabase instance = null;

    private CustomerDatabase() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static CustomerDatabase getInstance() {
        if (instance == null) {
            instance = new CustomerDatabase();
        }
        return instance;
    }

    // Other methods for managing the customer database
}
