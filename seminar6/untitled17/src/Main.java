import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        pharmacy.addDrug("Aspirin", 1.99, "Pain");
        pharmacy.addDrug("Tylenol", 3.99, "Pain");
        pharmacy.addDrug("Benadryl", 5.99, "Cold");
        pharmacy.addDrug("Claritin", 7.99, "Cold");
        pharmacy.addDrug("Ibuprofen", 2.99, "Pain");
        pharmacy.addDrug("Pepto Bismol", 6.99, "Body");

        System.out.println("All drugs:");
        for (Drug drug : pharmacy.getDrugs()) {
            System.out.println(drug.getName() + " (" + drug.getCategory().getName() + "): " + drug.getPrice());
        }

        System.out.println("\nCold drugs:");
        for (Drug drug : pharmacy.getDrugsByCategory("Cold")) {
            System.out.println(drug.getName() + ": " + drug.getPrice());
        }

        System.out.println("\nPain drugs:");
        for (Drug drug : pharmacy.getDrugsByCategory("Pain")) {
            System.out.println(drug.getName() + ": " + drug.getPrice());
        }
    }
}
