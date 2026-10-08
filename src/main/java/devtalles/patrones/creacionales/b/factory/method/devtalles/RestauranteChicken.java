package devtalles.patrones.creacionales.b.factory.method.devtalles;

public class RestauranteChicken extends Restaurante {
    @Override
    public Hamburguer crearHamburguer() {
        return new ChickenHamburguer();
    }
}
