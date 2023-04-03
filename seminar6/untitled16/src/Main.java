public class Main {
    public static void main(String[] args) {
        Drug coldDrug = DrugFactory.createDrug("Cold Medicine", 10.0, DrugCategory.COLD);
        Drug painDrug = DrugFactory.createDrug("Painkiller", 5.0, DrugCategory.PAIN);
        Drug bodyDrug = DrugFactory.createDrug("Vitamins", 8.0, DrugCategory.BODY);

    }
}