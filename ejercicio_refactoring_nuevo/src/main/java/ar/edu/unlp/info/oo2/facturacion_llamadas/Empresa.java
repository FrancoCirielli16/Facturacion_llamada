package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();

	

	public boolean agregarNumeroTelefono(String str) {
		return this.guia.agregarNumeroTelefono(str);
	}

	public String obtenerNumeroLibre() {
		return this.guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuarioJuridico(String data, String nombre) {
		Cliente var = new ClienteJuridico(data,nombre,this.obtenerNumeroLibre());
		clientes.add(var);
		return var;
	}

	public Cliente registrarUsuarioFisico(String data, String nombre) {
		Cliente var = new ClienteFisico(data,nombre,this.obtenerNumeroLibre());
		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamadaNacional(Cliente origen, Cliente destino, int duracion) { 
		Llamada llamada = new LlamadaNacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public Llamada registrarLlamadaInternacional(Cliente origen, Cliente destino, int duracion) { 
		Llamada llamada = new LlamadaInternacional(origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		origen.agregarLlamada(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) { 
		Cliente c = this.clientes.stream().filter(x -> x.getNumeroTelefono().equals(cliente.getNumeroTelefono())).findFirst().orElse(null);
		if (c == null) {return 0;}
		return c.calcularMontoTotalLlamadas();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public void cambiarTipoGenerador(GeneradorNumero generadorNumero) {
		this.guia.cambiarTipoGenerador(generadorNumero);
	}
}
