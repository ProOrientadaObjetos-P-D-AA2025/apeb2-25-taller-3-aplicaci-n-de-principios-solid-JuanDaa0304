package paquete004;


public class PagoLuzElectrica extends Pago {
    private String ciudad;
    private double kilovatiosConsumidos;
    private double costoPorKilovatio;
    private double tarifaBase;

    public PagoLuzElectrica(String ciudad, double kilovatiosConsumidos, double costoPorKilovatio, double tarifaBase) {
        this.ciudad = ciudad;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoPorKilovatio = costoPorKilovatio;
        this.tarifaBase = tarifaBase;
    }

    @Override
    public void calcularPago() {
        if (ciudad.equalsIgnoreCase("Loja")) {
            valorPagado = tarifaBase + (kilovatiosConsumidos * costoPorKilovatio / 2);
        } else {
            valorPagado = tarifaBase + (kilovatiosConsumidos * costoPorKilovatio);
        }
    }
}
