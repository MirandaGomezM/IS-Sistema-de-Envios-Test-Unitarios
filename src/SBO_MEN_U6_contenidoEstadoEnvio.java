import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U6_contenidoEstadoEnvio {

	@Test
	void validarContenidoEstadoEnvio() {
		boolean estadovacio = Envio.estado.isEmpty();
		
		assertEquals(estadovacio, false);
	}

}
