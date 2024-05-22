package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class GeneradorUltimo extends GeneradorNumero {
    
  
    @Override
    public String obtenerNumeroLibre() {
        String linea = this.lineas.last();
		this.lineas.remove(linea);
		return linea;
    }
}