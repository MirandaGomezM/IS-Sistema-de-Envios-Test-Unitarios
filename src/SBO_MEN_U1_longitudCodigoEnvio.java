import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U1_longitudCodigoEnvio {

	@Test
	void validarLongitudCodigoEnvio() {
		Integer longitud = Envio.codigoEnvio.length();
		assertEquals(longitud, 10);
	}

}
