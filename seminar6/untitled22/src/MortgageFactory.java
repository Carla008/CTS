public class MortgageFactory implements CreditFactory {
    @Override
    public Credit createCredit() {
        return new Mortgage();
    }
}
