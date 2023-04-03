public class IntermediateAdmission implements Admission {
    private Admission nextAdmission;

    public IntermediateAdmission(AdmissionFactory factory) {
        this.nextAdmission = factory.createAdmission();
    }

    public void admitPatient(Patient patient) {
        if (patient.hasHealthInsurance()) {
            System.out.println("Admitting patient with health insurance...");
            this.nextAdmission.admitPatient(patient);
        } else {
            System.out.println("Rejecting patient without health insurance...");
        }
    }
}