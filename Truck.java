class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String licencePlate, String make, String model, int year, double cargoCapacity) {
        super(licencePlate, make, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Cargo Capacity: " + cargoCapacity + " tons";
    }
}
