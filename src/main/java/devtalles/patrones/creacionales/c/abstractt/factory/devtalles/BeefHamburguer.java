package devtalles.patrones.creacionales.c.abstractt.factory.devtalles;

public class BeefHamburguer implements Hamburguer {
    @Override
    public void prepare() {
        System.out.println("Beef Hamburguer en preparacion...");
    }
}
