package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.SortedSet;
import java.util.TreeSet;

public abstract class GeneradorNumero {

    protected SortedSet<String> lineas = new TreeSet<String>();

    public boolean agregarNumero(String str) {
        return this.lineas.add(str);
    }

    public SortedSet<String> getLineas() {
        return this.lineas;
    }

    public void setLineas(SortedSet<String> lineas) {
        this.lineas = lineas;
    }

    public abstract String obtenerNumeroLibre();
}
