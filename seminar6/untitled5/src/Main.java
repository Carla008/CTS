public class Main {
    public static void main(String[] args) {
        HospitalStaffFactory factory = new HospitalStaffFactory();
        HospitalStaff stretcher = factory.createStaffMember(HospitalStaffType.Stretcher, "John", 25);
        HospitalStaff assistant = factory.createStaffMember(HospitalStaffType.Assistant, "Mary", 30);
        HospitalStaff doctor = factory.createStaffMember(HospitalStaffType.Doctor, "Bob", 40);

        stretcher.performDuties();
        assistant.performDuties();
        doctor.performDuties();

    }
}