
public class Main {
    public static void main(String[] args) {
        PatientBuilder builder = new PatientBuilder();
        Patient patient1 = builder
                .withName("John")
                .withAge(40)
                .withGender("Male")
                .build();
        System.out.println(patient1);

        Patient patient2 = builder
                .withName("Jane")
                .withAge(30)
                .withGender("Female")
                .withFoldingBed(true)
                .withBreakfastIncluded(true)
                .build();
        System.out.println(patient2);

        Patient patient3 = builder
                .withName("David")
                .withAge(25)
                .withGender("Male")
                .withFoldingBed(true)
                .withBreakfastIncluded(true)
                .withRoomSlippers(true)
                .withIndoorRobe(true)
                .build();
        System.out.println(patient3);
    }
}

