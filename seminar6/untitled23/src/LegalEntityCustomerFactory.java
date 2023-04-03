// LegalEntityCustomerFactory concrete factory class
public class LegalEntityCustomerFactory implements CustomerFactory {
    public Customer createCustomer() {
        return new LegalEntityCustomer();
    }
}
