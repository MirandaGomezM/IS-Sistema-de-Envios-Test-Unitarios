import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U3_contenidoObservacionEnvio {

	@Test
	void validarContenidoObservaciones() {
		boolean contenido = Envio.observaciones[0].isEmpty();
		assertEquals(contenido, false);
	}

}
