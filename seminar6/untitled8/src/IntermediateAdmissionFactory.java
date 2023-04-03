public class IntermediateAdmissionFactory implements AdmissionFactory {
    public Admission createAdmission() {
        return new IntermediateAdmission(new HealthInsuranceAdmissionFactory());
    }
}
