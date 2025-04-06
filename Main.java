public class Main {
    public static void main(String[] args) {
        RentalSystem system = RentalSystem.getInstance();

        // Create and add vehicles
        Vehicle v1 = new Vehicle("AAA111", "Toyota", "Corolla", 2019);
        Vehicle v2 = new Vehicle("BBB222", "Honda", "Civic", 2020);
        system.addVehicle(v1);
        system.addVehicle(v2);

        // Create and add customers
        Customer c1 = new Customer("C01", "Alice", "705-123-4567");
        Customer c2 = new Customer("C02", "Bob", "705-987-6543");
        system.addCustomer(c1);
        system.addCustomer(c2);

        // Simulate a rental
        system.rentVehicle(v1, c1, "2025-04-06", 100.00);

        // Simulate a return
        system.returnVehicle(v1, c1, "2025-04-07", 10.00);

        System.out.println("Subtask 5 test complete!");
    }
}
