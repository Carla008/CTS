public class Main {
    public static void main(String[] args) {
        // create individual customer using factory
        CustomerFactory individualFactory = new IndividualCustomerFactory();
        Customer individualCustomer = individualFactory.createCustomer();

        // create legal entity customer using factory
        CustomerFactory legalEntityFactory = new LegalEntityCustomerFactory();
        Customer legalEntityCustomer = legalEntityFactory.createCustomer();

        // print information about customers
        System.out.println("Individual customer: " + individualCustomer.getClass().getSimpleName());
        System.out.println("Legal entity customer: " + legalEntityCustomer.getClass().getSimpleName());
    }
}
