class RentalRecord {
    private Vehicle vehicle;
    private double totalAmount;
    private String recordType;

    public RentalRecord(Vehicle vehicle, double totalAmount, String recordType) {
        this.vehicle = vehicle;
        this.totalAmount = totalAmount;
        this.recordType = recordType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getRecordType() {
        return recordType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return recordType + " - " + vehicle.getInfo() + ", Amount: $" + totalAmount;
    }
}