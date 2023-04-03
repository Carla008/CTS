public class PatientBuilder {
    private String name;
    private int age;
    private String gender;
    private boolean foldingBed;
    private boolean breakfastIncluded;
    private boolean roomSlippers;
    private boolean indoorRobe;

    public PatientBuilder() {
        // Set default values for optional attributes
        this.foldingBed = false;
        this.breakfastIncluded = false;
        this.roomSlippers = false;
        this.indoorRobe = false;
    }

    public PatientBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PatientBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PatientBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PatientBuilder withFoldingBed(boolean foldingBed) {
        this.foldingBed = foldingBed;
        return this;
    }

    public PatientBuilder withBreakfastIncluded(boolean breakfastIncluded) {
        this.breakfastIncluded = breakfastIncluded;
        return this;
    }

    public PatientBuilder withRoomSlippers(boolean roomSlippers) {
        this.roomSlippers = roomSlippers;
        return this;
    }

    public PatientBuilder withIndoorRobe(boolean indoorRobe) {
        this.indoorRobe = indoorRobe;
        return this;
    }

    public Patient build() {
        return new Patient(name, age, gender, foldingBed, breakfastIncluded, roomSlippers, indoorRobe);
    }
}
