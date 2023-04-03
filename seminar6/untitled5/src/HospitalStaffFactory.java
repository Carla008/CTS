public class HospitalStaffFactory {
    public HospitalStaff createStaffMember(HospitalStaffType type, String name, int age) {
        switch (type) {
            case Stretcher:
                return new Stretcher(name, age);
            case Assistant:
                return new Assistant(name, age);
            case Doctor:
                return new Doctor(name, age);
            default:
                throw new IllegalArgumentException("Invalid staff member type: " + type);
        }
    }
}
