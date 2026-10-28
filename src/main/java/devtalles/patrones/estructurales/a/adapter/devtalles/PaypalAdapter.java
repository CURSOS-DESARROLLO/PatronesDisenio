package devtalles.patrones.estructurales.a.adapter.devtalles;

public class PaypalAdapter implements IPaymentProcessor {
    private PaypalService service;

    public PaypalAdapter(PaypalService service) {
        this.service = service;
    }

    @Override
    public void processPayment(double amount) {
        this.service.sendPayment(amount);
    }
}
