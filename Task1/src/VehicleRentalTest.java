import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


    public class VehicleRentalTest {

        @Test
        public void testLicensePlateValidation() {
            // ✅ Valid plates
            assertDoesNotThrow(() -> new Vehicle("AAA100", "Toyota", "Corolla", 2019));
            assertDoesNotThrow(() -> new Vehicle("ABC567", "Honda", "Civic", 2020));
            assertDoesNotThrow(() -> new Vehicle("ZZZ999", "Ford", "Focus", 2024));

            // ❌ Invalid plates
            assertThrows(IllegalArgumentException.class, () -> new Vehicle("", "Toyota", "Corolla", 2019));
            assertThrows(IllegalArgumentException.class, () -> new Vehicle(null, "Toyota", "Corolla", 2019));
            assertThrows(IllegalArgumentException.class, () -> new Vehicle("AAA1000", "Toyota", "Corolla", 2019));
            assertThrows(IllegalArgumentException.class, () -> new Vehicle("ZZZ99", "Toyota", "Corolla", 2019));
        }
        
        @Test
        public void testRentAndReturnVehicle() {
            RentalSystem system = RentalSystem.getInstance();
            Vehicle v1 = new Vehicle("XYZ123", "Mazda", "3", 2020);
            Customer c1 = new Customer("001", "Sam", "555-1234");

            system.addVehicle(v1);
            system.addCustomer(c1);

            // Rent the vehicle
            assertTrue(system.rentVehicle(v1, c1, "2025-04-06", 100.0));

            // Try renting again (should fail if logic prevents double-rent)
            // For now it will return true unless you add double-rent protection

            // Return the vehicle
            assertTrue(system.returnVehicle(v1, c1, "2025-04-07", 10.0));

            // Try returning again (should fail)
            // Same note as above — can return true if logic doesn't track rented status
        }


}
    
   //Subtask 2: Test for rent and return functionality 

