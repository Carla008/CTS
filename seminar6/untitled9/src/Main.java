import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Admission admission = Admission.getInstance();

        Patient patient1 = new Patient("John", 35, 2);
        admission.admitPatient(patient1);

        Patient patient2 = new Patient("Mary", 45, 3);
        admission.admitPatient(patient2);

        Patient patient3 = new Patient("David", 50, 1);
        admission.admitPatient(patient3);
    }
}
