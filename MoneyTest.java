import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {



	//Testing that two Money objects are successfully added together
	@Test
	public void simpleAdd() throws Exception {
	    Money m12CAD = new Money(12, "CAD");
	    Money m14CAD = new Money(14, "CAD");
	    Money known = new Money(26, "CAD");

	    Money observed = m12CAD.add(m14CAD);
	    assertTrue(known.equals(observed));
	}


	//Testing that two Money objects are successfully added together
	@Test
	public void applyInterest() throws Exception {
		Money money1= new Money(1000, "CAD");
		Money known= new Money(1100, "CAD");
		money1.applyInterest(0.1);
		assertEquals(known.getAmount(), money1.getAmount(), "Interest is applied incorrectly");
	}



	//testing that exception is thrown correctly
	@Test
	public void testNegativeMoneyValue() throws Exception {
	    Money m12CAD = new Money(12, "CAD");
	    Money mNegativeCAD = new Money(-14, "CAD");

	    Exception exception = assertThrows(Exception.class, () -> {
	        m12CAD.add(mNegativeCAD);
	    });

	    assertEquals("Money cannot be negative", exception.getMessage());
	}

	@Test
	public void simpleSubtract() throws Exception {
	    Money m1 = new Money(1200, "CAD");
	    Money m2 = new Money(150, "CAD");
	    Money known = new Money(1050, "CAD");

	    Money observed = m1.subtract(m2);
	    assertTrue(known.equals(observed));
	}


}