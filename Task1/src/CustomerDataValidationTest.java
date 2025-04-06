import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerDataValidationTest {

    @Test
    public void testValidCustomerData() {
        assertDoesNotThrow(() -> new Customer("C001", "Alice", "705-987-6543"));
    }

    @Test
    public void testInvalidCustomerId() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("", "Alice", "705-987-6543"));
        assertThrows(IllegalArgumentException.class, () -> new Customer(null, "Alice", "705-987-6543"));
    }

    @Test
    public void testInvalidName() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("C001", "", "705-987-6543"));
        assertThrows(IllegalArgumentException.class, () -> new Customer("C001", null, "705-987-6543"));
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("C001", "Alice", ""));
        assertThrows(IllegalArgumentException.class, () -> new Customer("C001", "Alice", null));
    }
}
