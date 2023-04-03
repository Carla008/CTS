import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // create a booking with window seating and personalized music
        Booking booking = new Booking.Builder(1, LocalDateTime.now())
                .windowSeating(true)
                .personalizedMusic(true)
                .musicGenre("Jazz")
                .build();

        System.out.println("Table Number: " + booking.getTableNumber());
        System.out.println("Reservation Time: " + booking.getReservationTime());
        System.out.println("Window Seating: " + booking.hasWindowSeating());
        System.out.println("Ergonomic Chairs: " + booking.hasErgonomicChairs());
        System.out.println("Table Decoration: " + booking.hasTableDecoration());
        System.out.println("Personalized Music: " + booking.hasPersonalizedMusic());
        System.out.println("Music Genre: " + booking.getMusicGenre());


    }
}