import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SBO_MEN_U8_nuevaObservacionEnvio {

	@Test
	void validarNuevasObservaciones() {
		boolean ultimaobs = Envio.observaciones[Envio.observaciones.length-1].isEmpty();
		
		assertEquals(ultimaobs, false);
	}

}
