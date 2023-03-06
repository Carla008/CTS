public class Vehicle {
    private String maker;
    private String model;
    private int year;
    private int mileage;

    // Constructor
    public Vehicle(String maker, String model, int year, int mileage) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public Vehicle() {

    }

    // Getters and setters
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Other methods related to the state of a vehicle
    // ...
}
