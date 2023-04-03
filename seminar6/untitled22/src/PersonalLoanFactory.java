public class PersonalLoanFactory implements CreditFactory {
    @Override
    public Credit createCredit() {
        return new PersonalLoan();
    }
}
