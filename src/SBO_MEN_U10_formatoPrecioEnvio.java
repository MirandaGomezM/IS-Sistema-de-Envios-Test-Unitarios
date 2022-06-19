import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class SBO_MEN_U10_formatoPrecioEnvio {

	@Test
	void validarFormatoPrecio() {
		DecimalFormat  formato1 = new DecimalFormat("#.##");
		
		boolean formatoprecio = Double.parseDouble(formato1.format(Envio.precio)) == Envio.precio;
		
		assertEquals(formatoprecio, true);
	}

}
