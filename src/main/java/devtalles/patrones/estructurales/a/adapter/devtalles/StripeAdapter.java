package devtalles.patrones.estructurales.a.adapter.devtalles;

public class StripeAdapter implements IPaymentProcessor {
    private StripeService stripeService;

    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void processPayment(double amount) {
        this.stripeService.makeCharge(amount);
    }
}
