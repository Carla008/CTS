public class Patient {
    private String name;
    private int age;
    private String gender;
    private boolean foldingBed;
    private boolean breakfastIncluded;
    private boolean roomSlippers;
    private boolean indoorRobe;

    public Patient(String name, int age, String gender, boolean foldingBed, boolean breakfastIncluded,
                   boolean roomSlippers, boolean indoorRobe) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.foldingBed = foldingBed;
        this.breakfastIncluded = breakfastIncluded;
        this.roomSlippers = roomSlippers;
        this.indoorRobe = indoorRobe;
    }

    // Override the toString method to display patient attributes
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", foldingBed=" + foldingBed +
                ", breakfastIncluded=" + breakfastIncluded +
                ", roomSlippers=" + roomSlippers +
                ", indoorRobe=" + indoorRobe +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean hasFoldingBed() {
        return foldingBed;
    }

    public boolean hasBreakfastIncluded() {
        return breakfastIncluded;
    }

    public boolean hasRoomSlippers() {
        return roomSlippers;
    }

    public boolean hasIndoorRobe() {
        return indoorRobe;
    }
}
