package devtalles.patrones.estructurales.a.adapter.devtalles;

public class StripeService {
    public void makeCharge(double amount) {
        System.out.println(String.format("Procesando el pago de %.2f con Stripe", amount));
    }
}
