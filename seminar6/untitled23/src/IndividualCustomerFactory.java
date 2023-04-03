// IndividualCustomerFactory concrete factory class
public class IndividualCustomerFactory implements CustomerFactory {
    public Customer createCustomer() {
        return new IndividualCustomer();
    }
}
