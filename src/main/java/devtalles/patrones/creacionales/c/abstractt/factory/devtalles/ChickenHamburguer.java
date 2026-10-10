package devtalles.patrones.creacionales.c.abstractt.factory.devtalles;

public class ChickenHamburguer implements Hamburguer {
    @Override
    public void prepare() {
        System.out.println("Chicken Hamburguer en preparacion...");
    }
}
