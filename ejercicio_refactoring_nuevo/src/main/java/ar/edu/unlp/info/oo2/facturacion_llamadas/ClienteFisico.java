package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente{
    private String dni;
    static double descuentoFis = 0;
    public ClienteFisico(String data, String nombre, String numeroTelefono) {
        super(nombre, numeroTelefono);
        this.dni = data;
    }
    public double getDescuento() {
        return descuentoFis;
    }
}