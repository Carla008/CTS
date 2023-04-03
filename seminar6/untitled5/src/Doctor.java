public class Doctor extends HospitalStaff {
    public Doctor(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println("Diagnosing and treating patients");
    }
}
