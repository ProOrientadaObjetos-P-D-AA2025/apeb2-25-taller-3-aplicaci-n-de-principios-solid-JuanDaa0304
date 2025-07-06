package paquete004;

public class PagoTelefonoConvencional extends Pago {
    private double minutosConsumidos;
    private double costoMinuto;
    private double tarifaBase;

    public PagoTelefonoConvencional(double minutosConsumidos, double costoMinuto, double tarifaBase) {
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void calcularPago() {
        valorPagado = tarifaBase + (minutosConsumidos * costoMinuto);
    }
}
