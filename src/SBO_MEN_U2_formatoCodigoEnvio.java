import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U2_formatoCodigoEnvio {

	@Test
	void validarFormatoCodigoEnvio() {
		boolean formato = Envio.codigoEnvio.matches("^[A-Z0-9]+");
		
		assertEquals(true, formato);
	}

}
