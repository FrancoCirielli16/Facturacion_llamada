package ar.edu.unlp.info.oo2.facturacion_llamadas;



public class GestorNumerosDisponibles {

	private GeneradorNumero generador = new GeneradorUltimo();
	
	public boolean agregarNumeroTelefono(String str) {
		return this.generador.agregarNumero(str);
	}

	public String obtenerNumeroLibre() {
		return this.generador.obtenerNumeroLibre();
	}

	public void cambiarTipoGenerador(GeneradorNumero generadorNumero) {
		generadorNumero.setLineas(this.generador.getLineas());
		this.generador = generadorNumero;
	}
}
