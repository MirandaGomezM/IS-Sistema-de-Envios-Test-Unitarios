import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U7_emailCourier {

	@Test
	void validarFormatoMailCourier() {
		boolean formatoMail = Courier.email.matches("^(.+)@(.+)$") && Courier.email.contains(".");
		
		assertEquals(formatoMail, true);
	}

}
