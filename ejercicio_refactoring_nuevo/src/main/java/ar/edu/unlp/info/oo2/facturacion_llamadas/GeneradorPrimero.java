package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class GeneradorPrimero extends GeneradorNumero {
    
    
    @Override
    public String obtenerNumeroLibre() {
        String linea = this.lineas.first();
		this.lineas.remove(linea);
		return linea;
    }
}