package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.Random;

public class GeneradorRandom extends GeneradorNumero {
    
    
    @Override
    public String obtenerNumeroLibre() {
        String linea = new ArrayList<String>(this.lineas)
						.get(new Random().nextInt(this.lineas.size()));
		this.lineas.remove(linea);
		return linea;
    }
}