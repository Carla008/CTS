public class Assistant extends HospitalStaff {
    public Assistant(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuties() {
        System.out.println("Assisting doctors and nurses");
    }
}
