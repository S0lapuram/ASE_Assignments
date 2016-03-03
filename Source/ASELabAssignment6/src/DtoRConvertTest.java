import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DtoRConvertTest {

	Double R=1.0;
	Double D=67.45;
	
	@Test
	public void testSum() {
		System.out.println("One Rupee Value: " + R + " = " + D);
		assertEquals(R, D);
	}

}