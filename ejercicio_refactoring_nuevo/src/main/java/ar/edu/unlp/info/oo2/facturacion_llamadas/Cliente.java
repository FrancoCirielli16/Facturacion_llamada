package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;


public abstract class Cliente {
private List<Llamada> llamadas = new ArrayList<Llamada>();
private String nombre;
private String numeroTelefono;
public Cliente(String nombre, String numeroTelefono) {
    this.setNombre(nombre);
    this.setNumeroTelefono(numeroTelefono);
}


public void agregarLlamada(Llamada nuevaLlamada) { ;
    this.llamadas.add(nuevaLlamada);
}


public double calcularMontoTotalLlamadas() { 
    return this.llamadas.stream().mapToDouble(l ->  {
        double auxc = l.calcularMontoTotalLlamada();
        auxc -= auxc*this.getDescuento();
        return auxc;
    }).sum();
}

public abstract double getDescuento();

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getNumeroTelefono() {
    return numeroTelefono;
}
public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
}
}