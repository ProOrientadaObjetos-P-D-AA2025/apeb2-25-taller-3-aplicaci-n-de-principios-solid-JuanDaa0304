package paquete004;

public abstract class Pago {
    protected double valorPagado;

    public abstract void calcularPago();

    public double obtenerValorPagado() {
        return valorPagado;
    }
}
