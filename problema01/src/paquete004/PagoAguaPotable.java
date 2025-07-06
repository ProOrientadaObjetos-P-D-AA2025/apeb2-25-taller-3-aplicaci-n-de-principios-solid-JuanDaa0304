package paquete004;

public class PagoAguaPotable extends Pago {
    private String tipo; 
    private double tarifaFija;
    private double metrosCubicos;
    private double costoPorMetro;

    public PagoAguaPotable(String tipo, double tarifaFija, double metrosCubicos, double costoPorMetro) {
        this.tipo = tipo;
        this.tarifaFija = tarifaFija;
        this.metrosCubicos = metrosCubicos;
        this.costoPorMetro = costoPorMetro;
    }

    @Override
    public void calcularPago() {
        if (tipo.equals("comercial")) {
            valorPagado = tarifaFija + (metrosCubicos * costoPorMetro) + 15;
        } else {
            valorPagado = tarifaFija + (metrosCubicos * costoPorMetro);
        }
    }
}
