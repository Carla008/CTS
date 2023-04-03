import java.util.ArrayList;
import java.util.List;

public class Admission {
    private static Admission instance;

    private List<Room> rooms;

    private Admission() {
        rooms = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));
        }
    }

    public static Admission getInstance() {
        if (instance == null) {
            instance = new Admission();
        }
        return instance;
    }

    public boolean admitPatient(Patient patient) {
        // Analyze difficulty level
        int difficultyLevel = patient.getDifficultyLevel();

        // Check room availability
        Room availableRoom = null;
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                availableRoom = room;
                break;
            }
        }

        // Issue admission form
        if (availableRoom != null) {
            availableRoom.setOccupied(true);
            System.out.println("Admission form issued for " + patient.getName() + " in room " + availableRoom.getRoomNumber());
            return true;
        } else {
            System.out.println("No available rooms for " + patient.getName());
            return false;
        }
    }
}
