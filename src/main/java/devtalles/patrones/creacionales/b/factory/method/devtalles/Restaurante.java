package devtalles.patrones.creacionales.b.factory.method.devtalles;

/**
 * Creador abstracto: declara el método fábrica y la lógica que lo usa.
 */
public abstract class Restaurante {
    protected abstract Hamburguer crearHamburguer();

    public void orderHamburguer() {
        Hamburguer hamburguer = this.crearHamburguer();
        hamburguer.prepare();
    }
}
