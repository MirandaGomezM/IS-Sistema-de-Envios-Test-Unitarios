import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U4_longitudCodigoPostal {

	@Test
	void validarLongitudCodigoPostal() {
		Integer longitud = Domicilio.codigoPostal.length();
		
		assertEquals(longitud, 5);
	}

}
