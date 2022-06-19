import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U9_contenidoCodigoPostal {

	@Test
	void validarcontenidoCodigoPostal() {
		boolean formatopostal = Domicilio.codigoPostal.isEmpty();
		
		assertEquals(formatopostal, false);
	}

}
