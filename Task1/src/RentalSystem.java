import java.util.ArrayList;
class RentalSystem {
	
	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	private RentalSystem() {
	    // Private constructor to enforce singleton
	}


	public void addCustomer(Customer customer) {
	    customers.add(customer);
	}

	public void addVehicle(Vehicle vehicle) {
	    vehicles.add(vehicle);
	}

	
    private RentalHistory rentalHistory = new RentalHistory();
    
    private static RentalSystem instance;

    public static RentalSystem getInstance() {
        if (instance == null) {
            instance = new RentalSystem();
        }
        return instance;
    }

    public void displayAvailableVehicles() {
        System.out.println("Available vehicles would be listed here.");
    }
    
    public boolean rentVehicle(Vehicle vehicle, Customer customer, String date, double amount) {
        // your logic...
        return true; // or false if failed
    }

    public boolean returnVehicle(Vehicle vehicle, Customer customer, String date, double extraFees) {
        // your logic...
        return true; // or false if failed
    }

}

// End of Task1.java