import java.util.ArrayList;
import java.util.List;

class RentalHistory {
    private List<RentalRecord> records = new ArrayList<>();

    public void addRecord(RentalRecord record) {
        records.add(record);
    }

    public List<RentalRecord> getRentalHistory() {
        return records;
    }

    public List<RentalRecord> getRentalRecordsByCustomer(Customer customer) {
        // Placeholder: would filter by customer if linked
        return records;
    }

    public List<RentalRecord> getRentalRecordsByVehicle(String licencePlate) {
        List<RentalRecord> result = new ArrayList<>();
        for (RentalRecord r : records) {
            if (r.getVehicle().getInfo().contains(licencePlate)) {
                result.add(r);
            }
        }
        return result;
    }
}
