final class SportCar extends Car {
    private int horsepower;
    private boolean hasTurbo;

    public SportCar(String licencePlate, String make, String model, int year, int numberOfSeats,
                    int horsepower, boolean hasTurbo) {
        super(licencePlate, make, model, year, numberOfSeats);
        this.horsepower = horsepower;
        this.hasTurbo = hasTurbo;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", HP: " + horsepower + (hasTurbo ? " (Turbo)" : "");
    }
}
