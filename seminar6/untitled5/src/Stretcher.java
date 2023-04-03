public class Stretcher extends HospitalStaff {
    public Stretcher(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println("Moving patients on stretchers");
    }
}
