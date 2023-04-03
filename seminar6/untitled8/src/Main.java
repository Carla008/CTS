public class Main {
    public static void main(String[] args) {
        AdmissionFactory factory = new IntermediateAdmissionFactory();
        Admission admission = factory.createAdmission();

        Patient p1 = new Patient(true);
        admission.admitPatient(p1);

        Patient p2 = new Patient(false);
        admission.admitPatient(p2);
    }
}
