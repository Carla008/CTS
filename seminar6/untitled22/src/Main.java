public class Main {
    public static void main(String[] args) {
        CreditFactory factory = new PersonalLoanFactory();
        Credit personalLoan = factory.createCredit();
        personalLoan.displayInfo();
        factory = new MortgageFactory();
        Credit mortgage = factory.createCredit();
        mortgage.displayInfo();
    }

    }
