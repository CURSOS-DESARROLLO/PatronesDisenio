package devtalles.patrones.estructurales.a.adapter.devtalles;

/**
 * ! Patrón Adapter
 * Permite que objetos con interfaces incompatibles trabajen juntos, también es muy
 * util para utilizar librerías de terceros en nuestra aplicación sin depender
 * directamente de ellas.
 * <p>
 * * Es útil cuando se quiere reutilizar una clase que no tiene la interfaz que
 * * necesitamos o cuando queremos crear una capa de abstracción para una librería
 * * de terceros.
 * <p>
 * https://refactoring.guru/es/design-patterns/adapter
 */

public class Main {
    public static void main(String[] args) {

        // pasar los servicios al adaptador, puede ayudar a pasar instancias configuradas
        makePayment(new PaypalAdapter(new PaypalService()), 300.99);
        makePayment(new StripeAdapter(new StripeService()), 134.56);
        makePayment(new MercadoPagoAdapter(new MercadoPagoService()), 2760.00);
    }

    public static void makePayment(IPaymentProcessor interfaz, double amount) {
        interfaz.processPayment(amount);
    }
}
