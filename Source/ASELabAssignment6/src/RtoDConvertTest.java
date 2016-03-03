import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RtoDConvertTest {

	Double R=1.0;
	Double D=1.0;
	
	@Test
	public void testSum() {
		System.out.println("One Rupee Value: " + R + " = " + D);
		assertEquals(R, D);
	}

}