public class HealthInsuranceAdmissionFactory implements AdmissionFactory {
    public Admission createAdmission() {
        return new HealthInsuranceAdmission();
    }
}
