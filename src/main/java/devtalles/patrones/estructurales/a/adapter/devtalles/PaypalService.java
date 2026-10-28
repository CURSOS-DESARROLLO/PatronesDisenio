package devtalles.patrones.estructurales.a.adapter.devtalles;

public class PaypalService {
    public void sendPayment(double amount) {
        System.out.println(String.format("Procesando el pago de %.2f con PayPal", amount));
    }
}
