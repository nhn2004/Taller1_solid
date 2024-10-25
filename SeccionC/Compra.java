package SeccionC;

public class Compra {
    private Cobro cobro;
    private Facturacion facturacion;
    private Impuestos impuestos;

    public Compra(Cobro cobro, Facturacion facturacion, Impuestos impuestos) {
        this.cobro = cobro;
        this.facturacion = facturacion;
        this.impuestos = impuestos;
    }

    public void realizarCompra(double monto){
        impuestos.calcularImpuestoFactura();
        cobro.realizarCobro(monto);
        facturacion.generarFactura();
    }
}
