import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pharmacy {
    private List<Drug> drugs = new ArrayList<>();

    public void addDrug(String name, double price, String category) {
        Drug drug = DrugImpl.create(name, price, category);
        drugs.add(drug);
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public List<Drug> getDrugsByCategory(String category) {
        List<Drug> result = new ArrayList<>();
        for (Drug drug : drugs) {
            if (drug.getCategory().getName().equals(category)) {
                result.add(drug);
            }
        }
        return result;
    }
}
