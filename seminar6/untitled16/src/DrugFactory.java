public class DrugFactory {
    public static Drug createDrug(String name, double price, DrugCategory category) {
        switch (category) {
            case COLD:
                return new ColdDrug(name, price);
            case PAIN:
                return new PainDrug(name, price);
            case BODY:
                return new BodyDrug(name, price);
            default:
                throw new IllegalArgumentException("Invalid drug category");
        }
    }
}
