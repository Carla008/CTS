public class HealthInsuranceAdmission implements Admission {
    public void admitPatient(Patient patient) {
        if (patient.hasHealthInsurance()) {
            System.out.println("Admitting patient with health insurance...");
        } else {
            System.out.println("Rejecting patient without health insurance...");
        }
    }
}
