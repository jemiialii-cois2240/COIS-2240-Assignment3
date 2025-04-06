// Jemima Ali

public class Customer {
    private String customerId;
    private String name;
    private String phoneNumber;

    public Customer(String customerId, String name, String phoneNumber) {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be empty.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty.");
        }

        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " (ID: " + customerId + ", Phone: " + phoneNumber + ")";
    }
}
