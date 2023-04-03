import java.time.LocalDateTime;

public class Booking {
    private final int tableNumber;
    private final LocalDateTime reservationTime;
    private final boolean windowSeating;
    private final boolean ergonomicChairs;
    private final boolean tableDecoration;
    private final boolean personalizedMusic;
    private final String musicGenre;

    private Booking(Builder builder) {
        this.tableNumber = builder.tableNumber;
        this.reservationTime = builder.reservationTime;
        this.windowSeating = builder.windowSeating;
        this.ergonomicChairs = builder.ergonomicChairs;
        this.tableDecoration = builder.tableDecoration;
        this.personalizedMusic = builder.personalizedMusic;
        this.musicGenre = builder.musicGenre;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public boolean hasWindowSeating() {
        return windowSeating;
    }

    public boolean hasErgonomicChairs() {
        return ergonomicChairs;
    }

    public boolean hasTableDecoration() {
        return tableDecoration;
    }

    public boolean hasPersonalizedMusic() {
        return personalizedMusic;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public static class Builder {
        private final int tableNumber;
        private final LocalDateTime reservationTime;
        private boolean windowSeating = false;
        private boolean ergonomicChairs = false;
        private boolean tableDecoration = false;
        private boolean personalizedMusic = false;
        private String musicGenre = "";

        public Builder(int tableNumber, LocalDateTime reservationTime) {
            this.tableNumber = tableNumber;
            this.reservationTime = reservationTime;
        }

        public Builder windowSeating(boolean windowSeating) {
            this.windowSeating = windowSeating;
            return this;
        }

        public Builder ergonomicChairs(boolean ergonomicChairs) {
            this.ergonomicChairs = ergonomicChairs;
            return this;
        }

        public Builder tableDecoration(boolean tableDecoration) {
            this.tableDecoration = tableDecoration;
            return this;
        }

        public Builder personalizedMusic(boolean personalizedMusic) {
            this.personalizedMusic = personalizedMusic;
            return this;
        }

        public Builder musicGenre(String musicGenre) {
            this.musicGenre = musicGenre;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
