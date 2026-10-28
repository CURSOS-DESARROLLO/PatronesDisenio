package devtalles.patrones.estructurales.a.adapter.devtalles;

public class MercadoPagoService {
    void pay(double amount) {
        System.out.println(String.format("Procesando el pago de %.2f con Mercado Pago", amount));
    }
}
