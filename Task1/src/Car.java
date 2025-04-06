// Jemima Ali

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String licencePlate, String make, String model, int year, int numberOfSeats) {
        super(licencePlate, make, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Seats: " + numberOfSeats;
    }
}
