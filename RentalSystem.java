class RentalSystem {
    private RentalHistory rentalHistory = new RentalHistory();

    public void rentVehicle(Vehicle vehicle, Customer customer, String date, double amount) {
        RentalRecord record = new RentalRecord(vehicle, amount, "RENT");
        rentalHistory.addRecord(record);
    }

    public void returnVehicle(Vehicle vehicle, Customer customer, String date, double extraFees) {
        RentalRecord record = new RentalRecord(vehicle, extraFees, "RETURN");
        rentalHistory.addRecord(record);
    }

    public void displayAvailableVehicles() {
        System.out.println("Available vehicles would be listed here.");
    }
}

// End of Task1.java