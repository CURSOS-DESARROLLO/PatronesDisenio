package devtalles.patrones.estructurales.a.adapter.devtalles;

public class MercadoPagoAdapter implements IPaymentProcessor {
    private MercadoPagoService service;

    public MercadoPagoAdapter(MercadoPagoService service) {
        this.service = service;
    }

    @Override
    public void processPayment(double amount) {
        this.service.pay(amount);
    }
}
