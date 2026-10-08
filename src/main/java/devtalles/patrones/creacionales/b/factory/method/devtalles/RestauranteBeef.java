package devtalles.patrones.creacionales.b.factory.method.devtalles;

/**
 * !Creadores concretos: deciden qué producto instanciar.
 */
public class RestauranteBeef extends Restaurante {
    @Override
    public Hamburguer crearHamburguer() {
        return new BeefHamburguer();
    }
}
