import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U5_formatoCodigoPostal {

	@Test
	void validarFormatoCodigoPostal() {
		boolean formato = Domicilio.codigoPostal.matches("^[0-9]+");
		
		assertEquals(formato, true);
	}

}
